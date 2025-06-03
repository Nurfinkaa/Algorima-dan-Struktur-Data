package minggu14.tugaspraktikum;
public class BinaryTree20 {
    Node20 root;

    public BinaryTree20() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    // Menambahkan mahasiswa secara non-rekursif
    public void add(Mahasiswa20 mahasiswa) {
        Node20 newNode = new Node20(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node20 current = root;
            Node20 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    // Menambahkan mahasiswa secara rekursif
    public void addRekursif(Mahasiswa20 mahasiswa) {
        root = addRekursif(root, mahasiswa);
    }

    private Node20 addRekursif(Node20 current, Mahasiswa20 mahasiswa) {
        if (current == null) {
            return new Node20(mahasiswa);
        }

        if (mahasiswa.ipk < current.mahasiswa.ipk) {
            current.left = addRekursif(current.left, mahasiswa);
        } else if (mahasiswa.ipk > current.mahasiswa.ipk) {
            current.right = addRekursif(current.right, mahasiswa);
        }
        return current;
    }

    // Mencari mahasiswa dengan IPK paling kecil
    public Mahasiswa20 cariMinIPK() {
        return cariMinIPK(root);
    }

    private Mahasiswa20 cariMinIPK(Node20 current) {
        return current.left == null ? current.mahasiswa : cariMinIPK(current.left);
    }

    // Mencari mahasiswa dengan IPK paling besar
    public Mahasiswa20 cariMaxIPK() {
        return cariMaxIPK(root);
    }

    private Mahasiswa20 cariMaxIPK(Node20 current) {
        return current.right == null ? current.mahasiswa : cariMaxIPK(current.right);
    }

    // Menampilkan mahasiswa dengan IPK di atas batas tertentu
    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        tampilMahasiswaIPKdiAtas(root, ipkBatas);
    }

    private void tampilMahasiswaIPKdiAtas(Node20 current, double ipkBatas) {
        if (current != null) {
            if (current.mahasiswa.ipk > ipkBatas) {
                current.mahasiswa.tampilInformasi();
            }
            tampilMahasiswaIPKdiAtas(current.left, ipkBatas);
            tampilMahasiswaIPKdiAtas(current.right, ipkBatas);
        }
    }

    // Metode pencarian dan traversal lainnya tetap dipertahankan
    boolean find(double ipk) {
        boolean result = false;
        Node20 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node20 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node20 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node20 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node20 getSuccessor(Node20 del) {
        Node20 successor = del.right;
        Node20 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }

        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary Tree kosong");
            return;
        }

        // cari node (current) yang ingin dihapus
        Node20 parent = root;
        Node20 current = root;
        boolean isLeftChild = false;

        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        // penghapusan
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) { 
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) { 
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node20 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }
}

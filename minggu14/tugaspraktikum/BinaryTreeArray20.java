package minggu14.tugaspraktikum;
public class BinaryTreeArray20 {
    Mahasiswa20[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray20() {
        dataMahasiswa = new Mahasiswa20[10];
        idxLast = -1;
    }

    void populateData(Mahasiswa20 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    // Menambahkan data mahasiswa ke dalam binary tree
    public void add(Mahasiswa20 mahasiswa) {
        if (idxLast + 1 < dataMahasiswa.length) {
            dataMahasiswa[++idxLast] = mahasiswa;
        } else {
            System.out.println("Array sudah penuh, tidak bisa menambahkan data.");
        }
    }

    // Traversal InOrder
    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1); // Kiri
                dataMahasiswa[idxStart].tampilInformasi(); // Akar
                traverseInOrder(2 * idxStart + 2); // Kanan
            }
        }
    }

    // Traversal PreOrder
    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi(); // Akar
                traversePreOrder(2 * idxStart + 1); // Kiri
                traversePreOrder(2 * idxStart + 2); // Kanan
            }
        }
    }
}
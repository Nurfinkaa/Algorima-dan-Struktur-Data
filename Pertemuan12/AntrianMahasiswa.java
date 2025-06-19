package Pertemuan12;
public class AntrianMahasiswa {
    Node front, rear;
    int size = 0;
    int kapasitas; 

    public AntrianMahasiswa(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size >= kapasitas;
    }

    public void enqueue(Mahasiswa data) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }

        Node baru = new Node(data);
        if (isEmpty()) {
            front = rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }
        size++;
        System.out.println("Mahasiswa berhasil masuk antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Memanggil mahasiswa : ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        front.data.tampilInformasi();
        front = front.next;
        size--;

        if (isEmpty()) {
            rear = null;
        }
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void peekFront() {
        if (!isEmpty()) {
            System.out.println("Mahasiswa Antrian Terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            front.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong!");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Mahasiswa dalam Antrian terakhir");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            rear.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong!");
        }
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println("Daftar Antrian Mahasiswa:");
        Node current = front;
        while (current != null) {
            current.data.tampilInformasi();
            current = current.next;
        }
    }

    public int getSize() {
        return size;
    }
}

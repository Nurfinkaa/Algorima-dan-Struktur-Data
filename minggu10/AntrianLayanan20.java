package minggu10;
public class AntrianLayanan20 {
    Mahasiswa20[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianLayanan20(int max) {
        this.max = max;
        this.data = new Mahasiswa20[max];
        this.size = 0;
        this.front = 0;
        this.rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    //public void peek() {
    //    if (!IsEmpty()) {
    //        System.out.println("Elemen terdepan: " + data [front]);
    //    } else {
    //        System.out.println("Queue masih kosong");
    //    }
    //}

    //public void print() {
    //    if (IsEmpty()) {
    //        System.out.println("Queue masih kosong");
    //    } else {
    //        int i = front;
    //        while (i != rear) {
    //            System.out.print(data[i] + " ");
    //            i = (i + 1)% max;
    //        }
    //        System.out.println(data[i] + " ");
    //        System.out.println("Jumlah elemet = " + size); 
    //    }
    //}

    //public void clear() {
    //    if (!IsEmpty()) {
    //        front = rear = -1;
    //        size = 0;
    //        System.out.println("Queue berhasil dikosongkan");
    //    } else {
    //        System.out.println("Queue masih kosong");
    //    }
   // }

    //public void Enqueue(Mahasiswa20 mhs) {
    //    if (IsFull()) {
    //        System.out.println("Queue sudah penuh");
    //    } else {
    //        if (IsEmpty()) {
    //            front = rear = 0;
    //        } else {
    //            if (rear == max - 1) {
    //                rear = 0;
    //            } else {
    //                rear++;
    //            }
    //       }
    //       data[rear] = mhs; 
    //        size++;
    //    }
    //}
    

    //public Mahasiswa20 Dequeue() {
    //    Mahasiswa20 dt = null;
    //    if (IsEmpty()) {
    //        System.out.println("Queue masih kosong");
    //    } else {
    //         dt = data [front];
    //         size --;
    //         if (IsEmpty()) {
    //            front = rear = -1;
    //         } else {
    //            if (front == max -1) {
    //                front = 0;
    //            } else {
    //                front ++;
    //            }
    //         }
    //    }
    //    return dt;
    //}

    public void tambahAntrian(Mahasiswa20 mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh, tidak dapat menambahkan mahasiswa.");
            return;
        } 
        rear = (rear + 1) % max;
        data [rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    public Mahasiswa20 layaniMahasiswa() {
        if (IsEmpty()) {
            System.out.println("Antrian Kosong,");
            return null;
        }
        Mahasiswa20 mhs = data [front];
        front = (front + 1 ) % max ;
        size-- ;
        return mhs;
    }

    public void lihatTerdepan() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        } 
        System.out.println("Daftar Mahasiswa dalam Antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++){
            int index = (front + i) % max;
            System.out.print((i+1) + ". ");
            data[index].tampilkanData();;
        }
    }

    public int getJumlahAntrian(){
        return size;
    }

    public void lihatAkhir() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Mahasiswa dalam Antrian terakhir");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }
}
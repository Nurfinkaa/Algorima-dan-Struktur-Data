package minggu7;
public class MahasiswaBerprestasi20 {
    Mahasiswa20 [] listMhs = new Mahasiswa20 [5];
    int idx;

    void tambah (Mahasiswa20 m){
        if (idx<listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil(){
        for (Mahasiswa20 m:listMhs){
            m.tampilInfomasi();
            System.out.println("-------------------------------------");
        }
    }

    void bubbleSort(){
        for (int i = 0; i < listMhs.length - 1; i++){
            for (int j = 1; j < listMhs.length - i; j++){
                if (listMhs[j].ipk > listMhs[j - 1].ipk){
                    Mahasiswa20 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa20 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa20 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    } 

    //mulai dari sini jobsheet6
    int sequentialSearching (double cari){
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++){
            if (listMhs[j].ipk == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos){
        if (pos!=1){
            System.out.println("data mahasiswa dengan IPK "+x+" berada di posisi ke "+pos);
        } else {
            System.out.println("data "+x+" tidak ditemukan");
        }
    }

    void tampilDataSearch (double x, int pos){
        if (pos != -1) {
            System.out.println("nim\t : " +listMhs[pos].nim);
            System.out.println("nama\t : " +listMhs[pos].nama);
            System.out.println("kelas\t : " +listMhs[pos].kelas);
            System.out.println("ipk\t : " +listMhs[pos].ipk);
            System.out.println("================================");
        } else {
            System.out.println("data mahasiswa dengan IPK "+x+" tidak ditemukan");
        }
    }

    int findBinarySearch(double cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMhs[mid].ipk) {
                return mid;
            } else if (listMhs[mid].ipk < cari) {
                return findBinarySearch(cari, left, mid - 1); 
            } else {
                return findBinarySearch(cari, mid + 1, right); 
            }
        }
        return -1;
    }    
}
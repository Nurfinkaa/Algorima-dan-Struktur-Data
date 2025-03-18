package minggu6;
public class DataDosen20 {
    Dosen20[] dataDosen = new Dosen20[10];
    int idx;

    // Metode untuk menambah data dosen
    void tambah(Dosen20 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh!");
        }
    }

    // Metode untuk menampilkan data dosen
    void tampil() {
        if (idx == 0) {
            System.out.println("Tidak ada data dosen.");
            return;
        }
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
            System.out.println();
        }
    }

    // Metode untuk mengurutkan data dosen secara ascending (ASC)
    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) { 
                    Dosen20 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    // Metode untuk mengurutkan data dosen secara descending (DSC)
    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (dataDosen[j].usia < dataDosen[j + 1].usia) { 
                    Dosen20 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }
}
package minggu7;
public class DataDosen20 {
    Dosen20[] dataDosen = new Dosen20[10];
    int idx;

    void tambah(Dosen20 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh!");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Tidak ada data dosen.");
            return;
        }
        for (int i = 0; i < idx; i++) {
            System.out.println("Posisi ke-" + i);
            dataDosen[i].tampil();
            System.out.println();
        }
    }

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


    void PencarianDataSequential(String nama) {
        boolean found = false;
        int count = 0;
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(nama)) {
                System.out.println("Data dosen dengan nama dosen "+ nama +" berada di posisi ke-" + i);
                dataDosen[i].tampil();
                found = true;
                count++;
            }
        }
        if (!found) {
            System.out.println("Data dosen dengan nama " + nama + " tidak ditemukan.");
        } else if (count > 1) {
            System.out.println("Peringatan: Terdapat lebih dari satu dosen dengan nama " + nama + ".");
        }
    }

    void PencarianDataBinary(int usia) { 
        sortingASC();
        int left = 0, right = idx - 1;
        boolean found = false;
        int count = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (dataDosen[mid].usia == usia) {
                int i = mid;
                while (i >= left && dataDosen[i].usia == usia) {
                    System.out.println("Data dosen dengan usia dosen "+ usia +" berada di posisi ke-" + i);
                    dataDosen[i].tampil();
                    System.out.println("Usia: " + dataDosen[i].usia);
                    found = true;
                    count++;
                    i--;
                }
                i = mid + 1;
                while (i <= right && dataDosen[i].usia == usia) {
                    System.out.println("Data dosen dengan usia dosen "+ usia +" berada di posisi ke-" + i);
                    dataDosen[i].tampil();
                    System.out.println("Usia: " + dataDosen[i].usia);
                    found = true;
                    count++;
                    i++;
                }
                break;
            } else if (dataDosen[mid].usia < usia) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Data dosen dengan usia " + usia + " tidak ditemukan.");
        } else if (count > 1) {
            System.out.println("Peringatan: Terdapat lebih dari satu dosen dengan usia " + usia + ".");
        }
    }
}

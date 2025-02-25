package minggu3;
public class DataDosen {
    
    public static void dataSemuaDosen(Dosen20[] arrayOfDosen) {
        System.out.println("\n=== Data Semua Dosen ===");
        for (Dosen20 dosen : arrayOfDosen) {
            dosen.tampilkanInfo();
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen20[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen20 dosen : arrayOfDosen) {
            if (dosen.getJenisKelamin()) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("\n=== Jumlah Dosen Berdasarkan Jenis Kelamin ===");
        System.out.println("Laki-laki : " + pria);
        System.out.println("Perempuan : " + wanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen20[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int countPria = 0, countWanita = 0;

        for (Dosen20 dosen : arrayOfDosen) {
            if (dosen.getJenisKelamin()) {
                totalUsiaPria += dosen.getUsia();
                countPria++;
            } else {
                totalUsiaWanita += dosen.getUsia();
                countWanita++;
            }
        }

        double rataPria = countPria > 0 ? (double) totalUsiaPria / countPria : 0;
        double rataWanita = countWanita > 0 ? (double) totalUsiaWanita / countWanita : 0;

        System.out.println("\n=== Rata-rata Usia Dosen Berdasarkan Jenis Kelamin ===");
        System.out.printf("Laki-laki : %.2f tahun\n", rataPria);
        System.out.printf("Perempuan : %.2f tahun\n", rataWanita);
    }

    public static void infoDosenPalingTua(Dosen20[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;

        Dosen20 tertua = arrayOfDosen[0];
        for (Dosen20 dosen : arrayOfDosen) {
            if (dosen.getUsia() > tertua.getUsia()) {
                tertua = dosen;
            }
        }

        System.out.println("\n=== Dosen Paling Tua ===");
        tertua.tampilkanInfo();
    }

    public static void infoDosenPalingMuda(Dosen20[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;

        Dosen20 termuda = arrayOfDosen[0];
        for (Dosen20 dosen : arrayOfDosen) {
            if (dosen.getUsia() < termuda.getUsia()) {
                termuda = dosen;
            }
        }

        System.out.println("\n=== Dosen Paling Muda ===");
        termuda.tampilkanInfo();
    }
}

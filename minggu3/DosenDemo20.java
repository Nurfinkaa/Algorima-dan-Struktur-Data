package minggu3;
import java.util.Scanner;
public class DosenDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = sc.nextInt();
        sc.nextLine();

        Dosen20[] arrayOfDosen20 = new Dosen20[jumlahDosen];

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("Dosen ke-" + (i + 1) + ":");
            System.out.print("Kode Dosen    : ");
            String kodeDosen = sc.nextLine();
            System.out.print("Nama Dosen    : ");
            String namaDosen = sc.nextLine();
            System.out.print("Jenis Kelamin (true untuk Laki-laki, false untuk Perempuan): ");
            Boolean jenisKelamin = sc.nextBoolean();
            System.out.print("Usia Dosen    : ");
            int usiaDosen = sc.nextInt();
            System.out.println("----------------------------");
            sc.nextLine();

            arrayOfDosen20[i] = new Dosen20(kodeDosen, namaDosen, jenisKelamin, usiaDosen);
        }


        DataDosen.dataSemuaDosen(arrayOfDosen20);
        DataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen20);
        DataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen20);
        DataDosen.infoDosenPalingTua(arrayOfDosen20);
        DataDosen.infoDosenPalingMuda(arrayOfDosen20);

        sc.close();
    }
}

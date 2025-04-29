package minggu9;
import java.util.Scanner;
public class SuratDemo20 {
    public static void main(String[] args) {
        StackSurat20 stack = new StackSurat20(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do{
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir ");
            System.out.println("4. Cari Surat");  
            System.out.print("Pilih : ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1 :
                if (stack.isFull()) {
                    System.out.println("Stack sudah penuh! Silakan nilai atau hapus surat sebelum menambahkan surat baru.");
                }else {    
                    System.out.print("ID Surat\t : ");
                    String idSurat = scan.nextLine();
                    System.out.print("Nama Mahasiswa\t : ");
                    String namaMahasiswa = scan.nextLine();
                    System.out.print("Kelas\t\t : ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I) : ");
                    char jenisIzin = scan.nextLine().charAt(0);
                    System.out.print("Durasi Izin\t : ");
                    int durasi = scan.nextInt();
                    Surat20 srt = new Surat20(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stack.push(srt);
                    System.out.printf("Surat izin dari %s berhasil diterima\n", namaMahasiswa);
                }
                    break;
                
                case 2 :
                    Surat20 prosesSurat = stack.pop();
                    if ( prosesSurat != null ){
                        System.out.println("Surat izin dari " + prosesSurat.namaMahasiswa + " berhasil diproses");  
                    }
                        break;

                case 3 : 
                    Surat20 suratTerakhir = stack.peek();
                    if (suratTerakhir != null){
                        System.out.println("Surat izin terakhir: "); 
                        System.out.println("Id Surat\t : " + suratTerakhir.idSurat); 
                        System.out.println("Nama Mahasiswa\t : " + suratTerakhir.namaMahasiswa); 
                        System.out.println("Keterangan\t : " + (suratTerakhir.jenisIzin == 'S' ? "Sakit" : "Izin Keperluan Lain")); 
                        System.out.println("Durasi\t : " + suratTerakhir.durasi + " hari");  
                    }
                        break;
                
                case 4:
                    System.out.print("Masukkan nama mahasiswa untuk mencari surat : ");
                    String cariNama = scan.nextLine();
                    boolean ditemukan = stack.search(cariNama);
                    if (ditemukan) {
                        System.out.printf("Surat izin untuk %s ditemukan.\n", cariNama);
                    } else {
                        System.out.printf("Surat izin untuk %s tidak ditemukan.\n", cariNama);
                    } 
                        break;
                        
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 5);
        scan.close();
    }
}
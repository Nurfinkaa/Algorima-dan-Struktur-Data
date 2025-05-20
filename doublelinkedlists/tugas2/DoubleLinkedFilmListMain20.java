package doublelinkedlists.tugas2;
import java.util.Scanner;
public class DoubleLinkedFilmListMain20 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedFilmList20 dll = new DoubleLinkedFilmList20();

        while (true) {
            System.out.println("\n==================================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("==================================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-DESC");
            System.out.println("10. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    Film20 awal = inputFilm(sc);
                    dll.addFirst(awal);
                    break;
                case 2:
                    Film20 akhir = inputFilm(sc);
                    dll.addLast(akhir);
                    break;
                case 3:
                    System.out.println("Masukkan Data Film");
                    System.out.print("Urutan ke-: ");
                    int index = sc.nextInt(); sc.nextLine();
                    System.out.print("ID Film: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Judul Film: ");
                    String judul = sc.nextLine();
                    System.out.print("Rating Film: ");
                    double rating = sc.nextDouble(); sc.nextLine();

                    Film20 filmBaru = new Film20(id, judul, rating);
                    dll.add(filmBaru, index);
                    System.out.println("Data Film ini akan masuk di urutan ke- " + index);
                    break;
                case 4:
                    dll.removeFirst();
                    break;
                case 5:
                    dll.removeLast();
                    break;
                case 6:
                    System.out.print("Masukkan index yang ingin dihapus: ");
                    int hapusIdx = sc.nextInt();
                    dll.remove(hapusIdx);
                    break;
                case 7:
                    dll.print();
                    break;
                case 8:
                    System.out.print("Masukkan ID Film yang dicari: ");
                    int cariID = sc.nextInt();
                    dll.searchById(cariID);
                    break;
                case 9:
                    dll.sortByRatingDesc();
                    break;
                case 10:
                    System.out.println("Terima kasih!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    static Film20 inputFilm(Scanner sc) {
        System.out.print("ID Film: ");
        int id = sc.nextInt(); sc.nextLine();
        System.out.print("Judul Film: ");
        String judul = sc.nextLine();
        System.out.print("Rating Film: ");
        double rating = sc.nextDouble(); sc.nextLine();
        return new Film20(id, judul, rating);
    }
}

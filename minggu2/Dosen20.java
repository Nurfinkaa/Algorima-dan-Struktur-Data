package minggu2;
public class Dosen20 {

     String idDosen;
     String nama;
     boolean statusAktif;
     int tahunBergabung;
     String bidangkeahlian;
     int masaKerja;

     public Dosen20 (){
     }

     public Dosen20(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangkeahlian){
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangkeahlian = bidangkeahlian;
     }

     void tampilkanInformasi(){
        System.out.println("ID Dosen : " + idDosen);
        System.out.println("Nama Dosen : " + nama);
        System.out.println("Status Aktif : " + statusAktif);
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Masa kerja: " + masaKerja + "tahun");
        System.out.println("Bidang Keahlian : " + bidangkeahlian);
        System.out.println("------------------------------");
     }

     boolean setStatusAktif(boolean status){
        statusAktif = status;
        if (status == true) {
            System.out.println("Aktif");
        } else{
            System.out.println("Tidak Aktif");
        }
        return statusAktif;
    }

     int hitungMasaKerja(int thnSkrng){
        return masaKerja = thnSkrng - tahunBergabung;
     }

     void ubahKeahlian (String bidang){
        bidangkeahlian = bidang;
     }
     
}
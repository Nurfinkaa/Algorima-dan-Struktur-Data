package minggu2;
public class MataKuliah20 {

    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah20(){
    }

    public MataKuliah20(String kodeMK, String nama, int sks, int jumlahJam){
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilkanInformasi(){
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam); 
        System.out.println("------------------------------");
    }

    void ubahSKS(int sksBaru){
        this.sks = sksBaru;
        System.out.println("SKS dirubah menjadi: " + sksBaru);
    }

    void tambahJam(int Jam){
        this.jumlahJam += Jam;
        System.out.println("Jumlah jam bertambah menjadi: " + jumlahJam + "jam");
    }

    void kurangiJam(int jam){
        if (jam > jumlahJam){
            System.out.println("Jumlah jam tidak cukup untuk dikurangi");
        } else {
            this.jumlahJam -= jam;
            System.out.println("Jumlah jam dikurangi menjadi: " + jumlahJam + "jam");
        }

        System.out.println("------------------------------"); 

    }
}
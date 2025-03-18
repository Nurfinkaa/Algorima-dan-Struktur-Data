package minggu6;
public class Mahasiswa20 {
    String nim;
    String nama;
    String kelas;
    double ipk;
    Mahasiswa20(){
    }

    Mahasiswa20 (String nm, String name, String kls,double ip ){
    nim = nm;
    nama = name;
    ipk = ip;
    kelas = kls;
    }

    void tampilInfomasi(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }
}

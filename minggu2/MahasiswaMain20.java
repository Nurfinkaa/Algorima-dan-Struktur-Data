//class MahasiswaMain20
package minggu2;
public class MahasiswaMain20 {
    public static void main(String[] args) {
        Mahasiswa20 mhs1 = new Mahasiswa20();
        mhs1.nama = "Muhammad Ali farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa20 mhs2 = new Mahasiswa20("Annisa Nabila","2141720160",3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa20 mhsPinka = new Mahasiswa20("Nurfinka L.", "244107020211", 3.90, "SI 2M");
        mhsPinka.updateIpk(4.00);
        mhsPinka.tampilkanInformasi();
    }
}
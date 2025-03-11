package minggu5;
public class MainNilaiMhs20 {

    static NilaiMhs20 maxUTSDC(NilaiMhs20[] mahasiswa, int lmax, int rmax) {
        if (lmax == rmax) {
            return mahasiswa[lmax];
        }
        int mid = (lmax + rmax) / 2;
        NilaiMhs20 leftMax = maxUTSDC(mahasiswa, lmax, mid);
        NilaiMhs20 rightMax = maxUTSDC(mahasiswa, mid + 1, rmax);
        return (leftMax.nilaiUTS > rightMax.nilaiUTS) ? leftMax : rightMax;
    }

    static NilaiMhs20 minUTSDC(NilaiMhs20[] mahasiswa, int lmin, int rmin) {
        if (lmin == rmin) {
            return mahasiswa[lmin];
        }
        int mid = (lmin + rmin) / 2;
        NilaiMhs20 leftMin = minUTSDC(mahasiswa, lmin, mid);
        NilaiMhs20 rightMin = minUTSDC(mahasiswa, mid + 1, rmin);
        return (leftMin.nilaiUTS < rightMin.nilaiUTS) ? leftMin : rightMin;
    }

    static double rataUASBF(NilaiMhs20[] mahasiswa) {
        int total = 0;
        for (NilaiMhs20 mhs : mahasiswa) {
            total += mhs.nilaiUAS;
        }
        return (double) total / mahasiswa.length;
    }
    
    public static void main(String[] args) {
        NilaiMhs20[] mahasiswa = {
            new NilaiMhs20("Ahmad", 78, 82),
            new NilaiMhs20("Budi", 85, 88),
            new NilaiMhs20("Cindy", 90, 87),
            new NilaiMhs20("Dian", 76, 79),
            new NilaiMhs20("Eko", 92, 95),
            new NilaiMhs20("Fajar", 88, 85),
            new NilaiMhs20("Gina", 80, 83),
            new NilaiMhs20("Hadi", 82, 84)
        };

        NilaiMhs20 maxUTS = maxUTSDC(mahasiswa, 0, mahasiswa.length - 1);
        NilaiMhs20 minUTS = minUTSDC(mahasiswa, 0, mahasiswa.length - 1);
        double rataUAS = rataUASBF(mahasiswa);

        System.out.println("Nilai UTS Tertinggi: " + maxUTS.nilaiUTS + " dengan nama " + maxUTS.nama);
        System.out.println("Nilai UTS Terendah: " + minUTS.nilaiUTS + " dengan nama " + minUTS.nama);
        System.out.printf("Rata-rata Nilai UAS: %.2f\n", rataUAS);
    }
}
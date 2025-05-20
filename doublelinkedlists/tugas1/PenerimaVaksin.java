package doublelinkedlists.tugas1;
public class PenerimaVaksin {
    int id;
    String nama;

    public PenerimaVaksin(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String toString() {
        return id + " " + nama;
    }
}

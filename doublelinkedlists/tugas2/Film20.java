package doublelinkedlists.tugas2;
public class Film20 {
    int id;
    String judul;
    double rating;

    public Film20(int id, String judul, double rating) {
        this.id = id;
        this.judul = judul;
        this.rating = rating;
    }

    public String toString() {
        return "ID: " + id + "\nJudul Film: " + judul + "\nIMDB Rating: " + rating;
    }
}
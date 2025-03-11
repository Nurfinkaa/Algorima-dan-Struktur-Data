package minggu4;
public class KuisKafe20 {
    String namaProduk;
    String typeProduk;
    String sizeProduk;
    double hargaProduk;

    public KuisKafe20( String namaProduk, String typeProduk, String sizeProduk, double hargaProduk) {
        this.namaProduk = namaProduk;
        this.typeProduk = typeProduk;
        this.sizeProduk = sizeProduk;
        this.hargaProduk = hargaProduk;
    }

    public String menampilkanNamaProduk(){
        return namaProduk;
    }

    public String menampilkanTypeProduk(){
        return typeProduk;
    }

    public String menampilkanSizeProduk(){
        return sizeProduk;
    }

    public double menampilkanHargaProduk(){
        return hargaProduk;
    }

    public void informasiProduk(){
        System.out.println("Nama : " + namaProduk);
        System.out.println("Tipe : " + typeProduk);
        System.out.println("Harga : " + hargaProduk);
        System.out.println("Ukuran : " + sizeProduk);
    }

}

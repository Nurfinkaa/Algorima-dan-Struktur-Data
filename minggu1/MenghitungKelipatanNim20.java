package minggu1;
import java.util.Scanner;
public class MenghitungKelipatanNim20 {
    public static void main(String[] args) {
        Scanner sc20 = new Scanner(System.in);

        //Masukkan Nim
        System.out.print("Masukkan Nim : ");
        String nim = sc20.nextLine();

        //mengambil 2 digit terkhir 
        int n = Integer.parseInt(nim.substring(nim.length() - 2));

        //menampilkan nilai n
        System.out.println("================================");
        System.out.println("n: " + n);

        //Menampilkan deretan kelipatan 
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10){
                continue;
            }
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }else{
                System.out.print("*");
            }
                
            }
            sc20.close();
    }
}
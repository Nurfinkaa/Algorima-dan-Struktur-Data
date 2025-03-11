package minggu5;
public class Faktorial20 {
    
    int faktorialBF(int n){
        int fakto = 1;
        for(int i=1; i<=n; i++){
            fakto = fakto *i;
        }
        return fakto;
    }

    int faktorialDC(int n){
        int fakto = 1;
        int i = n; 
        do {
            fakto = fakto * i;
            i--;
        } while (i > 0);
        return fakto;
    }
}
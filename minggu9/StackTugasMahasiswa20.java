package minggu9;
public class StackTugasMahasiswa20 {
    Mahasiswa20[] stack;
    int size;
    int top;
    int StackKonversi;

    public StackTugasMahasiswa20(int size){
    this.size = size;
    stack = new Mahasiswa20[size];
    top = -1;
    }

    boolean isFull(){
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty(){
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    void push(Mahasiswa20 mhs) {
        if (!isFull()) {
            top++;
            stack [top] = mhs ;
        } else {
            System.out.println("Stack Penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa20 pop (){
        if (!isEmpty()) {
            Mahasiswa20 m = stack[top];
            top--;
            return m;
        }else {
            System.out.println("Stack Kosong! Tidak ada tugas yang dinilai.");
            return null;
        }
    }

    public int jmlTugas(){
        return  top + 1;
    }

    public Mahasiswa20 peek(){
        if (!isEmpty()) {
            return stack[0];
        }else {
            System.out.println("Stack Kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void print (){
        for (int i=top; i >= 0; i-- ){
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas); 
        }
        System.out.println();
    }

    public String konversiDesimalkeBiner (int nilai){
        StackKonversi stack = new StackKonversi();
        while (nilai != 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}

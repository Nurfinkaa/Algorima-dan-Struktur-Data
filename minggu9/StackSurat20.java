package minggu9;
public class StackSurat20 {
    Surat20[] stack;
    int size;
    int top;

    public StackSurat20 (int size){
        this.size = size;
        stack = new Surat20[size];
        top = - 1;
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

    void push(Surat20 surat){
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack Penuh! Tidak bisa menambahkan surat izin lagi.");
        }
    }

    public Surat20 pop(){
        if (!isEmpty()) {
            Surat20 surat = stack[top];
            top--;
            return surat;
        }else {
            System.out.println("Stack Kosong! Tidak ada surat izin yang dapat diproses.");
            return null;
        }
    }

    public Surat20 peek(){
        if (!isEmpty()) {
            return stack[0];
        }else {
            System.out.println("Stack Kosong! Tidak ada surat yang dikumpulkan");
            return null;
        }
    }

    public boolean search(String namaMahasiswa) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                return true;
            }
        }
        return false;
    }
}
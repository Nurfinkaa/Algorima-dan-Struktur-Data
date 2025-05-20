package doublelinkedlists.tugas1;
public class DoubleLinkedLists20 {
    Node20 head;
    int size;

    public DoubleLinkedLists20() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(PenerimaVaksin data) {
        if (isEmpty()) {
            head = new Node20(null, data, null);
        } else {
            Node20 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node20 newNode = new Node20(current, data, null);
            current.next = newNode;
        }
        size++;
    }

    public PenerimaVaksin dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian kosong!");
        }
        PenerimaVaksin removed = head.data;
        head = head.next;
        if (head != null) head.prev = null;
        size--;
        return removed;
    }

    public void print() {
        if (!isEmpty()) {
            System.out.println("+++++++++++++++++++++++++++++++");
            System.out.println("Daftar Pengantre Vaksin");
            System.out.println("+++++++++++++++++++++++++++++++");
            System.out.printf("|%-5s|%-15s|\n", "No.", "Nama");
            Node20 tmp = head;
            int no = 1;
            while (tmp != null) {
                System.out.printf("|%-5d|%-15s|\n", tmp.data.id, tmp.data.nama);
                tmp = tmp.next;
                no++;
            }
            System.out.println("Sisa Antrian: " + size);
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public int size() {
        return size;
    }
}

package doublelinkedlists.tugas1;
public class Node20 {
    PenerimaVaksin data;
    Node20 prev;
    Node20 next;

    Node20(Node20 prev, PenerimaVaksin data, Node20 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}

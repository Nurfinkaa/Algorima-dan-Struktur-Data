package doublelinkedlists;
public class Node20 {
    int data;
    Node20 prev;
    Node20 next;

    Node20(Node20 prev,int data, Node20 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
package doublelinkedlists.tugas2;
public class NodeFilm20 {
    Film20 data;
    NodeFilm20 prev, next;

    public NodeFilm20(NodeFilm20 prev, Film20 data, NodeFilm20 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
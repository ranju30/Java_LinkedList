public class Node<T> {
    private Object next;
    private T value;

    public Node(T number) {
        this.value = number;
        this.next = null;
    }

    public T getValue() {
        return this.value;
    }

    public void updateNext(Node n) {
        this.next = n;
    }

    public Object getNext() {
        return this.next;
    }
}

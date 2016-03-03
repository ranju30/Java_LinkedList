public class LinkedList<T> {
    private int length;
    private Node<T> head;
    private Node<T> tail;

    public LinkedList() {
        this.length = 0;
        this.head = null;
        this.tail = null;
    }

    public void add(T value) {
        Node<T> n = new Node<>(value);
        if (length == 0) {
            head = tail = n;
        } else {
            tail.updateNext(n);
            tail = n;
        }
        this.length++;
    }

    public int getLength() {
        return this.length;
    }

    public Node getHead() {
        return (Node) this.head;
    }

    public Node getTail() {
        return (Node) this.tail;
    }

    public int find(T value) {
        Node n = (Node) head;
        for (int i = 1; i <= this.length; i++) {
            if (n.getValue() == value)
                return i;
            n = (Node) n.getNext();
        }
        return -1;
    }

    public class Iterator{
        private int currentIndex = 0;
        private int listLength = length;

        public boolean hasNext() {
            return listLength>currentIndex;
        }

        public T next() {
            Node n = (Node) head;
            for(int i=0;i<listLength;i++){
                if(currentIndex == i){
                    currentIndex++;
                    return (T) n.getValue();
                }
                n = (Node) n.getNext();
            }
            return null;
        }
    }
}

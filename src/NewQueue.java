public class NewQueue <T> {
    private Node<T> bottom;
    private Node<T> top;
    private int length;

    public NewQueue() {
        bottom = null;
        top = null;
        length = 0;
    }

    public Node<T> peek() {
        return this.bottom;
    }

    public void enqueue(T toAdd) {
        Node<T> newNode = new Node<>(toAdd);
        if (length == 0) {
            this.bottom = newNode;
            this.top = newNode;
            length++;
            return;
        }
        this.top.setNext(newNode);
        this.top = newNode;
        length++;
    }

    public Node<T> dequeue() {
        if (length == 0) {
            return null;
        }
        Node<T> toReturn = bottom;
        this.bottom = bottom.getNext();
        length--;
        if (bottom == null) {
            top = null;
        }
        return toReturn;
    }

    public int getLength() {
        return this.length;
    }
}

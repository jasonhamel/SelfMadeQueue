public class Node <T> {
    private final T value;
    private Node<T> next;

    public Node(T value) {
        this.value = value;
        this.next = null;
    }

    public void setNext(Node<T> toAdd) {
        this.next = toAdd;
    }

    public T getValue() {
        return this.value;
    }

    public Node<T> getNext() {
        return this.next;
    }
}

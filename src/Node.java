/**
 * Created by JHKim on 2017-06-28.
 */
public class Node<T> {

    public Node(T value) { data = value; }

    public Node<T> next() { return next; }
    public T value() { return data; }
    public void setNext(Node<T> node)  { next = node; }
    public void setValue(T value) { data = value; }

    private Node<T> next;
    private T data;

}

package linkedlist;

import java.util.HashMap;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2021/6/30
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Node<V> {
    private V value;
    private Node<V> next;
    private Node<V> prev;
    public Node() {
    }

    public Node(Node<V> prev, V value, Node<V> next) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

    public Node(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Node<V> getNext() {
        return next;
    }

    public Node<V> getPrev() {
        return prev;
    }

    public void setPrev(Node<V> prev) {
        this.prev = prev;
    }

    public void setNext(Node<V> next) {
        this.next = next;
    }
}

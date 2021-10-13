package linkedlist;

import java.util.NoSuchElementException;

/**
 * 〈链表〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2021/6/30
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class LinkedList<V> {
    /**
     * 头节点
     */
    private Node<V> first;
    /**
     * 尾结点
     */
    private Node<V> last;

    public LinkedList() {
    }

    public Node<V> getFirst() {
        return first;
    }

    /**
     * 队尾添加
     * 尾指针指向新节点
     * 指针变动分两种情况：
     * 1、已存在元素。老的尾节点next指向新节点
     * 2、不存在元素，头指针指向新节点
     * @param value
     */
    public Node<V> addLast(V value) {
        Node<V> l = last;
        Node<V> newNode =node(last, value, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.setNext(newNode);
        }
        return newNode;
    }

    private void linkLast(Node<V> newNode) {
        Node<V> l = last;
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.setNext(newNode);
        }
    }

    /**
     * 移除队尾
     * 若尾结点为null，则链表为空
     * 尾指针指向上一个节点
     * 分两种情况：
     * 1、只剩一个元素，头节点指向null
     * 2、不止一个元素，倒数第二个节点next指针指向空
     */
    public Node<V> removeLast() {
        if (last == null)
            throw new NoSuchElementException();
        Node<V> l = last;
        Node<V> pred = last.getPrev();
        last = pred;
        if (pred == null) {
            first = null;
        } else {
            pred.setNext(null);
        }
        return l;
    }

    /**
     * 添加头
     * 头指针指向新节点
     * 节点间指针变动：
     * 1、假设之前头节点为空，则尾结点也空，尾结点指向新节点
     * 2、之前头节点不为空，则老的头节点的前指针指向新节点
     * @param value
     */
    public Node<V> addHead(V value) {
        Node<V> f = first;
        Node<V> newNode = node(null, value, f);
        first = newNode;
        if (f == null) {
            last = newNode;
        } else {
            f.setPrev(newNode);
        }
        return newNode;
    }

    /**
     * 移除头
     * 头节点指向上个节点
     * 若上个节点为null,则移除后链表就为空，尾结点也指向null
     * 上个节点不为null，则上个节点的next指针则为null
     */
    public Node<V> removeHead() {
        if (first == null)
            throw new NoSuchElementException();
        Node<V> f = first;
        Node<V> next = first.getNext();
        first = next;
        if (next == null) {
            last = null;
        } else {
            next.setPrev(null);
        }
        return f;
    }

    private Node<V> node(Node<V> prev, V value, Node<V> next) {
        return new Node<>(prev, value, next);
    }

    /**
     *  a->b->c
     *  链表反转
     */
    public void reverse() {
        Node<V> f = first;
        Node<V> prev = null;
        Node<V> next = null;
        while (first != null) {
            next = first.getNext();
            if (next != null) {
                next.setPrev(next.getNext());
            }
            first.setNext(prev);
            first.setPrev(next);
            prev = first;
            first = next;
        }
        first = prev;
        last = f;
    }

    /**
     * 是否包含环
     * @return
     */
    public boolean hasCycle() {
        if (first == null) {
            return false;
        }
        Node<V> slow = first;
        Node<V> fast = first.getNext();
        while(slow != fast) {
            if (fast == null || fast.getNext() == null) {
                return false;
            }
            slow = slow.getNext();
            fast = first.getNext().getNext();
        }
        return true;
    }

    /**
     * 打印
     */
    public void print() {
        Node<V> temp = first;
        while(temp != null) {
            System.out.print(temp.getValue() + "->");
            temp = temp.getNext();
        }
        System.out.println();
    }
}

package linkedlist;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2021/6/30
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class MergeTwoSortLinkedList {
    public <V> Node<V> merge(Node<V> node1, Node<V> node2) {
        if (node1 == null && node2 == null) {
            return null;
        }
        if (node1 == null) return node2;
        if (node2 == null) return node1;
        Node<V> newNode;
        Node<V> n1 = node1;
        Node<V> n2 = node2;
        while(n1 != null && n2 != null) {
            while(n1.getValue() < n2.getValue()) {

            }
        }

    }
}

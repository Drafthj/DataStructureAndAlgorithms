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
public class HasCycle {
    public static <V> boolean hasCycle(Node<V> node) {
        if (node == null) {
            return false;
        }
        Node<V> slow = node;
        Node<V> fast = node.getNext();
        while(slow != fast) {
            if (fast == null || fast.getNext() == null) {
                return false;
            }
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        return true;
    }
}

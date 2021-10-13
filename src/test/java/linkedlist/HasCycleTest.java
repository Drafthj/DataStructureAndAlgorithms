package linkedlist;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2021/6/30
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class HasCycleTest {
    @Test
    public void testHasCycle() {
        Node<String> a = new Node<>(null, "1", null);
        Node<String> b = new Node<>(a, "1", null);
        Node<String> c = new Node<>(b, "1", null);
        Node<String> d = new Node<>(c, "1", b);
        a.setNext(b);
        b.setNext(c);
        c.setNext(d);
        Assert.assertEquals(HasCycle.hasCycle(a), true);
        d.setNext(null);
        Assert.assertEquals(HasCycle.hasCycle(a), false);
    }
}

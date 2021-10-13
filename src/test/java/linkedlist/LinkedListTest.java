package linkedlist;

import org.testng.annotations.Test;

import java.util.NoSuchElementException;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2021/6/30
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class LinkedListTest {
    @Test
    public void testCommon() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("1");
        linkedList.addLast("2");
        linkedList.print();
        linkedList.removeLast();
        linkedList.print();
        linkedList.removeHead();
        linkedList.print();
        linkedList.addLast("3");
        linkedList.addHead("1");
        linkedList.print();
    }
    @Test(expectedExceptions = NoSuchElementException.class)
    public void testNoSuchElementError() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.removeLast();
        linkedList.removeHead();
    }

    @Test
    public void testReverse() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("1");
        linkedList.addLast("2");
        linkedList.addLast("3");
        linkedList.addLast("4");

        linkedList.print();
        linkedList.reverse();
        linkedList.print();
        linkedList.reverse();
        linkedList.print();
    }

    @Test
    public void testHasCycle() {

    }
}

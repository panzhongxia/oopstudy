package letcode.linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * 给你一个链表的头节点 head ，判断链表中是否有环。
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，评测系统内部使用整数
 * pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
 * 如果链表中存在环，则返回 true 。 否则，返回 false 。
 *
 * 链接：https://leetcode-cn.com/problems/linked-list-cycle
 */
public class num141 {

    public static void main(String[] args) {
        // 构造测试用例，链表指向为 N1 -> N2 -> N3 -> N4
        ListNode n4 = new ListNode(4, null);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);
        ListNode head = n1;
        // 输出测试用例
        System.out.println("原始链表指向为：");
        printNode(head);
        boolean result;
        // 普通方式反转链表

        result = hasCycle(head);
        System.out.println("链表是否有环："+result);
    }

    /**
     * 循环打印链表数据域
     * @param head
     */
    public static void printNode(ListNode head) {
        while (head != null) {
            System.out.println(head.value);
            head = head.next;
        }
    }

    public static class ListNode {
        public int value;
        public ListNode next;

        public ListNode() {}
        public ListNode(int val) { this.value = val; }
        public ListNode(int data, ListNode nextNode) {
            this.value = data;
            next = nextNode;
        }
    }

    //1. Set
    public static boolean hasCycle(ListNode head) {
        Set s = new HashSet();
        //定义一个set，然后不断遍历
        while(head!=null) {
            //只要某个节点在set中出现过，说明遍历到重复元素了
            if(s.contains(head)) {
                return true;
            }
            s.add(head);
            head = head.next;
        }
        return false;
    }

    //2.快慢指针
    public static boolean hasCycle1(ListNode head) {
        if(head==null || head.next==null) {
            return false;
        }
        //定义两个指针i和j，i是慢指针，j是快指针
        ListNode i = head;
        ListNode j = head.next;
        while(j!=null && j.next!=null) {
            if(i==j) {
                return true;
            }
            //i每次走一步，j每次走两步
            i = i.next;
            j = j.next.next;
        }
        return false;
    }

}

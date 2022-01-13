package letcode.linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表不存在相交节点，返回 null 。
 * 图示两个链表在节点 c1 开始相交：
 * 题目数据 保证 整个链式结构中不存在环。
 * 注意，函数返回结果后，链表必须 保持其原始结构 。
 * 链接：https://leetcode-cn.com/problems/intersection-of-two-linked-lists
 */
public class num106 {

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

    //1.Set
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set s = new HashSet();
        ListNode p = headA;
        ListNode q = headB;
        //定义一个set之后，不断遍历p链表，然后将所有元素加入到set中
        while(p!=null) {
            s.add(p);
            p = p.next;
        }
        while(q!=null) {
            //遍历q链表，如果q链表的元素出现在set中，
            //重合，而这个重合的就是第一个相交的节点就说明
            //p和q两个链表有
            if(s.contains(q)) {
                return q;
            }
            q = q.next;
        }
        return null;
    }

    //2.快慢指针
    public static ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        //定义了两个节点a和b，只要a和b不等就继续遍历
        while(a!=b) {
            //这步很关键，请对照动态图配合理解，当a的下一个为空时，
            //就a就从b链表头开始遍历
            a = (a!=null)? a.next : headB;
            //同理，b也是类似的
            b = (b!=null)? b.next : headA;
        }
        return a;
    }


}

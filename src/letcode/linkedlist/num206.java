package letcode.linkedlist;

/**
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 * 输入：head = [1,2,3,4,5]
 * 输出：[5,4,3,2,1]
 * https://leetcode-cn.com/problems/reverse-linked-list/
 */
public class num206 {
    public static void main(String[] args) {
        // 构造测试用例，链表指向为 N1 -> N2 -> N3 -> N4
        Node n4 = new Node(4, null);
        Node n3 = new Node(3, n4);
        Node n2 = new Node(2, n3);
        Node n1 = new Node(1, n2);
        Node head = n1;
        // 输出测试用例
        System.out.println("原始链表指向为：");
        printNode(head);

        // 普通方式反转链表
        System.out.println("循环方式反转链表指向为：");
        head = reverseList1(head);
        printNode(head);
    }

    /**
     * 循环打印链表数据域
     * @param head
     */
    public static void printNode(Node head) {
        while (head != null) {
            System.out.println(head.value);
            head = head.next;
        }
    }

    //1. 迭代法
    public static class Node {
        public int value;
        public Node next;

        public Node(int data, Node nextNode) {
            this.value = data;
            next = nextNode;
        }
    }
    public static Node reverseList(Node node) {
        Node pre = null;
        Node next = null;
        while (node != null) {
            next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        return pre;
    }


    /** 2. 递归法
     * 以链表1->2->3->4->5举例
     * @param head
     * @return
     */

    public static Node reverseList1(Node head) {
        if (head == null || head.next == null) {
            /*
                直到当前节点的下一个节点为空时返回当前节点
                由于5没有下一个节点了，所以此处返回节点5
             */
            return head;
        }
        //递归传入下一个节点，目的是为了到达最后一个节点
        Node newHead = reverseList(head.next);
                /*
            第一轮出栈，head为5，head.next为空，返回5
            第二轮出栈，head为4，head.next为5，执行head.next.next=head也就是5.next=4，
                      把当前节点的子节点的子节点指向当前节点
                      此时链表为1->2->3->4<->5，由于4与5互相指向，所以此处要断开4.next=null
                      此时链表为1->2->3->4<-5
                      返回节点5
            第三轮出栈，head为3，head.next为4，执行head.next.next=head也就是4.next=3，
                      此时链表为1->2->3<->4<-5，由于3与4互相指向，所以此处要断开3.next=null
                      此时链表为1->2->3<-4<-5
                      返回节点5
            第四轮出栈，head为2，head.next为3，执行head.next.next=head也就是3.next=2，
                      此时链表为1->2<->3<-4<-5，由于2与3互相指向，所以此处要断开2.next=null
                      此时链表为1->2<-3<-4<-5
                      返回节点5
            第五轮出栈，head为1，head.next为2，执行head.next.next=head也就是2.next=1，
                      此时链表为1<->2<-3<-4<-5，由于1与2互相指向，所以此处要断开1.next=null
                      此时链表为1<-2<-3<-4<-5
                      返回节点5
            出栈完成，最终头节点5->4->3-2->1
         */
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}

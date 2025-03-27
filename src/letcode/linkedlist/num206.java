package letcode.linkedlist;

/** 反转链表
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
        //head = reverseList1(head);
        System.out.println("递归调用前 head 引用指向对象: " + head.toString());
//        recursionNode(head, null);
        head = recursionNode2(head, null);
        System.out.println("递归调用后 head 引用指向对象: " + head.toString());
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
    //https://leetcode-cn.com/problems/reverse-linked-list/solution/dong-hua-yan-shi-206-fan-zhuan-lian-biao-by-user74/
    public static class Node {
        public int value;
        public Node next;

        public Node(int data, Node nextNode) {
            this.value = data;
            next = nextNode;
        }
    }
    public static Node reverseList(Node cur) {
        Node pre = null;
        Node tmp = null;
        while (cur != null) {
            tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
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

    /**
     * 递归实现链表反转
     * https://www.cnblogs.com/Dreamer-1/p/14609526.html
     * 递归方法执行完成后，head指向就从原链表顺序：头结点->尾结点 中的第一个结点（头结点） 变成了反转后的链表顺序：尾结点->头结点 中的第一个结点（尾结点）
     *
     * @param head 头结点
     * @param prev 存储上一个结点
     */
    public static void recursionNode(Node head, Node prev) {
        System.out.println("递归调用中 head引用指向对象: " + head.toString());
        if (null == head.next) {
            // 设定递归终止条件
            // 当head.next为空时，表名已经递归到了原链表中的尾结点，此时单独处理尾结点指针域，然后结束递归
            head.next = prev;
            System.out.println("递归调用返回前 head引用指向对象: " + head.toString());
            return;
        }

        // 1. 先保存当前结点的下一个结点的信息到tempNext
        Node tempNext = head.next;
        // 2. 修改当前结点指针域，使其指向上一个结点（如果是第一次进入循环的头结点，则其上一个结点为null）
        head.next = prev;
        // 3. 将当前结点信息保存到prev中（以作为下一次递归中第二步使用到的"上一个结点"）
        prev = head;
        // 4. 当前结点在之前的123步中指针域修改已经修改完毕，此时让head重新指向待处理的下一个结点
        head = tempNext;

        // 递归处理下一个结点
        recursionNode(head, prev);
    }

    public static Node recursionNode2(Node head, Node prev) {
        if (null == head.next) {
            // 设定递归终止条件
            head.next = prev;
            return head;
        }
        Node tempNext = head.next;
        head.next = prev;
        prev = head;
        head = tempNext;
        Node result = recursionNode2(head, prev);
        return result;
    }
}

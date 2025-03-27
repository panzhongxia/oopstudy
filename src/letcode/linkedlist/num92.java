package letcode.linkedlist;

public class num92 {
    /** 反转链表2
     * 给你单链表的头指针 head 和两个整数 left 和 right ，其中 left <= right 。请你反转从位置 left 到位置 right 的链表节点，返回 反转后的链表 。
     * 示例 1：
     * 输入：head = [1,2,3,4,5], left = 2, right = 4
     * 输出：[1,4,3,2,5]
     * 示例 2：
     * 输入：head = [5], left = 1, right = 1
     * 输出：[5]
     */

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
        System.out.println("递归调用前 head 引用指向对象: " + head.toString());
        head = reverseBetween(head, 2, 4);
//        recursionNode(head, null);
//        head = recursionNode(head, null);
//        System.out.println("递归调用后 head 引用指向对象: " + head.toString());
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
    public static Node reverseBetween(Node head, int left, int right) {
        Node dummy = new Node(0, head);
        Node p0 = dummy;
        for (int i = 0; i < left - 1; i++) {
            p0 = p0.next;
        }

        Node pre = null;
        Node cur = p0.next;
        for (int i = 0; i < right - left + 1; i++) {
            Node nxt = cur.next;
            cur.next = pre; // 每次循环只修改一个 next，方便大家理解
            pre = cur;
            cur = nxt;
        }

        // 见视频
        p0.next.next = cur;
        p0.next = pre;
        return dummy.next;
    }
}


//https://leetcode.cn/problems/reverse-linked-list-ii/solutions/1992226/you-xie-cuo-liao-yi-ge-shi-pin-jiang-tou-teqq/
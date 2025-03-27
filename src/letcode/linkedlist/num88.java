package letcode.linkedlist;

public class num88 {
    /**
     * 给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，使得所有 小于 x 的节点都出现在 大于或等于 x 的节点之前。
     * 你应当 保留 两个分区中每个节点的初始相对位置。
     * 示例 1：
     * 输入：head = [1,4,3,2,5,2], x = 3
     * 输出：[1,2,2,4,3,5]
     * 示例 2：
     * 输入：head = [2,1], x = 2
     * 输出：[1,2]
     */
    public static void main(String[] args) {
        // 构造测试用例，链表指向为 N1 -> N2 -> N3 -> N4
        ListNode n4 = new ListNode(7, null);
        ListNode n3 = new ListNode(5, n4);
        ListNode n2 = new ListNode(3, n3);
        ListNode n1 = new ListNode(1, n2);
        ListNode head1 = n1;
        // 输出测试用例
        System.out.println("原始链表指向为：");
        printNode(head1);
        // 构造测试用例，链表指向为 N1 -> N2 -> N3 -> N4
        ListNode m4 = new ListNode(6, null);
        ListNode m3 = new ListNode(4, m4);
        ListNode m2 = new ListNode(2, m3);
        ListNode m1 = new ListNode(1, m2);
        ListNode head2 = m1;
        // 输出测试用例
        System.out.println("原始链表指向为：");
        printNode(head2);
        // 合并两个链表
        int x = 3;
        ListNode res = partition(head1, x);
        // 输出合并后的链表
        System.out.println("合并后的链表指向为：");
        printNode(res);
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
    
    public static ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode smallHead = small;
        ListNode large = new ListNode(0);
        ListNode largeHead = large;
        while (head != null) {
            if (head.value < x) {
                small.next = head;
                small = small.next;
            } else {
                large.next = head;
                large = large.next;
            }
            head = head.next;
        }
        large.next = null;
        small.next = largeHead.next;
        return smallHead.next;
    }
}

//https://leetcode.cn/problems/partition-list/solutions/543768/fen-ge-lian-biao-by-leetcode-solution-7ade/

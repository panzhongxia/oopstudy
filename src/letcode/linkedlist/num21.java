package letcode.linkedlist;

public class num21 {
    /**
     * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
     * 输入：l1 = [1,2,4], l2 = [1,3,4]
     * 输出：[1,1,2,3,4,4]
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
        ListNode res = mergeTwoLists(head1, head2);
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

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dum = new ListNode(0), cur = dum;
        while (list1 != null && list2 != null) {
            if (list1.value < list2.value) {
                cur.next = list1;
                list1 = list1.next;
            }
            else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        cur.next = list1 != null ? list1 : list2;
        return dum.next;
    }
}

//https://leetcode.cn/problems/merge-two-sorted-lists/solutions/2361535/21-he-bing-liang-ge-you-xu-lian-biao-shu-aisw/
//https://leetcode.cn/problems/merge-two-sorted-lists/solutions/2373691/liang-chong-fang-fa-die-dai-di-gui-pytho-wf75/

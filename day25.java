class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // 创建虚拟头节点
        ListNode dummy = new ListNode(0);

        // 用来构建结果链表
        ListNode cur = dummy;

        // 记录进位
        int carry = 0;

        // 两个链表没遍历完，或者还有进位
        while (l1 != null || l2 != null || carry != 0) {

            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            // 两个数字加上进位
            int sum = x + y + carry;

            // 创建新节点
            cur.next = new ListNode(sum % 10);

            // 更新进位
            carry = sum / 10;

            // 结果链表向后移动
            cur = cur.next;

            // l1 向后移动
            if (l1 != null) {
                l1 = l1.next;
            }

            // l2 向后移动
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        return dummy.next;
    }
}
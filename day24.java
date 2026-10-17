class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // 1. 创建虚拟头节点
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // 2. 定义快慢指针
        ListNode fast = dummy;
        ListNode slow = dummy;

        // 3. 快指针先走 n 步
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // 4. 快慢指针一起移动
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // 5. 删除倒数第 n 个节点
        slow.next = slow.next.next;

        // 6. 返回新的头节点
        return dummy.next;
    }
}
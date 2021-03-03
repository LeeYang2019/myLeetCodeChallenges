

public class MergeTwoSortedLists {

    private ListNode head;

    private static class ListNode {
        private int val;
        private ListNode next;

//        ListNode() {} // no arg constructor
//
//        ListNode(int val) {
//            this.val = val;
//        }
//
//        ListNode(int val, ListNode next) {
//            this.val = val; this.next = next;
//        }

        public ListNode(int value) {
            this.val = value;
            this.next = null;
        }
    }


    public static void main(String[] args) {
        // 10 --> 8 --> 1 ...

        ListNode head = new ListNode(10);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(11);

        head.next = second;
        second.next = third;
        third.next = fourth;

//        ListNode dummy = new ListNode(-1); // create dummy node
//        ListNode head = dummy;

//        while (l1 != null && l2 != null) {
//            if (l1.val < l2.val) {
//                dummy.next = l1;
//                l1 = l1.next;
//            } else {
//                dummy.next = l2;
//                l2 = l2.next;
//            }
//
//            dummy = dummy.next;
//        }
//
//        if (l1 != null) {
//            dummy.next = l1;
//        } else {
//            dummy.next = l2;
//        }
//
//        return head.next;

    }

}

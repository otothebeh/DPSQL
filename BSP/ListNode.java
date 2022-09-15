public class ListNode {
    Object data;
    ListNode next;

    public ListNode(Object data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public ListNode getNext() {
        return next;
    }

    public static boolean contains(ListNode[] n, Object o) {

        ListNode node = n[0];
        while (node != n[n.length - 1]) {

            if (node.getData() == o) {

                return true;
            }

            node = node.getNext();
        }
        return false;
    }

    public static void main(String[] args) {// e

        ListNode[] a = new ListNode[5];

        a[4] = new ListNode("n5", null);
        a[3] = new ListNode("n4", a[4]);
        a[2] = new ListNode("n3", a[3]);
        a[1] = new ListNode("n2", a[2]);
        a[0] = new ListNode("n1", a[1]);

        if (ListNode.contains(a, "n6")) {
            System.out.println("is drin");
        } else {
            System.out.println("nö");
        }

    }
}

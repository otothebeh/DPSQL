public class ListNode {
    private Object data;
    private ListNode next;

    public ListNode(Object data)
    {
        this.data = data;
    }
    public void append(Object data)
    {
        if (this.next != null)
            this.next.append(data);
        else
            this.next = new ListNode(data);
    }

    public String toString()
    {
        return this.data + " " + (this.next != null ? this.next.toString() : "");
    }


    public static boolean contains(ListNode n, Object o)
    {
        do
        {
            if (n.data.equals(o))
                return true;
            n = n.next;
        }
        while (n != null);

        return false;
    }
}

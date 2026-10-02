class LinkedList {

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    // Dummy node
    Node head = new Node(0);

    public LinkedList() {
    }

    public int get(int index) {

        Node curr = head.next;

        for (int i = 0; i < index; i++) {
            if (curr == null) {
                return -1;
            }

            curr = curr.next;
        }

        if (curr == null) {
            return -1;
        }

        return curr.val;
    }

    public void insertHead(int val) {

        Node node = new Node(val);

        node.next = head.next;
        head.next = node;
    }

    public void insertTail(int val) {

        Node node = new Node(val);

        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = node;
    }

    public boolean remove(int index) {

        Node curr = head;

        for (int i = 0; i < index; i++) {

            if (curr.next == null) {
                return false;
            }

            curr = curr.next;
        }

        if (curr.next == null) {
            return false;
        }

        curr.next = curr.next.next;

        return true;
    }

    public ArrayList<Integer> getValues() {

        ArrayList<Integer> result = new ArrayList<>();

        Node curr = head.next;

        while (curr != null) {
            result.add(curr.val);
            curr = curr.next;
        }

        return result;
    }
}
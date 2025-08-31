class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;

        Map<Node,Node> m = new HashMap<>();
        Node temp = head;

        
        Node newHead = new Node(temp.val);
        m.put(temp, newHead);
        
        Node oldCurr = temp.next;
        Node newCurr = newHead;

        while(oldCurr != null){
            Node newNode = new Node(oldCurr.val);
            m.put(oldCurr, newNode);

            newCurr.next = newNode;
            newCurr = newNode;
            oldCurr = oldCurr.next;
        }

        
        oldCurr = head;
        newCurr = newHead;

        while(oldCurr != null){
            if(oldCurr.random != null){
                newCurr.random = m.get(oldCurr.random);
            }
            oldCurr = oldCurr.next;
            newCurr = newCurr.next;
        }

        return newHead;
    }
}

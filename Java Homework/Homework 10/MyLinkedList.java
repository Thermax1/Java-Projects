public class MyLinkedList {
    private Node head;

    MyLinkedList() {
        head = null;
    }

    public void addNode(Node n) {
        if(head == null) {
            head = n;
        } 
        else {
            Node trav;
            trav = head;
            while(trav.next != null) {
                trav = trav.next;
            }
            trav.next = n;
        }
    }
    
    public void printList() {
        Node trav = head;
        while(trav != null) {
            System.out.println(trav.name);
            trav = trav.next;
        }
    }

    public void insertBefore(int index, Node n) {
        Node trav = head;
        int x = 0;
        while(x < index - 1){

            if(trav.next == null) {
                System.out.println("Can't be there.");
                return;
            }
            trav = trav.next;
            x++;
        }
        Node next = trav.next;
        trav.next = n;
        n.next = next;
    }

    public void insertAfter(int index, Node n) {
        Node trav = head;
        int x = 0;
        while(x < index) {
            
            if(trav.next == null) {
                System.out.println("Can't be there.");
                return;
            }
            trav = trav.next;
            x++;
        }
        Node next = trav.next;
        trav.next = n;
        n.next = next;
    }

    public int indexOf(String str) {
        Node trav = head;
        int x = 0;
        while(trav.name != str){
            if(trav.next == null) {
                System.out.println("Not here.");
                return -1;
            }
            x++;
            trav = trav.next;
        }
        return x;
    }

    public void removeNode(int index) {
        Node trav = head;
        int x = 0;
        while(x < index -1) {
            if(trav.next == null) {
                System.out.println("Not here");
            }
            x++;
            trav = trav.next;
        }
        Node next = trav.next.next;
        trav.next = next;
    }

    public static void main(String[] args) {
        MyLinkedList test = new MyLinkedList();

        test.addNode(new Node("Anthony"));
        test.addNode(new Node("Natalie"));
        test.addNode(new Node("Eliza"));
        test.addNode(new Node("Jerry"));

        test.printList();

        test.indexOf("Lily");

        test.removeNode(3);

        test.printList();
    }
}
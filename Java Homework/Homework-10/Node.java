public class Node {
    public String name;
    public Node next;
    public char[] str;
    Node() { 
        name = "";
        next = null;
    }
    Node(String s) {
        name = s;
        next = null;
    }
}

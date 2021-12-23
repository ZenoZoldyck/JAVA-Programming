public class DoublyLinkedList {
    public static void main(String args[]) {
        LinkedList a = new LinkedList();
        a.insertNode(2);
        a.insertNode(4);
        a.insertNode(5);
        a.insertNode(8);
        a.insertNode(10);
        a.insertMid(17, 3);
        a.insertNode(11);
        a.insertNode(18);
        a.printList();
        System.out.println();
        a.deleteNode(4);
        a.deleteNode(18);
        a.printList();
    }
}

class LinkedList {
    Node head;
    
    static class Node {
        Node prev = null;
        int data;
        Node next = null;
    }
    
    public void insertNode(int a) {
        Node new_node = new Node();
        new_node.next = null;
        new_node.data = a;
        if (head == null) {
            head = new_node;
            new_node.prev = head;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new_node;
        new_node.prev = temp;
    }
    
    public void insertMid(int a, int index) {
        Node new_node = new Node();
        new_node.data = a;
        if (head == null) {
            head = new_node;
            new_node.prev = head;
            return;
        }
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        new_node.next = temp.next;
        new_node.prev = temp;
        temp.next = new_node;
        new_node.next.prev = new_node;
    }
    
    public void deleteNode(int a) {
        if (head == null) {
            System.out.println("The linked list is empty");
            return;
        }
        if (head.data == a) {
          head = head.next;
          head.next.prev = head;
          return;
        }
        boolean flag = false;
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == a) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.next = temp.next.next;
            if (temp.next != null) {
              temp.next.prev = temp;
            }
        }
        else {
            System.out.println("Node not found with value " + a);
        }
        
    }
    
    public void printList() {
        if (head == null) {
            System.out.println("Sorry, the linked list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
}
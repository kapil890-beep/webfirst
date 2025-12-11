public class MyLinkedList<T> {
    Node<T> head;

    public MyLinkedList() {
        this.head = null; // Initially, the list is empty
    }

    // Method to add an element to the end of the list
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to display the elements of the list
    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to remove an element by its data (first occurrence)
    public void remove(T data) {
        if (head == null) {
            return; // List is empty
        }

        if (head.data.equals(data)) {
            head = head.next;
            return;
        }

        Node<T> current = head;
        while (current.next != null && !current.next.data.equals(data)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    // Other common operations like insert at index, get at index, etc., can be added here.
}
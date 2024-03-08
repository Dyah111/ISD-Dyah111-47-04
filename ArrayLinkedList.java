import java.util.NoSuchElementException;

public class ArrayLinkedList {
    Node head;
    Node tail;

    public void tambahDepan(Buku data) {
        Node nodebaru = new Node(data);
        if (isEmpty()) {
            head = tail = nodebaru;
        } else {
            nodebaru.next = head;
            head = nodebaru;
        }
    }

    public void tambahBelakang(Buku data) {
        Node nodebaru = new Node(data);
        if (isEmpty()) {
            head = tail = nodebaru;
        } else {
            tail.next = nodebaru;
            tail = nodebaru;
        }
    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public Buku hapusDepan() throws NoSuchElementException {
        Buku dihapus = head.data;
        if (isEmpty()) {
            throw new NoSuchElementException("Linkedlist is empty");
        } else {
            head = head.next;
        }
        return dihapus;
    }

    public Buku hapusBelakang() throws NoSuchElementException {
        Buku dihapus = tail.data;
        if (isEmpty()) {
            throw new NoSuchElementException("Linkedlist is empty");
        } else {
            Node iterator = head;
            while (iterator.next != tail) {
                iterator = iterator.next;
            }
            tail = iterator;
            tail.next = null;
        }
        return dihapus;
    }

    public void print() {
        Node iterator = head;
        while (iterator != null) {
            System.out.println(iterator.data);
            iterator = iterator.next;
        }
    }
}

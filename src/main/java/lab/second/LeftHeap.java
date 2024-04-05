package lab.second;

public class LeftHeap {
    private Node head;

    public LeftHeap() {
        head = null;
    }

    public Node getHead() {
        return head;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void clear() {
        head = null;
    }

    public void insert(double a) {
        head = merge(new Node(a), head);
    }

    public double deleteMin() {
        if (isEmpty()) {
            return -1;
        }
        double min = head.element;
        head = merge(head.left, head.right);
        return min;
    }

    public void printInOrder() {
        orderRecursive(head);
        System.out.println();
    }

    private Node merge(Node a, Node b) {
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }
        if (a.element > b.element) {
            Node temp = a;
            a = b;
            b = temp;
        }

        a.right = merge(a.right, b);

        if (a.left == null) {
            a.left = a.right;
            a.right = null;
        } else {
            if (a.left.value < a.right.value) {
                Node temp = a.left;
                a.left = a.right;
                a.right = temp;
            }
            a.value = a.right.value + 1;
        }
        return a;
    }

    private void orderRecursive(Node r) {
        if (r != null) {
            orderRecursive(r.left);
            System.out.print(r.element + " ");
            orderRecursive(r.right);
        }
    }
}
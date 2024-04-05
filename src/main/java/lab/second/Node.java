package lab.second;

public class Node {
    double element, value;
    Node left, right;

    public Node(double element) {
        this(element, null, null);
    }

    public Node(double element, Node left, Node right) {
        this.element = element;
        this.left = left;
        this.right = right;
        this.value = 0.0;
    }

    public double getElement() {
        return element;
    }

    public double getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}

package tree;

public class Node {
    private int entropy; //빈도
    Node left = null;
    Node right = null;

    public Node(int entropy) {
        this.entropy = entropy;
    }

    public int getEntropy() {
        return entropy;
    }

    public void setLeft(Node node) {
        this.left = node;
    }

    public void setRight(Node node) {
        this.right = node;
    }

    @Override
    public String toString() {
        return "Node{" +
                "entropy=" + entropy +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

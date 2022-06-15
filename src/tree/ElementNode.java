package tree;

public class ElementNode extends Node{
    private int data;

    public ElementNode(int entropy, int data) {
        super(entropy);
        this.data = data;
    }

    public ElementNode(ElementNode elementNode){
        super(elementNode.getEntropy());
        this.data = elementNode.getData();
    }

    public int getData() {
        return data;
    }

    @Override
    public String toString() {
        return "data = " + data + ", " + super.toString();
    }
}

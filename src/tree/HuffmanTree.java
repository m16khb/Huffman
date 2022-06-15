package tree;

//싱글톤
public class HuffmanTree {
    private static HuffmanTree huffmanTree = new HuffmanTree();
    private Node root = null; //루트 노드

    private HuffmanTree() {
    }

    public static HuffmanTree getHuffmanTree() {
        return huffmanTree;
    }
}

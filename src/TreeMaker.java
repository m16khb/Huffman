import tree.ElementNode;
import tree.HuffmanTree;
import tree.Node;

import java.util.*;

public class TreeMaker {
    private HuffmanTree huffmanTree = HuffmanTree.getHuffmanTree();

    public void run(byte[] dataList) {
        Map<Integer, Integer> dataMap = new HashMap();

        for (Byte data : dataList) {
            dataMap.put(data & 0xff, dataMap.getOrDefault(data & 0xff, 0) + 1);
        }

        List<Node> nodeList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : dataMap.entrySet()) {
            nodeList.add(new ElementNode(entry.getValue(),entry.getKey()));
        }

        while (nodeList.size() != 2) {
            makeHuffman(nodeList,1,0);
        }
        makeHuffman(nodeList,0,0);


        for (Node node : nodeList) {
            System.out.println("node = " + node);
        }
    }

    class NodeComparator implements Comparator<Node> {
        @Override
        public int compare(Node n1, Node n2) {
            return n1.getEntropy() >= n2.getEntropy() ? 1 : -1;
        }
    }

    public void makeHuffman(List<Node> nodeList, int n, int m){
        nodeList.sort(new NodeComparator());
        Node leftNode = nodeList.remove(n);
        Node rightNode = nodeList.remove(m);
        Node middleNode = new Node(leftNode.getEntropy() + rightNode.getEntropy());
        middleNode.setLeft(leftNode);
        middleNode.setRight(rightNode);
        nodeList.add(middleNode);
    }
}

import fileIO.FileInput;

public class HuffmanMain {
    public static void main(String[] args) {
        FileInput fileInput = new FileInput();
        byte[] inputData = fileInput.getData("D:/test.txt");
        System.out.println(new String(inputData));

        TreeMaker treeMaker = new TreeMaker();
        treeMaker.run(inputData);
    }
}

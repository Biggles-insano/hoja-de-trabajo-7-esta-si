import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dictionary {
    private BinaryTree<Association<String, String>> englishBST;
    private BinaryTree<Association<String, String>> spanishBST;
    private BinaryTree<Association<String, String>> frenchBST;

    public Dictionary() {
        englishBST = new BinaryTree<>();
        spanishBST = new BinaryTree<>();
        frenchBST = new BinaryTree<>();
    }

    public void loadDictionary(String filename) {
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(",");
                englishBST.insert(new Association<>(line[0], line[1]));
                spanishBST.insert(new Association<>(line[1], line[2]));
                frenchBST.insert(new Association<>(line[2], line[0]));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    public BinaryTree<Association<String, String>> getEnglishBST() {
        return englishBST;
    }

    public BinaryTree<Association<String, String>> getSpanishBST() {
        return spanishBST;
    }

    public BinaryTree<Association<String, String>> getFrenchBST() {
        return frenchBST;
    }
}

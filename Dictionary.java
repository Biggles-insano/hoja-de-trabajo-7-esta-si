import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Dictionary {
    private BinaryTree<Association<String, String>> englishBST;
    private BinaryTree<Association<String, String>> spanishBST;
    private BinaryTree<Association<String, String>> frenchBST;

    public Dictionary() {
        englishBST = new BinaryTree<>();
        spanishBST = new BinaryTree<>();
        frenchBST = new BinaryTree<>();

        buildDictionary("diccionario.txt");
    }

    private void buildDictionary(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    Association<String, String> englishAssoc = new Association<>(parts[0], parts[1]);
                    Association<String, String> spanishAssoc = new Association<>(parts[1], parts[2]);
                    Association<String, String> frenchAssoc = new Association<>(parts[2], parts[0]);

                    englishBST.insert(englishAssoc);
                    spanishBST.insert(spanishAssoc);
                    frenchBST.insert(frenchAssoc);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addAssociation(String english, String spanish, String french) {
        Association<String, String> englishAssoc = new Association<>(english, spanish);
        Association<String, String> spanishAssoc = new Association<>(spanish, french);
        Association<String, String> frenchAssoc = new Association<>(french, english);
    
        englishBST.insert(englishAssoc);
        spanishBST.insert(spanishAssoc);
        frenchBST.insert(frenchAssoc);
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

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        System.out.println("English BST:");
        System.out.println(dictionary.getEnglishBST().toString());
        System.out.println("Spanish BST:");
        System.out.println(dictionary.getSpanishBST().toString());
        System.out.println("French BST:");
        System.out.println(dictionary.getFrenchBST().toString());
    }
}

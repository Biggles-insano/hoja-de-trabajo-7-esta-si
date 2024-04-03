import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private BinaryTree<Association<String, String>> englishBST;
    private BinaryTree<Association<String, String>> spanishBST;
    private BinaryTree<Association<String, String>> frenchBST;

    public Dictionary() {
        englishBST = new BinaryTree<>();
        spanishBST = new BinaryTree<>();
        frenchBST = new BinaryTree<>();
    }

    public void loadDictionary(String fileName) {
      
    }

    public void translateText(String fileName, String language) {
       
    }

   
}

public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.loadDictionary("dictionary.txt");

        System.out.println("Dictionary loaded successfully.");

        System.out.println("\nIn-order traversal of English BST:");
        dictionary.getEnglishBST().inOrder();

        System.out.println("\n\nTranslate text.txt to Spanish:");
        dictionary.translateText("text.txt", "spanish");

        System.out.println("\n\nTranslate text.txt to French:");
        dictionary.translateText("text.txt", "french");
    }
}

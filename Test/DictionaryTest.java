public class DictionaryTest {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();

        // Verificar que los árboles BST se hayan construido correctamente
        System.out.println("English BST:");
        System.out.println(dictionary.getEnglishBST().toString());
        System.out.println("Spanish BST:");
        System.out.println(dictionary.getSpanishBST().toString());
        System.out.println("French BST:");
        System.out.println(dictionary.getFrenchBST().toString());

        // Realizar algunas búsquedas en los árboles BST
        System.out.println("Search for 'house' in English BST:");
        System.out.println(dictionary.getEnglishBST().search(new Association<>("house", "")).toString());
        System.out.println("Search for 'casa' in Spanish BST:");
        System.out.println(dictionary.getSpanishBST().search(new Association<>("casa", "")).toString());
        System.out.println("Search for 'chien' in French BST:");
        System.out.println(dictionary.getFrenchBST().search(new Association<>("chien", "")).toString());
    }
}

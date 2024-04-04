import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();

        // Leer el archivo diccionario.txt y cargar las asociaciones en el diccionario
        try (BufferedReader br = new BufferedReader(new FileReader("diccionario.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    dictionary.addAssociation(parts[0].trim(), parts[1].trim(), parts[2].trim());
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        // Mostrar los árboles BST resultantes
        System.out.println("Árbol BST en inglés:");
        System.out.println(dictionary.getEnglishBST().toString());
        System.out.println("Árbol BST en español:");
        System.out.println(dictionary.getSpanishBST().toString());
        System.out.println("Árbol BST en francés:");
        System.out.println(dictionary.getFrenchBST().toString());

        // Realizar búsquedas en los árboles BST según la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Ingrese una palabra para buscar en los árboles BST (o 'salir' para terminar):");
            String word = scanner.nextLine().trim();
            if (word.equalsIgnoreCase("salir")) {
                break;
            }
            System.out.println("Resultado de la búsqueda:");
            System.out.println("Inglés: " + dictionary.getEnglishBST().search(new Association<>(word, "")));
            System.out.println("Español: " + dictionary.getSpanishBST().search(new Association<>(word, "")));
            System.out.println("Francés: " + dictionary.getFrenchBST().search(new Association<>(word, "")));
        }
        scanner.close();
    }
}


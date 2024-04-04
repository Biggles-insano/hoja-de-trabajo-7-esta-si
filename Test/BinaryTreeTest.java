public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();

        // Insertar elementos en el árbol
        binaryTree.insert(5);
        binaryTree.insert(3);
        binaryTree.insert(7);
        binaryTree.insert(1);
        binaryTree.insert(4);
        binaryTree.insert(6);
        binaryTree.insert(8);

        // Imprimir el árbol en orden
        System.out.println("Árbol en orden:");
        binaryTree.inOrder();

        // Buscar elementos en el árbol
        System.out.println("\nBuscar 5 en el árbol: " + binaryTree.search(5));
        System.out.println("Buscar 10 en el árbol: " + binaryTree.search(10));
    }
}

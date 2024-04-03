public class BinaryTree<E extends Comparable<E>> {
    private Node<E> root;

    private static class Node<E> {
        E data;
        Node<E> left;
        Node<E> right;

        Node(E item) {
            data = item;
            left = null;
            right = null;
        }
    }

    public void insert(E item) {
        root = insertRec(root, item);
    }

    private Node<E> insertRec(Node<E> root, E item) {
        if (root == null) {
            root = new Node<>(item);
            return root;
        }

        if (item.compareTo(root.data) < 0)
            root.left = insertRec(root.left, item);
        else if (item.compareTo(root.data) > 0)
            root.right = insertRec(root.right, item);

        return root;
    }

    public void inOrder() {
        inOrderRec(root);
    }

    private void inOrderRec(Node<E> root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }

    public boolean search(E item) {
        return searchRec(root, item);
    }

    private boolean searchRec(Node<E> root, E item) {
        if (root == null)
            return false;
        if (root.data.equals(item))
            return true;
        if (item.compareTo(root.data) < 0)
            return searchRec(root.left, item);
        return searchRec(root.right, item);
    }
}

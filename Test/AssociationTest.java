public class AssociationTest {
    public static void main(String[] args) {
        Association<String, Integer> association1 = new Association<>("key1", 1);
        Association<String, Integer> association2 = new Association<>("key2", 2);
        Association<String, Integer> association3 = new Association<>("key3", 3);

        // Test getKey() and getValue()
        System.out.println("Key of association1: " + association1.getKey());
        System.out.println("Value of association1: " + association1.getValue());

        // Test compareTo()
        System.out.println("Comparison between association1 and association2: " + association1.compareTo(association2));
        System.out.println("Comparison between association2 and association3: " + association2.compareTo(association3));
        System.out.println("Comparison between association3 and association1: " + association3.compareTo(association1));
    }
}

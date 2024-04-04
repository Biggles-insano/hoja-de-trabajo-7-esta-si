public class Association<K, V> implements Comparable<Association<K, V>> {
    private final K key;
    private final V value;

    public Association(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public int compareTo(Association<K, V> other) {
        return this.key.compareTo(other.key);
    }

    @Override
public boolean equals(Object o) {
    if (o == this) {
        return true;
    }

    if (!(o instanceof Association)) {
        return false;
    }

    Association other = (Association) o;
    return this.key.equals(other.key) && this.value.equals(other.value);
}
}

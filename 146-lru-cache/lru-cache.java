import java.util.HashMap;

public class LRUCache {
    private int capacity;
    private HashMap<Integer, Node> cache;
    private Node head;
    private Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.head = null;
        this.tail = null;
    }

    public int get(int key) {
        if (!cache.containsKey(key))
            return -1;
        Node node = cache.get(key);
        remove(node);
        insert(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            node.value = value; // Update the value for an existing key
            remove(node);
            insert(node);
        } else {
            Node node = new Node(key, value);
            if (cache.size() == capacity) {
                remove(tail); // Remove the least recently used node (tail)
            }
            insert(node);
        }
    }

    public void remove(Node node) {
        cache.remove(node.key);
        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            head = node.next;
        }
        if (node.next != null) {
            node.next.prev = node.prev;
        } else {
            tail = node.prev;
        }
    }

    public void insert(Node node) {
        cache.put(node.key, node);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        if (tail == null) {
            tail = node;
        }
    }

    private class Node {
        int key, value;
        Node next, prev;

        Node() {}

        Node(int key, int val) {
            this.key = key;
            this.value = val;
        }
    }
}

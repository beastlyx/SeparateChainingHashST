
package separatechaininghashst;

public class SequentialSearchST<Key, Value> implements SymbolTable<Key, Value> {
    private Node first;
    
    private class Node {
        Key key;
        Value val;
        Node next;
        public Node(Key key, Value val, Node next) {
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }
    @Override
    public Value get(Key key) {
        for (Node x = first; x != null; x = x.next)
            if (key.equals(x.key))
                return x.val;
        return null;
    }
    @Override
    public void put(Key key, Value val) {
        for (Node x = first; x != null; x = x.next)
            if (key.equals(x.key)) {
                x.val = val;
                return;
            }
        first = new Node(key, val, first);
    }
    @Override
    public void delete(Key key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public boolean contains(Key key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public Iterable<Key> keys() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}


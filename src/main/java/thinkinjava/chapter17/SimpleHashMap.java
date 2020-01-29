package main.java.thinkinjava.chapter17;

import java.util.AbstractMap;
import java.util.LinkedList;
import java.util.Set;

public class SimpleHashMap<K, V> extends AbstractMap<K, V> {

    static final int SIZE = 997;

    @SuppressWarnings("unchecked")
    LinkedList<MapEntry<K, V>> [] buckets = new LinkedList[SIZE];

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }
}

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache extends LinkedHashMap<Integer, Integer> {
    private int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        int mm = super.getOrDefault(key, -1);
        System.out.println(mm);
        return super.getOrDefault(key, -1);
    }

    public void set(int key, int value) {
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args){
        HashMap SS = new HashMap();
        LRUCache cache = new LRUCache(2);
        cache.set(1,1);
        cache.set(2,2);
        cache.get(1);
        cache.set(3,3);
        cache.get(2);
        cache.set(4,4);
        cache.get(1);
        cache.get(3);
        cache.get(4);
    }
}

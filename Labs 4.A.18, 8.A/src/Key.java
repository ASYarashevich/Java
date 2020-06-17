import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.lang.Math;

public class Key {
	
	private static final int NUMBEROFKEYS = 88;
    private static final List<Integer> keys = new ArrayList<>(NUMBEROFKEYS);
    
    private static List<Integer> initializeKeys() {
        for (int i = 1; i < NUMBEROFKEYS + 1; i++) {
            Key.keys.add(i);
        }
        int key = (int) (Math.random() * Key.keys.size());
        return Collections.singletonList(Key.keys.get(key));
    }

    public List<Integer> getKey() {
        return Key.initializeKeys();
    }
    
    public static int getNumberOfKeys() {
        return NUMBEROFKEYS;
    }
    
}

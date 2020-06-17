import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.lang.Math;

public class Pedal {
	
	private static final int NUMBEROFPEDALS = (int) (Math.random() * 3 + 1);
	private static final List<Integer> pedals = new ArrayList<>(NUMBEROFPEDALS);
	
	private static List<Integer> initializePedals() {
		for (int i = 1; i < NUMBEROFPEDALS + 1; i++) {
			Pedal.pedals.add(i);
		}
		int pedal = (int) (Math.random() * Pedal.pedals.size());
		return Collections.singletonList(Pedal.pedals.get(pedal));
	}
	
	public List<Integer> getPedal() {
		return Pedal.initializePedals();
	}

    public static int getNumberOfPedals() {
        return NUMBEROFPEDALS;
    }
    
}

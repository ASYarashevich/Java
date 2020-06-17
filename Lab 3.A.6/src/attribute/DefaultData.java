package attribute;
import java.util.ArrayList;
import java.lang.Math;

public class DefaultData {
	
	public static ArrayList<String> types = new ArrayList<>();
	
	public static ArrayList<String> streets = new ArrayList<>();
	
	public static void fillWithData() {
		types.add("Historical building");
		types.add("Apartment block");
		types.add("Skyscraper");		
		
		streets.add("Nezavisimosti Av.");
		streets.add("Nyamiga Str.");
		streets.add("Rabochy Al");
	}
	
	public static String getRandomType() {
		short n = (short) (Math.random() * types.size() + 1);
		return types.get(n);
	}
	
	public static String getRandomStreet() {
		short n = (short) (Math.random() * streets.size() + 1);
		return streets.get(n);
	}
}

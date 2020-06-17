package thePackage;
import java.lang.Exception;

public class SomeException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public SomeException(String description) {
		super(description);
	}
	
}

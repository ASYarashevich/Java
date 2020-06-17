
public class Piano {
	
    private final Key key;
    private final Pedal pedal;

    public Piano(Key key, Pedal pedal) {
        this.key = key;
        this.pedal = pedal;
    }
    
    @Override
    public String toString() {
        return "Maker: Steinway " + "\nNumber of keys: " + Key.getNumberOfKeys() + "\nNumber of pedals: " + Pedal.getNumberOfPedals() + "\nTune: Standard";
    }
    
    public String tunePiano() { 
        return "Tuning the instrument... Piano's tuned.";
    }
    
    public String playPiano() {
        return "You're playing the piano...";
    }
    
    public String pressKey() {
        return "You pressed key " + key.getKey() + " with pedal " + pedal.getPedal();
    }
    
}

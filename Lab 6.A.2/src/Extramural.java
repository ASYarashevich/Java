import java.util.ArrayList;

public class Extramural extends Student
{

    public Extramural() {}
    
    public Extramural(String fac, int cour) {
        super(fac, cour);
    }
    
    public Extramural(String fac, int cour, ArrayList<String> subjects, ArrayList<Integer> marks) {
        super(fac, cour, subjects, marks);
    }

    public void study() {
        System.out.println("I study at home.");
    }
    
    public void show() {
        System.out.println("Hi, I'm an extramural student.");
    }
    
}

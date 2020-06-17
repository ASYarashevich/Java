import java.util.ArrayList;

public abstract class Student implements Abiturient {
	
    private ArrayList<Performance> marks = new ArrayList<Performance>();
    public String faculty;
    public int course;
    
    public class Performance {
    	
        public int mark;
        public String subject;
        
        public Performance(int m, String s)
        {
            this.mark = m;
            this.subject = s;
        }
    }
    
    public Student() {}
    
    public Student(String fac, int cour)
    {
        this.faculty = fac;
        this.course = cour;
    }
    
    public Student(String fac, int cour, ArrayList<String> subjects, ArrayList<Integer> marks)
    {
        this.faculty = fac;
        this.course = cour;
        for(int i = 0; i < subjects.size(); i++)
        {
            this.marks.add(new Performance(marks.get(i), subjects.get(i)));
        }
    }
    
    public void addMark(String subject, int mark) {
        this.marks.add(new Performance(mark, subject));
    }

    public void rest() {
        System.out.println("Oh, it's time to rest... Bye!");
    }
    
}

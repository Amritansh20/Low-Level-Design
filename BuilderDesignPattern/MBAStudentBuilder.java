package BuilderDesignPattern;

import java.util.*;

public class MBAStudentBuilder extends StudentBuilder {


    @Override
    public StudentBuilder setSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.add("HRM");
        subjects.add("Finanace");
        subjects.add("Economics");
        this.subjects = subjects;
        return this;
    }
    
}

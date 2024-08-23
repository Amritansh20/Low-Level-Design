package BuilderDesignPattern;

import java.util.*;
public class EngStudentBuilder extends StudentBuilder {

    @Override
    public StudentBuilder setSubjects() {
        List<String> subs = new ArrayList<>();
        subs.add("DBMS");
        subs.add("OS");
        subs.add("DSA");
        this.subjects=subs;
        return this;
    }
    
}

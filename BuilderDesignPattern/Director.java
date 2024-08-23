package BuilderDesignPattern;

public class Director {
    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder){
        this.studentBuilder=studentBuilder;
    }

    public Student createStudent(){
        if(studentBuilder instanceof MBAStudentBuilder)
        return createMBAStudent();
        else
        return  createEngStudent();
    }

    private Student createMBAStudent(){
        return studentBuilder.setName("Ramu").setAge(10).setFatherName("Ram").setMotherName("Rita").setRollNo(1).setSubjects().build();
    }

    private Student createEngStudent(){
        return studentBuilder.setName("Shyam").setAge(10).setFatherName("Ram").setMotherName("Rita").setRollNo(1).setSubjects().build();
    }
}

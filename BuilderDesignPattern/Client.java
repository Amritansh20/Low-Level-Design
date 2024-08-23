package BuilderDesignPattern;

public class Client {
    public static void main(String[] args) {
        Director director = new Director(new EngStudentBuilder());
        Director director2 = new Director(new MBAStudentBuilder());

        Student student1 = director.createStudent();
        Student student2 = director2.createStudent();

        System.out.println(student1.toString());
        System.out.println(student2.toString());
    }
}

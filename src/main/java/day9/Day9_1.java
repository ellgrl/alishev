package day9;

public class Day9_1 {
    public static void main(String[] args) {
        Student student = new Student("John", "12");
        Teacher teacher = new Teacher("Davis", "Maths");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubject());

        student.printInfo();
        teacher.printInfo();
    }

}

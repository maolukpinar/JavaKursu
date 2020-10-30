package Mentor.Sema.Encapsulation._01Student;

public class MainStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        //set student
        student1.setStudentRoll(1);
        student1.setStudentName("Suzanna");
        student1.setStudentAge(15);

        //display ekranda görüntüleme
        System.out.println("öğrencinin kayıt numarası :"+student1.getStudentRoll());
        System.out.println("öğrencinin adi : "+student1.getStudentName());
        System.out.println("öğrencinin yaşı : "+student1.getStudentAge());


    }
}

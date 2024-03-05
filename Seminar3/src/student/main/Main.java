package student.main;

import student.classes.Exam;
import student.classes.Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John");
        Exam exam = new Exam();
        boolean examTaken = exam.takeExam(student1);

        if (examTaken) {
            System.out.println(student1.getName() + " has taken the exam.");
        } else {
            System.out.println(student1.getName() + " has already taken the exam.");
        }

        examTaken = exam.takeExam(student1);
        if (examTaken) {
            System.out.println(student1.getName() + " has taken the exam.");
        } else {
            System.out.println(student1.getName() + " has already taken the exam.");
        }
    }
}

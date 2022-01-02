package test;

import com.company.model.Student;
import com.company.model.Subject;

public class Main {

    public static void main(String[] args) {
        // 直接通过构造函数的方式传值
        // public Subject(String subjectName, String subjectNo, int subjectDuration)
        Subject subject1 = new Subject("Math", "002", 4);
        System.out.println(subject1.info());

        System.out.println("==================");
        // 通过setter方法传值
        Student student1 = new Student();
        student1.setStudentID("001");
        student1.setStudentName("Amy");
        student1.setStudentGender("Female");
        student1.setStudentAge(19);
        System.out.println(student1.info(subject1));

        Student student2 = new Student("002", "Jim", "Male", 20);
        Student student3 = new Student("003", "Bob", "Male", 19);
        // 测试指定专业有多少人报名
        subject1.addStudent(student1);
        subject1.addStudent(student2);
        subject1.addStudent(student3);
        System.out.println("Math一共有" + subject1.getStudentNum() + "人");
    }
}

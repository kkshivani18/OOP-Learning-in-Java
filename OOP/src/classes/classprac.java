
// Introduction & Concepts - Classes, Objects, Constructors, Keywords
// Apply core OOP principles—classes, objects, constructors, and keywords like this, final, and static—by developing a console-based Student Management System.

package classes;

import java.lang.reflect.Constructor;

public class classprac {
    public static void main(String[] args) {
        Student student1 = new Student("Krishna", 11, 4, "krishna11@gmail.com");
        Course course1 = new Course("Maths in AI", 3454, "Dr. Rupali Mehta");

        Student student2 = new Student("Radha", 12, 4, "radha12@gmail.com");
        Course course2 = new Course("Psychology", 3624, "Dr. Mahendra Verma");

        Enrollment enroll1 = new Enrollment(student1, course1);
        Enrollment enroll2 = new Enrollment(student2, course2);
        enroll1.displayEnrollmentInfo();
        enroll2.displayEnrollmentInfo();
    }
}

class Student{
    private String name;
    private int rno;
    private int grade;
    private String email;

//    default Constructor

//    public Student(){
//        this.name = "Shivani";
//        this.rno = 23;
//        this.grade = 6;
//        this.email = "shivani23@gmail.com";
//    }

    public static final String university = "VNIT University";

    // parameterised constructor
    public Student(String name, int rno, int grade, String email){
//        this.name = "Shivani";
//        this.rno = 23;
//        this.grade = 6;
//        this.email = "shivani23@gmail.com";

        this.name = name;
        this.rno = rno;
        this.grade = grade;
        this.email = email;
    }

    public void setEmail(String email){
        if(email.endsWith("@gmail.com")){
            this.email = email;
        }
        else{
            throw new IllegalArgumentException("email should be in the format given");
        }
    }

    public void displayStudentInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Std: "  + this.rno);
        System.out.println("Grade: " + this.grade);
        System.out.println("Email: " + this.email);
        System.out.println("University: " + university);
    }
}

class Course{
    private String courseName;
    private int courseCode;
    private String instructorName;

    public Course(String courseName, int courseCode, String instructorName){
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructorName = instructorName;
    }

    public void displayCourseInfo(){
        System.out.println("Course name: " + courseName);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Instructor of Course: " + instructorName);
    }
}

class Enrollment{
    private Student student;
    private Course course;

    public Enrollment(Student student, Course course){
        this.student = student;
        this.course = course;
    }

    public void displayEnrollmentInfo(){
        System.out.println("--- Enrollment Details ---");
        student.displayStudentInfo();
        course.displayCourseInfo();
        System.out.println("Enrollment done\n");
    }
}

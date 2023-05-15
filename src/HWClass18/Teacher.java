package HWClass18;

/*
Write a Java program called Teacher. Identify features and 4 behaviors of that class.
Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher. Test all 4 classes.
 */
public class Teacher {
    String name;
    int age;
    int yearsOfExperience;

    void talks(){
        System.out.println("Teacher is giving a lecturing.");
    }
    void grading(){
        System.out.println(name+" is updating the grades.");
    }
    void writes(){
        System.out.println("Teacher is notifying students.");
    }
    void checksAttendance(){
        System.out.println("Teacher is checking the attendance.");
    }

}

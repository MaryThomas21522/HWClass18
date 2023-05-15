package HWClass18;

public class TeacherTester {

        public static void main(String[] args) {
            Teacher teacher = new Teacher();
            teacher.talks();

            MathTeacher math = new MathTeacher();
            math.name="Sandy";
            math.yearsOfExperience=12;
            System.out.println(math.name+" has been teaching Math for "+math.yearsOfExperience+" years.");

            ChemistryTeacher chemistry = new ChemistryTeacher();
            chemistry.age=32;
            chemistry.name="Dan";
            System.out.println(chemistry.name+" is " + chemistry.age+" years old");

            PianoTeacher Piano = new PianoTeacher();
            Piano.writes();
            Piano.name="Amy";
            Piano.grading();

        }

    }

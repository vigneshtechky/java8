package learning09092026;

public class SwitchDemo {

    public static void main(String[] args) {
        Student vignesh = new Student();
        vignesh.setName("vignesh");
        vignesh.setPoint(8.2f);
        char grade = grade(vignesh.getPoint());
        //expression --> A, 1, 2.2f, String
        switch (grade) {

            case 'A': {
                System.out.println(vignesh.getName() + " got first prize");
                break;
            }
            case 'B': {
                System.out.println(vignesh.getName() + " second  prize");
                break;
            }
            case 'C': {
                System.out.println(vignesh.getName() + " third prize");
                break;
            }
            default:
                System.out.println(vignesh.getName() + " not get prizes");

        }


    }


    public static char grade(float point) {
        //9 to 10 -->A
        //8 to 8.9 -->B
        //7 to 7.9 -->C
        //6 to 6.9 -->D
        //below 5.9 -->F
        char grade = '\u0000';
        boolean aGradeStartRange = point >= 9;
        boolean aGradeEndRange = point <= 10;
        boolean bGradeStartRange = point >= 8;
        boolean bGradeEndRange = point <= 8.9;
        boolean cGradeStartRange = point >= 7;
        boolean cGradeEndRange = point <= 7.9;
        boolean dGradeStartRange = point >= 6;
        boolean dGradeEndRange = point <= 6.9;
        boolean fGradeStartRange = point >= 0;
        boolean fGradeEndRange = point <= 5.9;


        if (aGradeStartRange) {
            if (aGradeEndRange) {
                grade = 'A';
                System.out.println("grade: " + grade);
            }
        }

        if (bGradeStartRange) {
            if (bGradeEndRange) {
                grade = 'B';
                System.out.println("garde: " + grade);
            }
        }
        if (cGradeStartRange) {
            if (cGradeEndRange) {
                grade = 'C';
                System.out.println("grade:" + grade);
            }
        }
        if (dGradeStartRange) {
            if (dGradeEndRange) {
                grade = 'D';
                System.out.println("grade:" + grade);
            }
        }
        if (fGradeStartRange) {
            if (fGradeEndRange) {
                grade = 'F';
                System.out.println("grade:" + grade);
            }
        }

        return grade;
    }
}

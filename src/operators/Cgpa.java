package operators;

public class Cgpa {
    float point;
    char grade;

    public Cgpa() {

    }

    public void setPoint(float marks) {
        this.point = marks;
    }

    public float getPoint() {
        return point;
    }


    public void grade(float point) {
        //9 to 10 -->A
        //8 to 8.9 -->B
        //7 to 7.9 -->C
        //6 to 6.9 -->D
        //below 5.9 -->F
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

    }


}

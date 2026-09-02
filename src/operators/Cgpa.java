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

        if (point >= 9) {
            if (point <= 10) {
                grade = 'A';
                System.out.println("grade: " + grade);
            }
        }

       else if (point >= 8) {
            if (point <= 8.9) {
                grade = 'B';
                System.out.println("garde: " + grade);
            }
        }
       else if (point >= 7) {
            if (point <= 7.9) {
                grade = 'C';
                System.out.println("grade:" + grade);
            }
        }
      else if (point >= 6) {
            if (point <= 6.9) {
                grade = 'D';
                System.out.println("grade:" + grade);
            }
        }
       else if (point >= 0) {
            if (point <= 5.9) {
                grade = 'F';
                System.out.println("grade:" + grade);
            }
        }
       else{
            System.out.println("negative marks not count");
        }

    }


}

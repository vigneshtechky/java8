package vsu;

public class College {
    public static void main(String[] args) {
        student1();
    }


    public static void student1() {
        Student vig = new Student();
        String n = "vinay";
        int a = 27;
        int m = 89;
        float pm = 20.0f;
        char g = 'B';

        vig.setName(n);
        vig.setAge(a);
        vig.setMarks(m);
        vig.setPocketmoney(pm);
        vig.setgrade(g);
    }

}

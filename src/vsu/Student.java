package vsu;

public class Student {

    //global varaiables

    String name;
    int age;
    float pocketmoney;
    char grade;
    int marks;

    public Student() {
        System.out.println("student object is created");
    }

    public void setName(String vig) {
        name = vig;
        System.out.println("Student name :" + name);

    }

    public void setAge(int vig) {
        age = vig;
        System.out.println("student age :" + age);

    }

    public void setPocketmoney(float vig) {
        pocketmoney = vig;
        System.out.println("student pocketmoney:" + pocketmoney);
    }

    public void setgrade(char vig) {
        grade = vig;
        System.out.println("student grade:" + grade);
    }

    public void setMarks(int vig) {
        marks = vig;
        System.out.println("student marks:" + marks);
    }
}


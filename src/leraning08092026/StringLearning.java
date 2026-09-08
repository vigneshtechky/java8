package leraning08092026;

import java.util.Arrays;

public class StringLearning {
    public static void main(String[] args) {
        StringLearning();
    }


    public static void StringLearning() {

        //object
        String name = new String("Ashok");
        //string literal
        String firstname = "battala";
        //length start 1
        //indexing starts with 0;

        //charAt() method -->to return the character
        char result = firstname.charAt(1);
        System.out.println("character at specific index/position: " + result);
        //length() method -->() to return the length of the String
        int length = firstname.length();
        System.out.println("length: " + length);

        //case-sensitive(java is case senstive language)
        boolean equal = firstname.equals(name);
        System.out.println("equal or not: " + equal);

        boolean equalIgnore = firstname.equalsIgnoreCase(name);
        System.out.println("equal or not: " + equalIgnore);

        System.out.println("lowercase: " + name.toLowerCase());
        System.out.println("lowercase: " + name.toUpperCase());
        System.out.println("index of a String: " + name.indexOf('m'));
        System.out.println("concat of a String: " + firstname.concat(name));
        System.out.println("contains of a String: " + name.contains("k"));
        //imp--> it return the address location(not exact)
        System.out.println("address of a String: " + name.hashCode());
        System.out.println("character array object: "+ name.toCharArray());
        System.out.println("convert string to char Array: " + Arrays.toString(name.toCharArray()));
        //every object having toString method
        Employee emp = new Employee();
        emp.name = "vignesh";
        System.out.println("emp object "+emp);

    }
}

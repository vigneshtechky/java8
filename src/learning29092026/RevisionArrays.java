package learning29092026;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class RevisionArrays {
    public static void main(String[] args) {
//        learningArrays();
//        int[] sortedNumbers = new int[]{1, 2, 5, 7, 10};
//        reverseArray(sortedNumbers);
        pattern(5);
    }


    //patterns
//            1
//            1 1
//            1 1 1
//            1 1 1 1


    public static void pattern(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void reverseArray(int[] numbers) {
        for (int index = numbers.length - 1; index >= 0; index--) {
            System.out.print(numbers[index] + " ");
        }

    }

    public static void learningArrays() {
        //intialize
        int[] numbers = new int[3];//0 1 2
        System.out.println("arrays default values data: " + Arrays.toString(numbers));
        int[] evennumbers = new int[]{2, 4, 6, 8};
        System.out.println("arrays even data: " + Arrays.toString(evennumbers));
        int[] oddnumbers;
        oddnumbers = new int[]{1, 3, 5, 7, 9};
        System.out.println("arrays odd data: " + Arrays.toString(oddnumbers));
        //adding the data into an array
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        System.out.println("arrays values data: " + Arrays.toString(numbers));
        //evennumbers
        System.out.println(evennumbers[0]);//2
        System.out.println(evennumbers[1]);//4
        System.out.println(evennumbers[2]);//6
        System.out.println(evennumbers[3]);//8
//        System.out.println(evennumbers[4]);//ArrayIndexOutOfBoundException
        System.out.println("program completed");

        //print even numbers;
        for (int index = 0; index <= evennumbers.length - 1; index++) {
            // System.err.println("index "+index+"------->"+evennumbers[index]);
            System.err.print(evennumbers[index] + " ");
        }

    }
}

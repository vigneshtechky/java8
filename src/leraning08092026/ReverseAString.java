package leraning08092026;

public class ReverseAString {

    public static void main(String[] args) {
        String name = "vignesh"; //7
        //
        reverse(name);
    }

    private static void reverse(String name) {
      int length =   name.length() -1 ;

      //traversing concept reverse String
      for(int i = length; i>=0;i--){
          System.out.print(name.charAt(i));
      }
        System.out.println();

    }
}

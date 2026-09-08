package leraning08092026;

public class ReverseAString {

    public static void main(String[] args) {
        String name = "malayalam"; //7
        //
        String result =reverse(name);
        if(name.equals(result)){
            System.out.println("input: "+name +" is a palindrome: "+result);
        }
        else{
            System.out.println("input: "+name +" is not a palindrome: "+result);
        }
    }

    public static String reverse(String name) {
      int length =   name.length() -1 ;
      String reverse = "";

      //traversing concept reverse String
      for(int i = length; i>=0;i--){
          reverse = reverse + name.charAt(i);
      }
       return reverse;

    }
}

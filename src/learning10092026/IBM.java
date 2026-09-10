package learning10092026;

public class IBM {
    public static void main(String[] args) {
        int customers = 4;
        int[] vmStock = {2, 3, 4};
        //revenue
        //customer -1 -->4 revenue =4 {2,3,3}
        //customer -2 -->3 revenue = 4+3=7 {2,3,2}
        //customer -3 -->3 revenue =7+3=10 {2,2,2}
        //customer -4 -->2 revenue =10+2 =12 {1,2,2}

//        int len = vmStock.length;
//        System.out.println("vmStock length:" + len);
//        int secstock = vmStock[2];
//        vmStock[2] = 5;
//        System.out.println("vmStock at specific index:" + vmStock[2]);
        //       int[] firstHighest = firstHighest(vmStock);
        generateRevenue(vmStock);
    }

    public static void generateRevenue(int[] vmstock) {

        int customers = 4;
        int revenue = 0;
        for (int i = 1; i <= customers; i++) {

            int[] highestVmStock = firstHighest(vmstock);
            int highestStock = highestVmStock[0];
            revenue = revenue + highestStock;
            vmstock[highestVmStock[1]] = highestStock - 1;
        }
        System.out.println("revenue: " + revenue);
    }


    public static int[] firstHighest(int[] vmstock) {

        int[] result = new int[2];
        int length = vmstock.length - 1;
        int highest = vmstock[0]; //2
        int highestStockIndex = 0;
        for (int i = 1; i <= length; i++) {
            //3 >2  -->highest //3>1
            if (vmstock[i] >= highest) {
                highest = vmstock[i];
                highestStockIndex = i;
            }
        }
        result[0] = highest;
        result[1] = highestStockIndex;
        return result;
    }
}

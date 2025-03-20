package BT;

public class Bai5 {
     public static double sumNegativeNumber(double[] arr) {
         if (arr == null || arr.length == 0) {
             throw new IllegalArgumentException("Mang khong hop le");
         }
         double sum = 0;
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] < 0) {
                 sum += arr[i];
             }
         }
         return sum;
     }
     public static void main(String[] args) {
         double[] arr = {5,4,3,2,1,0,-1,-2,-3,-4,-5};
         double sum = sumNegativeNumber(arr);
         System.out.println("Tong cac so am trong mang la: " + sum);
     }
}

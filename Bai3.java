package BT;

public class Bai3 {
    public static boolean checkEvenNumber(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Mang khong hop le.");
        }

        for (int i : arr) {
            if ( i % 2 == 0 && i < 2004) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr = {2005,2003,2001,1999,2000,1998};
        boolean result = checkEvenNumber(arr);
        System.out.println("Co so chan nho hơn 2004 khong ? " + result);
    }
}

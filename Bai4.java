package BT;

public class Bai4 {
    public static boolean checkPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countPrime(int[] arr) {
        if (arr.length == 0 || arr == null) {
            throw new IllegalArgumentException("Mang khong hop le.");

        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (checkPrime(arr[i])) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int count = countPrime(arr);
        System.out.println("So luong so nguyen to trong mang la: " + count);
    }
}

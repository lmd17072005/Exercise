package BT;

public class Bai2 {
    public static int findMinIndex(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Mang khong hop le.");
        }
        int minIndex = arr[0];
        for (int i = 1; i< arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static void main (String[] args) {
        int [] arr = {2,3,5,1,7,8};
        int minIndex = findMinIndex(arr);
        System.out.println("Vi tri cua gia tri nho nhat trong mang la : " + minIndex);
    }
}

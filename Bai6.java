package BT;
import java.util.Arrays;

public class Bai6 {
    public static void BubbleSort(double[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Mang khong hop le.");
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        double[] arr = {1,3,5,7,9,6,2,11,17,19,40,20,66,55};
        BubbleSort(arr);
        System.out.println("Mang sau khi sap xep la: " + java.util.Arrays.toString(arr));
    }

}

package BT;

public class Bai1 {
    public static double findMax(double[] arr) {
        if (arr.length == 0 || arr == null) {
            throw new IllegalArgumentException("Mang khong hop le");

        }
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
}
    public static void main(String[] args) {
        double[] arr = {1,2.2,3,4.4,5,6.6,7,8.8,9,10};
        double max = findMax(arr);
        System.out.println("Gia tri lon nhat trong mang la: " + max);
    }
}

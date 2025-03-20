package BT;
import java.util.Scanner;
public class Bai11 {
    public static double findMax(double[] arr) {
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhap so phan tu cua mang: ");
            n = sc.nextInt();
            if(n <= 0) {
                System.out.println("mang khong hop le. vui long nhap lai");
            }
        } while (n <= 0);
        double[] arr = new double[n];
        System.out.println("Nhap cac phan tu trong mang: ");
        for(int i =0; i< arr.length; i++) {
            System.out.println("arr["+ i + "] = ");
            arr[i] = sc.nextDouble();
        }
        double maxValue = findMax(arr);
        System.out.println("Gia tri lon nhat la: " + maxValue);
    }
}

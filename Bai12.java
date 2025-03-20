package BT;
import java.util.Scanner;
public class Bai12 {
    public static double findPositiveValue(double[] arr) {
        for (double n : arr) {
            if(n > 0) {
                return n;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhap so phan tu cua mang: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Mang khong hop le. Nhap lai");
            }
        } while (n <= 0);
        double[] arr = new double[n];
        System.out.println("Nhap cac phan tu trong mang: ");
        for(int i = 0; i< arr.length; i++ ) {
            System.out.println("arr["+ i + "] = ");
            arr[i] = sc.nextDouble();
        }
        double firstPositive = findPositiveValue(arr);
        System.out.println("Gia tri duong dau tien la: " + firstPositive);
    }

}

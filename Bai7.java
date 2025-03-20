package BT;
import java.util.Scanner;

public class Bai7 {
    public static double[] nhapMang(int n) {
        double arr[] = new double[n];
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
            arr[i] = sc.nextDouble();
        }
        return arr;
    }
    public static void xuatMang(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
    }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap so phan tu cua mang: ");
            n = sc.nextInt();
            if ( n <= 0) {
                System.out.println("Nhap lai so phan tu cua mang: ");
            }
        } while (n <= 0);
        double[] arr = nhapMang(n);
        xuatMang(arr);
}
}

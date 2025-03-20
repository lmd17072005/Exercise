package BT;
import java.util.Scanner;
public class Bai10 {
    public static void negativeValue(double arr[]) {
        System.out.println("Cac vi tri co gia tri am trong mang la: ");

        int count = 0;

        for (int i = 0; i< arr.length; i++) {
            if (arr[i] < 0) {
                System.out.println(i + "");
                count++;
            }
        }
        if (count == 0 ) {
            System.out.println("Khong co so am nao!");
        } else {
            System.out.println();
        }
    }
    public static void main (String[] args ) {
        int n;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Nhap so phan tu cua mang : ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Mang khong hop le. vui long nhap lai");
            }
        } while (n <=0);

        double[] arr = new double[n];
        System.out.println("Nhap cac phan tu trong mang: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr["+ i + "] = ");
            arr[i] = sc.nextDouble();
        }
        negativeValue(arr);
    }
}

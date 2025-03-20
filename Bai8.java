package BT;
import java.util.Scanner;

public class Bai8 {
    public static int[] nhapMang(int n) {
        int arr[] = new int[n];
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mang cac phan tu: ");
        for (int i = 0; i< n; i++ ) {
            System.out.println("arr["+ i +"] = ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void xuatMang(int arr[]) {
        System.out.println("Mang da nhap: " );
        for (int i = 0; i< arr.length; i++) {
            System.out.println("arr["+ i + "] = " + arr[i]);
        }
    }
    public static void main (String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap so phan tu cua mang: ");
            n = sc.nextInt();
            if (n <= 0 ) {
                System.out.println("Mang khong hop le. Nhap lai so phan tu cua mang. ");
            }
        }while (n <= 0);
        int arr[] = nhapMang(n);
        xuatMang(arr);
    }
}

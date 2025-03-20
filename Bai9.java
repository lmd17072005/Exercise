package BT;
import java.util.Scanner;

public class Bai9 {
    public static void evenNumber(int arr[]) {
        System.out.println("Cac so chan trong mang : ");
        for (int i = 0; i < arr.length; i++ ) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.println("Nhap so phan tu cua mang: ");
            n = sc.nextInt();
            if (n <= 0 ) {
                System.out.println("Mang khong hop le. Nhap lai so phan tu cua mang. ");
            }
        }  while (n <= 0);

        int arr[] = new int[n];
        System.out.println("Nhap cac phan tu trong mang: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        evenNumber(arr);
    }
}

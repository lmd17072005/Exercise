package BT;
import java.util.Scanner;
public class Bai15 {
    public static int findFirstEven(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap so phan tu cua mang: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Mang khong hop le. Nhap lai");
            }
        } while (n <= 0);
        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu trong mang: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        int firstEven = findFirstEven(arr);
        System.out.println("Vi tri cua so chan dau tien trong mang la: " + firstEven);
    }
}

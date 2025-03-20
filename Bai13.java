package BT;
import java.util.Scanner;
public class Bai13 {
    public static int findLastEvenValue(int[] arr) {
        for (int i = arr.length - 1; i >=0; i--) {
            if(arr[i] % 2 == 0) {
                return arr[i];
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
            if(n <= 0) {
                System.out.println("Mang khong hop le. Nhap lai");
            }
        } while (n <= 0);
        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu trong mang");
        for(int i = 0; i< arr.length; i++) {
            System.out.println("arr["+ i + "] = ");
            arr[i] = sc.nextInt();
        }
        int lastEven = findLastEvenValue(arr);
        System.out.println("So chan cuoi cung : " + lastEven);
    }
}
package BT;
import java.util.Scanner;
public class Bai14 {
    public static int findMinValue(double[] arr) {
        int minIndex = 0;
        for(int i = 1; i < arr.length; i++ ) {
            if(arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
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

        double[] arr = new double[n];
        System.out.println("Nhap cac phan tu trong mang: ");
        for(int i = 0; i< arr.length; i ++ ) {
            System.out.println("arr["+ i + "] = ");
            arr[i] = sc.nextDouble();
        }
        int minIndex = findMinValue(arr);
        System.out.println("vi tri co gia tri nho nhat la: " + minIndex);
    }
}

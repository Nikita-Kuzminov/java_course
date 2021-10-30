import java.util.Scanner;

public class LocalMinimum {
    public static void main(String[] args) {
        enterArray();
    }

    static void enterArray() {
        int localMinimumCount = 0;
        System.out.println("Enter array length: ");
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int[] a = new int[b];
        System.out.println("Enter array: ");
        for (int i = 0; i < b; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i-1] && a[i] < a[i+1]) {
                localMinimumCount++;
            }
        }
        System.out.println(localMinimumCount);
    }
}
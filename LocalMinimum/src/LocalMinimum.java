import java.lang.reflect.Array;

public class LocalMinimum {
    public static void main(String[] args) {
        findAndCountLocalMin();
    }

    static void findAndCountLocalMin() {
        int localMinimumCount = 0;
        int[] array = {22, 50, 34, 109, 473, 245, 378};
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i-1] && array[i] < array[i+1]) {
                localMinimumCount++;
            }
        }
        System.out.println(localMinimumCount);
    }
}

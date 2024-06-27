package sorted;

public class Radix_Sort {

    public static void sort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int maxVal = getMaxAbsValue(arr);

        int exp = 1;
        while (maxVal / exp > 0) {
            countingSort(arr, exp);
            exp *= 10;
        }
    }

    private static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        for (int num : arr) {
            int adjustedNum = num + Math.abs(getMinValue(arr));
            int digit = (adjustedNum / exp) % 10;
            count[digit]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int adjustedNum = arr[i] + Math.abs(getMinValue(arr));
            int digit = (adjustedNum / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        int index = 0;
        for (int num : output) {
            arr[index++] = num;
        }
    }

    private static int getMaxAbsValue(int[] arr) {
        int max = Math.abs(arr[0]);
        for (int num : arr) {
            int absNum = Math.abs(num);
            if (absNum > max) {
                max = absNum;
            }
        }
        return max;
    }

    private static int getMinValue(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}


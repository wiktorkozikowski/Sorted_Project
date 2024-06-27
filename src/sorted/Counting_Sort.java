package sorted;

public class Counting_Sort {

    public static void sort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int max = getMaxValue(arr);
        int min = getMinValue(arr);

        int range = max - min + 1;
        int[] count = new int[range];

        for (int num : arr) {
            count[num - min]++;
        }

        int index = 0;
        for (int i = min; i <= max; i++) {
            while (count[i - min] > 0) {
                arr[index++] = i;
                count[i - min]--;
            }
        }
    }

    private static int getMaxValue(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
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



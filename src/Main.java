import sorted.*;

public class Main {

    public static void main(String[] args) {
        int[] arr_1 = {-212, 951, 631, -577, 237, -735, -163, -996, -612, -799,
                462, 370, 172, 439, 144, -19, 850, -193, 215, -281,
                -225, -278, 364, 352, 58, -234, 394, -764, 707, 634,
                -339, -870, 998, -519, -456, -292, -688, -116, 257, 686,
                645, -90, 174, 788, 306, -721, 189, -487, -478, -81,
                -825, -648, -344, 130, -422, -831, -732, 542, 787, 316,
                -674, 838, -533, 352, 696, -350, -29, 746, -763, -780,
                -111, 243, -200, 132, 680, -17, 431, -88, 425, 66,
                -580, 813, 857, -775, 163, 506, 823, -189, 120, -611,
                -171, -360, -232, -336, -612, -204, 173, 385, 785, 546};

        // Bubble Sort
        System.out.println("Bubble Sort:");
        Bubble_Sort.sort(arr_1.clone());
        printArray(arr_1);

        // Insertion Sort
        System.out.println("\nInsertion Sort:");
        Insert_Sort.sort(arr_1.clone());
        printArray(arr_1);

        // Selection Sort
        System.out.println("\nSelection Sort:");
        Selection_Sort.sort(arr_1.clone());
        printArray(arr_1);

        // Bucket Sort
        System.out.println("\nBucket Sort:");
        Bucket_Sort.sort(arr_1.clone());
        printArray(arr_1);

        // Two Bubble Sort
        System.out.println("\nTwo Bubble Sort:");
        Two_Bubble_Sort.sort(arr_1.clone());
        printArray(arr_1);

        // Counting Sort
        System.out.println("\nCounting Sort:");
        Counting_Sort.sort(arr_1.clone());
        printArray(arr_1);

        // Heap Sort
        System.out.println("\nHeap Sort:");
        Heap__Sort.sort(arr_1.clone());
        printArray(arr_1);

        // Shell Sort
        System.out.println("\nShell Sort:");
        Shell_Sort.sort(arr_1.clone());
        printArray(arr_1);

        // Quick Sort
        System.out.println("\nQuick Sort:");
        Quicks_Sort.sort(arr_1.clone());
        printArray(arr_1);

        // Radix Sort
        System.out.println("\nRadix Sort:");
        Radix_Sort.sort(arr_1.clone());
        printArray(arr_1);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

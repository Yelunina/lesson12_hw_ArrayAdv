public class Tasks {
    public static void main(String[] args) {
        int[] arr = {2055, 5, 101, 17, 11, 555, 5, -700, 401};
        int res = returnIndexMaxElementArray(arr);
        System.out.println(res);
        res = returnIndexMaxElementArray1(arr);
        System.out.println(res);
        double result = averageArray(arr);
        System.out.println(result);
        reversArray(arr);
        printArray(arr);


    }

    public static int returnIndexMaxElementArray(int[] arr) {
        int indexOfMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[indexOfMax]) {
                indexOfMax = i;
            }
        }
        return indexOfMax;
    }

    public static int returnIndexMaxElementArray1(int[] arr) {
        int max = arr[0];
        int indexOfMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                indexOfMax = i;
            }
        }
        return indexOfMax;
    }

    public static double averageArray(int[] arr) {
        int sum = 0;
        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            average = (double) sum / arr.length;
        }
        return average;
    }


    public static void reversArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

}

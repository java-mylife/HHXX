package Api_Test.Arrary;

public class maopao {

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 8, 7, 6, 5};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        System.out.println(arr[1]);
        for (int res : arr
        ) {

            System.out.println(res);

        }
    }
}

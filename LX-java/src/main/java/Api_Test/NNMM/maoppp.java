package Api_Test.NNMM;

public class maoppp {
    public static void main(String[] args) {
        int arr[]={3,2,1,4,5,6,9};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;

                }

            }

        }
        for (int res: arr){
            System.out.println(res);

        }


    }
}

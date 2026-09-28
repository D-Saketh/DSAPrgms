public class Selection {

    public static void main(String[] args) {
        int arr[] = {34,4,56,467,645,8,7458};

        int n = arr.length;
        for(int i=0; i<n; i++) {
            int smallest = arr[0];

            for(int j=1; j<n; j++) {
                if(arr[j] < smallest) {
                    smallest = arr[j];
                }
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+ " ");
        }

    }

}

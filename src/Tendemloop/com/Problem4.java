package Tendemloop.com;
class Problem4 {
    public static void main(String[] args) {

        int arr[] = {1,2,8,9,12,46,76,82,15,20,30};

        int count[] = new int[10]; // index 1 to 9 used

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <= 9; j++) {
                if (arr[i] % j == 0) {
                    count[j] = count[j] + 1;
                }
            }
        }

        // Print result
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + ": " + count[i]);
        }
    }
}

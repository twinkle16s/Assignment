class A10 {
    public static void main(String[] args) {
        int[] arr = {25, 11, 7, 75, 56}; 
        int max = arr[0];
        int min = arr[0];

        for (int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Maximum element = " + max);
        System.out.println("Minimum element = " + min);
    }
}

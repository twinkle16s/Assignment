public class A11 {
    public static void main(String[] args) {
        int[] arr = {12, 7, 9, 20, 5, 18, 33};
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
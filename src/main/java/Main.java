import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

    }

    public static int[] arrAfterFour(int[] arr) {
        if(arr[arr.length-1] == 4){
            throw new RuntimeException("4 последняя цифра в массиве");
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 4) {
                return Arrays.copyOfRange(arr, i + 1, arr.length);
            }
        }
        throw new RuntimeException("В массиве нет 4");
    }

    public static boolean arrConsistsOfFoursAndOnes(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!= 1 && arr[i] !=4){
                return false;
            }
        }
        return true;
    }
}

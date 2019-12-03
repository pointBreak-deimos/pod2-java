public class andrew_arrayReturn {
//Make two arrays and write a method that returns the elements at the same index in both strings

//    method to return from specific index
    public static int output (int[] array, int index) {
        return array[index];
    }

    public static void main(String[] args) {

        //    arrays
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {11,12,13,14,15,16,17,18,19,20};

        System.out.println("These integers are at the same index: " + output(array1, 4) + ", " + output(array2, 4));

    }

}

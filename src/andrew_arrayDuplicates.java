public class andrew_arrayDuplicates {
//    Show the duplicates in an array of strings

    public static void main(String[] args) {

        String[] array = {"one", "two", "three", "four", "one", "five", "three"};

        for (int i = 0; i < array.length - 1; i++) {
            for (int x = i + 1; x < array.length; x++) {
                if (array[i].equals(array[x])) {
                    System.out.println(array[x] + " is a duplicate");
                }
            }
        }

    }
}

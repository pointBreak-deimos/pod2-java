public class thomasoffer {
    public static void main(String[] args) {
//  1      Write a program in Java to read 10 numbers from keyboard and find their sum and average

        Expected Output :
        The sum of 10 numbers is : 55
        The Average is : 5.500000


//  2.      Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant,
//        depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1,
//                print an error message.

        Scanner letter = new Scanner(System.in);

        System.out.print("Please input a letter: ");
        String input = letter.next().toLowerCase();

        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i")
                || input.equals("o") || input.equals("u");

        if (input.length() > 1)
        {
            System.out.println("Error. Not a single character.");
        }
        else if (!(uppercase || lowercase))
        {
            System.out.println("Error. Not a letter. Please enter an uppercase or lowercase letter.");
        }
        else if (vowels)
        {
            System.out.println("Letter is Vowel");
        }
        else
        {
            System.out.println("Letter is Consonant");
        }
    }




    }

}
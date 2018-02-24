/*
 * INSTRUCTIONS
 *
 * This program should take numerical input from the user in the form of command line arguments.
 * After parsing and adding all the supplied numbers the program should print the result to the console.
 *
 * COMPILING
 * javac ParamAdder.java
 *
 * RUNNING
 * >> java ParamAdder
 * >> 0
 *
 * >> java ParamAdder 1 3 5 -2 4
 * >> 11
 */

//Date Completed: 2/20/2018
// Group Members: Efosa Uwa-Omede & Francis Chang

/* import java.util.Scanner;

public class ParamAdder
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //A Scanner object constructed with System.in scans the standard input stream for groups of characters.

        int count;
        //Created and established so that the variable 'count' can be utilized afterwards.
        int sum = 0;
        // Has to be zero. If not, it gets included in the addition of your integers.

        System.out.println("Please enter your integers:");
        //Displays a prompt enabling the user to enter integers which will be added.

        //Note 1: Please know that any non-integers, words, and/or letters included as the
        //        first term will have the script assume a sum of zero.

        //Note 2: Please know that any non-integers, words, and/or letters that are included
        //        will be ignored as well as any integers after them if at least one integer has been
        //        inputted as the first term.

        String line = scanner.nextLine();
        //Waits for the user to enter a line of text and returns it.

        scanner = new Scanner(line);
        //Needed to make scanner.hasNextInt() work. Sources are listed from lines 65 to 69.

        while (scanner.hasNextInt())
        // Returns true if the next set of characters in the input stream can be read in as an int.
        {
            count = scanner.nextInt();
            //the nextInt() method reads in a group of characters that can be converted to an int.
            sum += count;
            //Adds together the original value of sum (which is 0) and the integers which were inputted after prompted
        }
        System.out.print("The Sum is = " + sum);
        //Prints out a message show the sum of the integers inputted

    }
}

//Built code using info from:
//https://stackoverflow.com/questions/22647352/how-to-sum-any-amount-of-user-inputted-numbers-from-a-single-line
//http://chortle.ccsu.edu/java5/notes/chap23/ch23_6.html
//http://chortle.ccsu.edu/java5/Notes/chap23/ch23_2.html
//https://stackoverflow.com/questions/24940873/meaning-of-input-nextline
 */

public class ParamAdder {
    public static void main(String[] args) {
        // args = new String[] {"1", "3", "5", "-2", "4"};

        int previousSum = 0;

        for (int i = 0; i < args.length; i++) {
            previousSum = Integer.parseInt(args[i]) + previousSum;
        }
        System.out.println(previousSum);
    }
}

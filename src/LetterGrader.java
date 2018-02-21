/*
 * INSTRUCTIONS
 *
 * Implement the grade to letter converter in the class below.
 * Valid input would be a grade between 0 and 100 inclusive.
 * If the grade is not in that range it is invalid.
 *
 *
 *  90 -> 100 : A - 90 (inclusive) to 100 (inclusive)
 *  80 ->  89 : B - 80 (inclusive) to 90 (exclusive)
 *  70 ->  79 : C
 *  65 ->  69 : D
 *   0 ->  64 : F
 *  invalid   : X
 *
 *  EXAMPLE
 *  grade2letter(89.999) is B
 *  grade2letter(100.001) is X
 */

public class LetterGrader
{

    public static char grade2letter(double grade)
    {
        // your code
        if (grade > 100 || grade < 0) {
            return 'X';
        }
        else if (grade >= 90) {
            return 'A';
        }
        else if (grade >= 80) {
            return 'B';
        }
        else if (grade >= 70) {
            return 'C';
        }
        else if (grade >= 65) {
            return 'D';
        }
        else {
            return 'F';
        }
    }
}

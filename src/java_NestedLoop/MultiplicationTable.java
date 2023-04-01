/*
Write a Java program that displays a multiplication table for numbers 1 through 10. The table should be displayed in the console output.

Example output:
1	2	3	4	5	6	7	8	9	10
2	4	6	8	10	12	14	16	18	20
3	6	9	12	15	18	21	24	27	30
4	8	12	16	20	24	28	32	36	40
5	10	15	20	25	30	35	40	45	50
6	12	18	24	30	36	42	48	54	60
7	14	21	28	35	42	49	56	63	70
8	16	24	32	40	48	56	64	72	80
9	18	27	36	45	54	63	72	81	90
10	20	30	40	50	60	70	80	90	100
*/

package java_NestedLoop;

public class MultiplicationTable {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {
                System.out.print((i * j) + "\t");
            }

            System.out.println();
        }
    }
}

//This Java program displays a multiplication table for numbers 1 through 10.
//
//The program starts with a for loop that initializes the variable i to 1 and increments it by 1 on each iteration until it reaches 10.
//This loop is used to print the rows of the multiplication table.
//
//Inside the first loop, there is another for loop that initializes the variable j to 1 and increments it by 1 on each iteration until it reaches 10.
//This inner loop is used to print the numbers in each row.
//
//The expression (i * j) inside the inner loop calculates the product of i and j and this is printed to the console using the System.out.print() method, followed by a tab character \t.
//
//After the inner loop completes, the program moves to the next line using the System.out.println() method to print a new line,
//and the outer loop repeats until all rows of the multiplication table have been printed.
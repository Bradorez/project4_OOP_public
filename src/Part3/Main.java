package Part3;
import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
    /*

    The definition of Big O  that a function f(n) is O(g(n)) if there exist constants C > 0 and n0 ≥ 1 such that |f(n)| ≤ C * |g(n)| for all n ≥ n0.
    f(n) = 2.5n + 4
    To find C lets chose the worst scenario
    2.5n + 4 ≤ C * n
    if n and n0 = 1
    then, C = 6.5.
    2.5 + 4 = 6.5 ≤ 6.5
    its true for n = 1.
    if n >= 1
    2.5n + 4 ≤ 6.5n for n ≥ 1
    delete 2.5n
    4 ≤ 4n ; n ≥ 1
    then,
    1 ≤ n
    its true for all n >=1 ,
    so with constant c = 6.5 and n>= 1, f(n) = 2.5n + 4 is O(n)
     */
    }
    public void split(ArrayList<Integer> pList, ArrayList<Integer> pEvenList, ArrayList<Integer> pOddList) {
        for (int n : pList) {
            if (n % 2 == 0) pEvenList.add(n);
            else pOddList.add(n);
        }
    }
    /*
        key operation is the check of a number is even or odd (n % 2 == 0)
     */

    /*
    No, the complexity would not change.
    algorithm still needs to iterate through each element
    The sorting of the input list does not impact the performance of the algorithm,
    as it still needs to perform the conditional check (the key operation) once for each element.
    the worst-case stays O(n).
     */
}

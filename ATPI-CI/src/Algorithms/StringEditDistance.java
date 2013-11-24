package Algorithms;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 20/11/13
 * Time: 15:53
 * To change this template use File | Settings | File Templates.
 */
public class StringEditDistance {
    /**
     * Implement a function that finds the edit distance of two input strings. There are three types of
     edit operations: insertion, deletion, and substitution. Edit distance is the minimal number of edit operations to
     modify a string from one state to the other.
     For example, the edit distance between “Saturday” and “Sunday” is 3 since the following three edit operations are
     required to modify one into another:
     (1) Saturday → Sturday (deletion of ‘a’)
     (2) Sturday → Surday (deletion of ‘t’)
     (3) Surday → Sunday (substitution of ‘n’ for ‘r’)
     There is no way to achieve it with fewer than three operations.
     */

    public int getDistance(String str1, String str2)
    {
        int len1 = str1.length();
        int len2 = str2.length();

        int[][] distances = new int[len2][len1];
        int editDistance = getEditDistance(str1, str2, distances, len1, len2);
        return editDistance;
    }

    public int getEditDistance(String str1, String str2, int[][] distances, int len1, int len2)
    {
        for (int i = 0; i < len2 + 1; ++i)
            distances[i][0] = i;
        for (int j = 0; j < len1 + 1; ++j)
            distances[0][j] = j;
        for (int i = 1; i < len2 + 1; ++i) {
            for (int j = 1; j < len1 + 1; ++j) {
                if (str1.charAt(j - 1) == str2.charAt(i - 1))
                    distances[i][j] = distances[i - 1][j - 1];
                else {
                    int deletion = distances[i][j - 1] + 1;
                    int insertion = distances[i - 1][j] + 1;
                    int substitution = distances[i - 1][ j - 1] + 1;
                    distances[i][j] = Min(deletion, insertion, substitution);
                }
            }
        }
        return distances[len2][len1];
    }
    int Min(int num1, int num2, int num3) {
        int less = (num1 < num2) ? num1 : num2;
        return (less < num3) ? less : num3;
    }
}

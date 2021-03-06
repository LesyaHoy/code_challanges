import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

//https://en.wikipedia.org/wiki/Taxicab_geometry

/**
You have just entered the world's easiest maze. You start in the northwest cell of an N by N grid of unit cells, and you must reach the southeast cell. 
You have only two types of moves available: a unit move to the east, and a unit move to the south. You can move into any cell, but you may not make a move 
that would cause you to leave the grid.

You are excited to be the first in the world to solve the maze, but then you see footprints. Your rival, Labyrinth Lydia, has already solved the maze before you, 
using the same rules described above!

As an original thinker, you do not want to reuse any of Lydia's moves. Specifically, if her path includes a unit move from some cell A to some adjacent cell B, your path 
cannot also include a move from A to B. (However, in that case, it is OK for your path to visit A or visit B, as long as you do not go from A to B.) Please find such a path.

Input
The first line of the input gives the number of test cases, T. T test cases follow; each case consists of two lines. The first line contains one integer N, 
giving the dimensions of the maze, as described above. The second line contains a string P of 2N - 2 characters, each of which is either uppercase E (for east) 
or uppercase S (for south), representing Lydia's valid path through the maze.

Output
For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and y is a string of 2N - 2 
characters each of which is either uppercase E (for east) or uppercase S (for south), representing your valid path through the maze that does not conflict 
with Lydia's path, as described above. It is guaranteed that at least one answer exists.
*/


public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int numberOfTestCases = in.nextInt();
        in.nextLine();

        for (int testCase = 1; testCase <= numberOfTestCases; testCase++) {
            in.nextLine();//skip number
            String lindaPath = in.nextLine();
            char[] myPath = new char[lindaPath.length()];
            for (int i = 0; i < lindaPath.length(); i++) {
                char c = lindaPath.charAt(i);
                myPath[i] = c=='E'?'S':'E';
            }
            System.out.println("Case #"+ testCase + ": " + new String(myPath));
        }
    }
}

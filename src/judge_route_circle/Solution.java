package judge_route_circle;

public class Solution {

    public static void main(String[] args) {
        System.out.println(judgeCircle("LLLRRR"));
    }

    public static boolean judgeCircle(String moves) {
        int vertical = 0;
        int horizontal = 0;

        for (int i = 0, j = 0, k = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U') {
                vertical++;
            } else if (moves.charAt(i) == 'D') {
                vertical--;
            } else if (moves.charAt(i) == 'L') {
                horizontal--;
            } else if (moves.charAt(i) == 'R') {
                horizontal++;
            }
        }

        //initial position
        return vertical == 0 && horizontal == 0;
    }
}

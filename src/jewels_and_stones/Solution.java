package jewels_and_stones;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }

    public static int numJewelsInStones(String J, String S) {
        Set<Character> jewels = new HashSet<>();
        int jewelsNumber = 0;

        for (Character c : J.toCharArray())  {
            jewels.add(c);
        }

        for (Character c : S.toCharArray()) {
            if (jewels.contains(c)) {
                jewelsNumber++;
            }
        }

        return jewelsNumber;
    }
}

import java.util.*;


public class Longestsubwithoutrepeat {
    // brute force (using the hash set) (time comp = o(n3))
    // public static boolean is_unique_within_range(String s, int start, int end) {
    //     HashSet<Character> chars = new HashSet<>();
    //     for (int i = start; i <= end; i++) {
    //         char ch = s.charAt(i);
    //         if (chars.contains(ch)) {
    //             return false;
    //         }
    //         chars.add(ch);
    //     }
    //     return true;
    // }
    // public static int length_of_longest_substring(String s) {
    //     int result = 0;
    //     for (int i = 0; i < s.length(); i++) {
    //         for (int j = i; j < s.length(); j++) {
    //             if (is_unique_within_range(s, i, j)) {
    //                 result = Math.max(result, j - i + 1);
    //             }
    //         }
    //     }
    //     return result;
    // }
    // // sliding window approach or two pointer ->o(n) in worst case goes to o(2n)
    // public static int length_of_longest_substr(String s) {
    //     // Array representing ASCII characters to track occurences
    //     int[] chars = new int[128];
    //     int result = 0;
    //     int i = 0;
    //     int j = 0;
    //     while (j < s.length()) {
    //         char right_char = s.charAt(j);
    //         chars[right_char]++;
    //         while (chars[right_char] > 1) {
    //             char left_char = s.charAt(i);
    //             chars[left_char]--;
    //             i++;
    //         }
    //         result = Math.max(result, j - i + 1);
    //         j++;
    //     }
    //     return result;
    // }
// sliding window optimization ->o(n) -> space comp (o(1))
public static int lengthofsubstring(String s) {
    int result = 0;
    Map<Character, Integer> hash_map = new HashMap<>();
    int i = 0;
    int j = 0;
    while (j < s.length()) {
        char ch = s.charAt(j);
        if (hash_map.containsKey(ch)) {
            i = Math.max(hash_map.get(ch), i);
        }
        result = Math.max(result, j - i + 1);
        hash_map.put(ch, j + 1);
        j++;
    }
    return result;
}

    public static void main(String[] args) {
        String str = "abcababb";
        System.out.println(Longestsubwithoutrepeat.lengthofsubstring(str));
        
    }
    
}

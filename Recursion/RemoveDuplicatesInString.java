public class RemoveDuplicates {
    public static void RemoveDuplicatesInString(String str, int idx, StringBuilder newStr, boolean map[]) {

        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            // duplicates
            RemoveDuplicatesInString(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            RemoveDuplicatesInString(str, idx + 1, newStr.append(currChar), map);
        }
        // return newStr;

    }

    public static void main(String args[]) {
        String str = "nainirai";
        // System.out.println()
        RemoveDuplicatesInString(str, 0, new StringBuilder(""), new boolean[26]);

    }
}

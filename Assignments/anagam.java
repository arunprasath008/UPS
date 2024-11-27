package programs;

public class anagam {
    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "silent";
        System.out.println(Anagrams(str1, str2));
    }
    public static boolean Anagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] charCount = new int[256];
        for (char c : str1.toCharArray()) {
            charCount[c]++;
        }

        for (char c : str2.toCharArray()) {
            charCount[c]--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}

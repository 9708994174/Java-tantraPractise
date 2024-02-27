public class CharacterOccurrence {
    public static int countOccurrences(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "hello";
        char c = 'l';
        System.out.println(countOccurrences(str, c));
    }
}

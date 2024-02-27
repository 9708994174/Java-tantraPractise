public class StringSplit {
    public static void splitString(String str, String delimiter) {
        String[] parts = str.split(delimiter);
        for (String part : parts) {
            System.out.println(part);
        }
    }

    public static void main(String[] args) {
        String str = "Hello,World,Java";
        String delimiter = ",";
        splitString(str, delimiter);
    }
}

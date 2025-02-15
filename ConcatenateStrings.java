public class ConcatenateStrings {
    public static String concatenate(String[] words) {
        StringBuffer sb = new StringBuffer();
        for (String word : words) {
            sb.append(word);
        }
        System.out.println(sb);
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] words = {"Hello", " ", "World", "!", " Have", " a", " great", " day!"};
        System.out.println("Concatenated String: " + concatenate(words));
    }
}

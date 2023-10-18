//Check if the input is a pangram or not. (A pangram is a sentence that contains all the alphabets from A to Z)
public class PangramChecker {
    public static boolean isPangram(String str) {
        str = str.toLowerCase();
        for (char c = 'a'; c <= 'z'; c++) {
            if (!str.contains(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(input);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}

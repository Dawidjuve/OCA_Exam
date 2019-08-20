package udemy.exam4;

public class Question32 {
    public static void main(String[] args) {
        String [] arr = {"abc", "TrUe", "false", null, "FALSE"};
        for(String s : arr) {
            System.out.print(Boolean.valueOf(s) ? "T" : "F");
        }
    }
}
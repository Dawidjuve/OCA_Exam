package udemy.exam4;

public class Question51 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try {
            while(true) {
                sb.append("OCA");
            }
        } catch(Exception e) {
            System.out.println("Exception!!!");
        }
        System.out.println("Main ends!!!");
    }
}
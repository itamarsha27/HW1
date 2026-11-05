
public class Assignment01Q01 {

    public static void main(String[] args) {
        for (String arg : args) {
            char check = arg.charAt(0);
            if ((int) check % 5 == 0) {
                System.out.println(check);
            }
        }
    }
}

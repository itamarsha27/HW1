public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int num_of_terms = Integer.parseInt(args[0]);
        for (int i = 0; i < num_of_terms; i++) {
            if (i % 2 == 0) {
                approxPi += (1.0 / (2 * i + 1));
            } else {
                approxPi -= (1.0 / (2 * i + 1));
            }
        }
        System.out.println(approxPi * 4 + " " + actualPi);
    }
}

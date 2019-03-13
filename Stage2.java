public class Stage2 {
    public String getOutput(String input) {
        StringBuilder sb = new StringBuilder();
        int integer = Integer.valueOf(input);
        boolean printFizz = integer % 3 == 0 || input.contains("3");
        boolean printBuzz = integer % 5 == 0 || input.contains("5");
        if (!printFizz && !printBuzz) {
            sb.append(input);
        }else{
            if (printFizz) {
                sb.append("Fizz");
            }
            if (printBuzz) {
                sb.append("Buzz");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Stage2 stage2 = new Stage2();
        for (int i = 1; i <= 100; i++) {
            System.out.println(stage2.getOutput(Integer.toString(i)));
        }
    }
}

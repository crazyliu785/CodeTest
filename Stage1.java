public class Stage1 {
    public String getOutput(int input) {
        StringBuilder sb = new StringBuilder();
        boolean printFizz = input % 3 == 0;
        boolean printBuzz = input % 5 == 0;
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
        Stage1 stage1 = new Stage1();
        for (int i = 1; i <= 100; i++) {
            System.out.println(stage1.getOutput(i));
        }
    }
}

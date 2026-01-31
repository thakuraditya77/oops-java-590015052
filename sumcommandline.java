
class SumCommandLine {
    public static void main(String[] args) {

        int sum = 100;

        for (int i = 0; i < args.length; i++) {
            sum = sum + Integer.parseInt(args[i]);
        }

        System.out.println("Sum of array elements: " + sum);
    }
}

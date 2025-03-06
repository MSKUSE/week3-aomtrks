public class FindMaximum {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        if (args.length == 2) {
            boolean condition = num1 > num2;
            int greatest = condition ? num1 : num2;
            System.out.println(greatest);
            if (num2 > num1) {
                System.out.println(num2);
            } else {
                System.out.println(num1);
            }
        } else {
            System.out.println("This Number of Args is unuseable!!!");
        }
    }
}
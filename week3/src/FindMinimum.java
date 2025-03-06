public class FindMinimum {
    public static void main(String[] args) {
        if (args.length == 3){
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
            boolean min_num1 = num1 < num2 && num1 < num3;
            boolean min_num2 = num2 < num1 && num2 < num3;
            int minimum = min_num1 ? num1:
                    min_num2 ? num2: num3;
            System.out.println(minimum);
            /*
            if (num3 < num2 && num3 < num1 ) {
                System.out.println(num3);
            } else if(num2 < num1 && num2< num3) {
                System.out.println(num2);
            }else {
                System.out.println(num1);
            }*/
        } else {
            System.out.println("This Number of Args is unuseable!!!");
        }

    }
}

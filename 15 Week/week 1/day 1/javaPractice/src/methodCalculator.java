import java.util.Scanner;

public class methodCalculator {
    public static void main(String[] args) {
        while (true){
            Scanner keyboard = new Scanner(System.in);
            System.out.println("what do you want to do");
            System.out.println("1: Add");
            System.out.println("2: Minus");
            System.out.println("3: Multiple");
            System.out.println("4: Division");
            int choice = Integer.parseInt(keyboard.nextLine());
            if (choice == 1){
                addNumbers();
            } else if (choice == 2) {
                minusNumbers();
            } else if (choice == 3){
                multiNumbers();
            } else if (choice == 4) {
                divideNumbers();
            } else {
                System.out.println("Wrong Input");
                System.out.println("try again");
                continue;
            }

            System.out.println("Do you want to run another function");
            System.out.println("Press n to exit");
            String rep = keyboard.nextLine();
            if (rep.equalsIgnoreCase("n")){
                break;
            }

        }
    }

    private static void divideNumbers() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("which two numbers do you want to Divide:");
        double num1 = Double.parseDouble(keyboard.nextLine());
        double num2 = Double.parseDouble(keyboard.nextLine());
        System.out.println(num1 +"/"+ num2+ ":" + (num1/num2));
    }

    private static void multiNumbers() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("which two numbers do you want to Multiple:");
        double num1 = Double.parseDouble(keyboard.nextLine());
        double num2 = Double.parseDouble(keyboard.nextLine());
        System.out.println(num1 +" x "+ num2+ ":" + (num1*num2));
    }
    private static void minusNumbers() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("which two numbers do you want to Minus:");
        double num1 = Double.parseDouble(keyboard.nextLine());
        double num2 = Double.parseDouble(keyboard.nextLine());
        System.out.println(num1 +"-"+ num2+ ":" + (num1-num2));
    }
    private static void addNumbers() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("which two numbers do you want to add:");
        double num1 = Double.parseDouble(keyboard.nextLine());
        double num2 = Double.parseDouble(keyboard.nextLine());
        System.out.println(num1 +"+"+ num2+ ":" + (num1+num2));
    }
}

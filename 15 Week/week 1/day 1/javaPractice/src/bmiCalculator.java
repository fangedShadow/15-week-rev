import java.util.Scanner;

public class bmiCalculator {
    public static void main(String[] args) {
        String name;
        int age, weight, height;
        double bmi;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hi lets calculate your BMI");
        System.out.println("What is your Name: ");
        name = keyboard.nextLine();
        name =  name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println("Welcome " + name+"!");
        System.out.println("Can you provide me with your age: ");
        age = Integer.parseInt(keyboard.nextLine());
        System.out.println("Can you provide me with you Weight: ");
        weight = Integer.parseInt(keyboard.nextLine());
        System.out.println("Can you provide me with you height: ");
        height = Integer.parseInt(keyboard.nextLine());

        System.out.println("Your current age is: " + age);
        System.out.println("Your current weight is: " + weight);
        System.out.println("Your current height is: " + height);

        bmi = (double) weight*703/(height*height);
        System.out.println("Your current BMI is: " + bmi);
        if(bmi<18){
            System.out.println("You are Underweight");
        } else if (bmi>=18 && bmi<25) {
            System.out.println("You are Healthy Person");
        } else if (bmi>=25 && bmi<30) {
            System.out.println("You are Overweight");
        } else if (bmi>=30 && bmi<40) {
            System.out.println("You are under Obese Category");
        } else if (bmi>=40){
            System.out.println("You are extremely Obese");
        } else {
            System.out.println("Something is wrong with your input");
        }

    }
}

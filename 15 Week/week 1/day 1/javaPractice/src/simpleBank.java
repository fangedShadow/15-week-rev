import java.util.ArrayList;
import java.util.Scanner;

public class simpleBank {
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<account> people = new ArrayList<>();
        while (true){
            System.out.println("what do want to do manager");
            System.out.println("1.Add Acc");
            System.out.println("2.Remove Acc");
            System.out.println("3.Add Acc Amount");
            System.out.println("4.Minus Acc Amount");
            System.out.println("5.View Accounts");
            System.out.println("6.Exit Portal");
            int choice = Integer.parseInt(keyboard.nextLine());
            if (choice==1){
                while (true){
                    System.out.print("Enter a name, and empty blank will stop: ");
                    String name = keyboard.nextLine();
                    if (name.isEmpty()) {
                        break;
                    }
                    System.out.println("Enter Your Age");
                    int age = Integer.parseInt(keyboard.nextLine());
                    System.out.println("Enter You1r Account's starting Amount");
                    double amount = Double.parseDouble((keyboard.nextLine()));
                    people.add(new account(name, age, amount));
                    System.out.println("------------------------");
                }
            } else if (choice==2) {
                for (int i = 0; i<people.size(); i++) {
                    System.out.println("---------------------");
                    System.out.println("acc id:- " + (i+1));
                    people.get(i).viewAcc();
                }
                System.out.println("----------------------");
                removeAcc(people);
            } else if (choice==3){
                while(true){
                    System.out.println("What do want to do");
                    System.out.println("1. Add money to the account");
                    System.out.println("2. Back");
                    int choiceAdd = Integer.parseInt(keyboard.nextLine());
                    if(choiceAdd == 1){
                        for (int i = 0; i<people.size(); i++) {
                            System.out.println("------------------");
                            System.out.println("Acc id:- " + (i+1));
                            people.get(i).viewAcc();
                        }
                        System.out.println("----------------------");
                        System.out.println("which acc do you want to add to");
                        int index = Integer.parseInt(keyboard.nextLine());
                        people.get(index-1).viewAcc();
                        System.out.println("how much money do want to add");
                        double newAmm = Double.parseDouble(keyboard.nextLine());
                        people.get(index-1).addAmount(newAmm);
                    } else if(choiceAdd == 2){
                        System.out.println("Going Back");
                        break;
                    } else {
                        System.out.println("Wrong option choose again");
                    }
                }

            } else if (choice==4){
                while (true){
                    System.out.println("What do you want to do");
                    System.out.println("1. Withdraw from the Account");
                    System.out.println("2. Go back");
                    int choiceAdd = Integer.parseInt(keyboard.nextLine());
                    if(choiceAdd == 1){
                        for (int i = 0; i<people.size(); i++) {
                            System.out.println("--------------------");
                            System.out.println("Acc id:- " + (i+1));
                            people.get(i).viewAcc();
                        }
                        System.out.println("----------------------");
                        System.out.println("which acc do you want to Withdraw from");
                        int index = Integer.parseInt(keyboard.nextLine());
                        people.get(index-1).viewAcc();
                        System.out.println("how much money do want to Withdraw");
                        double newAmm = Double.parseDouble(keyboard.nextLine());
                        if((people.get(index-1).getAmount()-newAmm) >= 0){
                            people.get(index-1).minusAmount(newAmm);
                        } else {
                            System.out.println("Account doesn't have the funds");
                            System.out.println("try again");
                        }
                    } else if(choiceAdd == 2){
                        System.out.println("Going Back");
                        break;
                    } else {
                        System.out.println("Wrong option choose again");
                    }                }
            } else if(choice == 5){
                System.out.println("All Accounts");
                for (int i = 0; i<people.size(); i++) {
                    System.out.println("---------------------");
                    System.out.println("acc id:- " + (i+1));
                    people.get(i).viewAcc();
                }
                System.out.println("-----------------------");
            } else if(choice ==6){
                break;
            }else {
                System.out.println("Wrong Option!! go again");
            }
        }

    }
    public static void removeAcc(ArrayList<account> people){
        int index;
        System.out.println("which Account Index do you want to remove");
        index = Integer.parseInt(keyboard.nextLine());
        people.remove(index-1);
    }
}
class account{
    public String name="Nan";
    public int age=0;
    public double amount=0.0;
    public account(String name, int age, double amount){
        this.name = name;
        this.age = age;
        this.amount = amount;
    }
    public double getAmount(){
        return this.amount;
    }

    public void viewAcc(){
        System.out.println("Name of the Account Holder: " + name);
        System.out.println("Age of the Holder: " + age);
        System.out.println("Amount in the Account: " + amount);
    }
    public void addAmount(double addAmount){
        this.amount = amount + addAmount;
    }
    public void minusAmount(double minusAmount){
        this.amount = amount - minusAmount;
    }
}

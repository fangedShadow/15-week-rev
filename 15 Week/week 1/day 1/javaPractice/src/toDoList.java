import java.util.ArrayList;
import java.util.Scanner;

public class toDoList {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<>();
        while(true){
            System.out.println("What do you want to do");
            System.out.println("1)Add a to-do to the list");
            System.out.println("2)remove a to-do to the list");
            System.out.println("3)View to-do-list");
            System.out.println("4)Exit to-do-list");
            int choice = Integer.parseInt(keyboard.nextLine());
            if(choice==1){
                addList(toDoList);
            } else if (choice==2) {
                if(toDoList.isEmpty()){
                    System.out.println("there is nothing in the to-do-list");
                    continue;
                }
                removeList(toDoList);


            } else if (choice == 3) {
                if(toDoList.isEmpty()){
                    System.out.println("there is nothing in the to-do-list");
                    continue;
                }
                viewList(toDoList);
            } else if(choice == 4){
                break;
            } else {
                System.out.println("Wrong option try again");
            }
        }
    }

    private static void viewList(ArrayList<String> toDoList) {
        System.out.println("The to-do-list");
        for (int i=0; i<toDoList.size(); i++){
            System.out.println((i+1)+ ": "+toDoList.get(i));
        }
    }

    private static void removeList(ArrayList<String> toDoList) {
        System.out.println("What Index do you want to remove");
        for (int i=0; i<toDoList.size(); i++){
            System.out.println((i+1)+ ": "+toDoList.get(i));
        }
        int index = Integer.parseInt(keyboard.nextLine());
        toDoList.remove(index-1);
    }

    private static void addList(ArrayList<String> toDoList) {
        System.out.println("What do you want to add");
        String toDo = keyboard.nextLine();
        toDoList.add(toDo);
    }
}

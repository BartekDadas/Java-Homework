import java.util.ArrayList;
import java.util.Scanner;

public class To_Do {

    ArrayList<String> task_list = new ArrayList<>();

    void manage_List() {
        boolean token = true;

        System.out.println("Welcome to To-Do List");

        while(token) {
            System.out.println("Choose option:\nExit(0) \nAdd Assignment(1) \nRemove Assignment(2) \nShow MY list(3)");
            int is_active = input();
            switch (is_active) {
                case 0:
                    token = exit();
                case 1:
                    System.out.println("Write Assignment :");
                    addToList();
                case 2:
                    showList();
                    System.out.println("Which assignment have  you finished");
                    removeFromList();
                case 3:
                    System.out.println("Your list");
                    showList();
                default:
            }
        }
    }

    void removeFromList() {
        int index = input();
        for(String x: task_list){
            if (task_list.indexOf(x) == index){
                this.task_list.remove(x);
            }
        }
    }

    void addToList() {
        String Assignment = task();
        this.task_list.add(Assignment);
    }

    void showList() {
        this.task_list.forEach(System.out::println);

    }

    boolean exit() {
        System.out.println("See you soon");
        return false;
    }

    String task() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    int input() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        try {
            return Integer.parseInt(input);
        }
        catch(NumberFormatException e) {
            return 0;
        }
    }
}

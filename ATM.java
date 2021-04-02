import java.io.Serializable;
import java.util.Scanner;

public class ATM {
    int money;
    int cash;

    void login() {
        System.out.println("Enter login: ");
        String login = optionMain();
        boolean log = true;
        while(log) {
            if (login.equals("1456")) {
                log = false;
                menu();
            } else {
                System.out.println("Wrong login");
                System.out.println("Enter login again:");
                login = optionMain();
            }
        }
    }

    void menu() {
        this.cash = 3000;
        System.out.println("Welcome to the Menu. Choose one of these options: Cash, Input Money, Check Account, Exit");
        boolean test = true;
        Serializable option = optionMain();
        while(test) {
            if (option.equals("Cash")) {
                takeCash();
                test = false;
            }
            if (option.equals("Input Money")) {
                cashInput();
                test = false;
            }
            if (option.equals("Check Account")) {
                checkAccount();
                test = false;
            }
            if (option.equals("Exit")) {
                exitMain();
                test = false;
            } else {
                System.out.println("Repeat enter:");
                option = optionMain();
            }
        }
    }

    void takeCash() {
        System.out.println("How much many would you like to take from your account: ");
        this.money = input();
        try {
            if(this.money > 0) {
                this.cash -= this.money;
                System.out.println("Congratulation. Transaction have been completed, your account stan is :" + cash);
            }
        } catch(NumberFormatException e) {
            System.out.println("There have been an error. Transaction failed");
        }
    }

    void cashInput() {
        System.out.println("How much many would you like to put in your account:");
        this.money = input();
        try {
            if(this.money > 0) {
                this.cash += this.money;
                System.out.println("Congratulation. Transaction have been completed, your account stan is :" + cash);
            }
        } catch(NumberFormatException e) {
            System.out.println("There have been an error. Transaction failed");
        }
    }

    void checkAccount() {
        System.out.println("Money on you account:" + this.cash);
    }

    String exitMain() {
        return "See you soon";
    }

    static String optionMain() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    int input() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        try {
            input = String.valueOf(input);
            return Integer.parseInt(input);
        }
        catch(NumberFormatException e) {
            return 0;
        }
    }
}

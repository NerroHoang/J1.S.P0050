package view;

import static Controll.Manager.checkInputIntLimit;

/**
 *
 * @author hoang
 */
public class Menu {

    public static int menu() {
        System.out.println("1. Calculate Superlative Equation");
        System.out.println("2. Calculate Quadratic Equation");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int choice = checkInputIntLimit(1, 3);
        return choice;
    }

}

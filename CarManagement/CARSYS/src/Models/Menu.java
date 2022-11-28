package Models;

import java.util.Scanner;

public class Menu {
    public void run(){
        print("\nWelcome on Wheels on the South!\s");
        while(true){
            int temp = choice();
            switch(temp){
                case 1:
                    shop.asOwner();
                break;
                case 2:
                    shop.asBuyer();
                break;
                case 0:
                System.exit(0);
                break;
                default:
                print("\nInvalid\n");
            }
        }
    }

    int choice(){
        print("""
            
            \nYou are a :
            
            1. Owner
            2. Buy Car
            0. Exit
            
            -> \n""");
            int ownerChoice = sc.nextInt();
            sc.nextLine();
        return ownerChoice;
    }

    void print(Object o){
        System.out.print(o);
    }
    void println(Object o){
        System.out.println(o);
    }

    private final Scanner sc = new Scanner(System.in);
    private final Shop shop = new Shop();

}
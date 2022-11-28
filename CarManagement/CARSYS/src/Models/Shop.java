package Models;

import java.util.Scanner;

import Automobiles.Cars;
import java.util.ArrayList;

public class Shop {

    protected int i;
    
    void asOwner(){
        int temp = ownerChoice();
        if(temp == 1){
            addCar();
        }
        else if(temp == 2){
            viewCar();
        }
        else if(temp == 3){
            updateCar();
        }
        else if(temp == 4){
            deleteCar();
        }
        else if(temp == 0){
            System.exit(0);
        }
        else{
            print("\nInvalid\n");
        }
    }

    int ownerChoice(){
        print("""
                \n1. Add Car
                2. View Car
                3. Edit Car
                4. Delete Car
                0. Exit
                -> \s""");
                int choice = sc.nextInt();
                sc.nextLine();
                return choice;
    }
    void addCar(){
        print("Enter Car Brand: ");
        String brand = sc.nextLine();
        print("Enter Car Model: ");
        String model = sc.nextLine();
        print("Enter Car Engine: ");
        String engine = sc.nextLine();
        print("Enter Car Price: ");
        int price = sc.nextInt();
        sc.nextLine();
        print("Enter Car Horse Power: ");
        int hp = sc.nextInt();
        sc.nextLine(); 
        Cars car = new Cars(brand, model, engine,price,hp);   
        cars.add(car);
        }
    void viewCar(){
        int ctr = 1;
        for(Cars car: cars){
            println("[" + ctr + "]");
            car.Display();
            ctr++;
        }
        ctr = 1;
    }
    void updateCar(){
        viewCar();
        print("Enter the position you want to update: ");
        int choice = sc.nextInt();
        sc.nextLine();
        choice -= 1;
        print("""
                1. Edit Car Brand
                2. Edit Car Model
                3. Edit Car  Engine
                4. Edit Car Price
                5. Edit Car Horsepower
                0. Back
                ->\s""");
        int toEdit = sc.nextInt();
        sc.nextLine();
        switch(toEdit){
            case 1:
                print("Enter New Car Brand: ");
                String newbrand= sc.nextLine();
                cars.get(choice).setBrand(newbrand);
                break;
            
            case 2:
                print("Enter New Car Model: ");
                String newmodel= sc.nextLine();
                cars.get(choice).setModel(newmodel);
                break;
            
            case 3:
                print("Enter New Car Engine: ");
                String newengine = sc.nextLine();
                cars.get(choice).setEngine(newengine);
                break;

            case 4:
                print("Enter New Car Price: ");
                int newprice = sc.nextInt();
                cars.get(choice).setPrice(newprice);
                break;
            
            case 5:
                print("Enter New Car Horsepower: ");
                int newhp = sc.nextInt();
                cars.get(choice).setHorsepower(newhp);
                break;

        }
        println("\nUpdated Successfully!\n");

    }
    void deleteCar(){
        viewCar();
        print("Enter the position you want to update: ");
        int choice = sc.nextInt();
        sc.nextLine();
        choice -= 1;
        cars.remove(choice);
        println("\nRemoved Successfully!\n");
    }
    void asBuyer(){
        viewCar();
        print("Enter the car you want to buy:\n ");
        int toBuy = sc.nextInt();
        toBuy-=1;
        println("You bought:\n");
        cars.get(toBuy).Display();
        cars.remove(toBuy);
    }

    void print(Object o){
        System.out.print(o);
    }
    void println(Object o){
        System.out.println(o);
    }

    private final Scanner sc = new Scanner(System.in);
    private final ArrayList<Cars> cars = new ArrayList<>();

}
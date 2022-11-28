package Automobiles;

public class Cars {
    private String brand, model, engine;
    private int price, hp;

   public Cars(String brand, String model, String engine, int price, int hp){
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.price = price;
        this.hp = hp;

        println("\nAdded Successfully!\n");
    }
    public void Display(){
    println("Brand: " + brand);
    println("Model: " + model);
    println("Engine: " + engine);
    println("Price: " + price);
    println("Horse Power: " + hp);
    }
   
    // this is my setter
    
   public void setBrand(String brand){this.brand = brand;}
   public void setModel(String model){this.model = model;}
   public void setEngine(String engine){this.engine = engine;}
   public void setPrice(int price){this.price = price;}
   public void setHorsepower(int hp){this.hp = hp;}
  
   // this is my getters
   
   public String getBrand(){return this.brand;}
   public String getModel(){return this.model;}
   public String getEngine(){return this.engine;}
   public int getPrice(){return this.price;}
   public int getHorsepower(){return this.hp;}

    void print(Object o){
        System.out.print(o);
    }
     void println(Object o){
        System.out.println(o);
    }
}
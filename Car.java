Public Class Car {

    static String brand = "Toyota";
    static String color = "White";
  
void start(){
      System.out.println(brand + " car is driving")
    }  

void stop(){
      System.out.println(brand + " car has stopped")
    }
  
}

public static void main(String[] args) {
    MyCar = Car();
    
      MyCar.brand = "Honda";
      MyCar.color = "Blue";

    MyCar.start();
    MyCar.stop();
}

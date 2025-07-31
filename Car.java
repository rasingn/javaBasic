public class Car {

    static String color = "red"; 
    static char model = 'a';
    static int v= 1;
    static String[]maintenance={"A","B","c"};

    static void drive(String color){
        color ="pink";
        System.out.println("i have car with color "+ color+", model = "+model+" and v ="+v+", main ="+maintenance[2]);
             
    }

    public static void main(String[] args) {
        color="blue";
        drive("black");
        System.out.println();
        
    }



    
}
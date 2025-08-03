public class Book extends Cover {

   

     String Title ;
     String Auth ;


    Book(String Title, String Auth){
        this.Title=Title;
        this.Auth=Auth;
    }



     void print(){
        System.out.println(Title+" "+Auth);
    }

    


    
}

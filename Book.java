public class Book {

    private String Auth;
    private String Title;


    Book(String Auth, String Title){
       this.Title=Title;
       this.Auth=Auth;

    }

    void print(){
        System.out.println(Title+" - "+Auth);
    }
    
}

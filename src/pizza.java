import java.util.Scanner;

public class pizza {


    enum size {small, medium, large};
    enum Type {thin(50),thick(100);

        public static int price;
        Type(int price){
        this.price = price;
        }

        static int getPrice(){
            return price;
        }

    }
      public int getCostFromTypeOfCrust(String typeOfCrust){

       System.out.println("enter the type of crust");
          Scanner in = new Scanner(System.in);
          String toc = in.nextLine();
       return Type.getPrice();
      }



}

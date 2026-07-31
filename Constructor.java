public class Constructor {
    public static void main(String[] args) {
        //DEFAULT CONSTRUCTOR
        Mobile m1 = new Mobile();
        m1.name = "Samsung";
        m1.price = 50000;
        m1.model = "Galaxy A17";
        m1.os = "Android";
        
        System.out.println("DEFAULT CONSTRUCTOR");
        System.out.println("Name: " +m1.name);
         System.out.println("Price: " +m1.price);
         System.out.println("Model: " +m1.model);
         System.out.println("OS: " +m1.os);
         
         System.out.println("");
         System.out.println("----------------------------------------");
         
         //PARAMETERIZED CONSTRUCTOR
          System.out.println("PARAMETERIZED CONSTRUCTOR");
        Mobile m2 = new Mobile("Iphone", 55000,"16PRO" , "IOS");
        System.out.println("Name: " +m2.getname());
         System.out.println("Price: " +m2.getprice());
         System.out.println("Model: " +m2.getmodel());
         System.out.println("OS: " +m2.getos());
        
        System.out.println("");
         System.out.println("----------------------------------------");
        
        //COPY CONSTRUCTOR
        Mobile m3 = new Mobile(m1);
        System.out.println("COPY CONSTRUCTOR");
         System.out.println("Name: " +m3.getname());
         System.out.println("Price: " +m3.getprice());
         System.out.println("Model: " +m3.getmodel());
         System.out.println("OS: " +m3.getos());
        
}
}

//Creating classes 
//Default

class Mobile {
    String name;
    int price;
    String model;
    String os;

Mobile() {
    name = "NULL";
    price = 0;
    model = "NULL";
    os = "NULL";

}

//Parameterized
Mobile(String name , int price, String model , String os) {
    this.name = name;
    this.price = price;
    this.model = model;
    this.os = os;
}
    void setname(String name) {
    this.name = name;        
    }
    void setprice(int price) {
    this.price = price;
    }
    void setmodel(String model) {
    this.model = model;    
        
    }
    void setos(String os) {
    this.os = os;    
        
    }
    
    String getname() {
       return name; 
    }
    int getprice() {
        return price;
    }
    String getmodel() {
        return model ;
    }
    String getos() {
       return os;
    }
    
    //Copy
    Mobile(Mobile m) {
        this.name = m.name;
        this.price = m.price;
        this.model = m.model;
        this.os = m.os;
    }
    }
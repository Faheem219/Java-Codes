package OOP;

public class constructorClassCar {
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    public constructorClassCar(){
        this("None","None","None",0,false); // This is known as constructor
        // chaining, can only be done using this statement which will call the parametarized constructor
        // HAS TO BE THE FIRST LINE IN THE CODE
        System.out.println("Empty constructor called");
    }

    // This is known as constructor overlodaing, same as method overloading:
    public constructorClassCar(String make, String model, String color, int doors, boolean convertible){
        System.out.println("Constructor with parameters called");
        this.make=make;
        this.model=model;
        this.color=color;
        this.doors=doors;
        this.convertible=convertible;
    }

    public void describeCar(){
        System.out.println(doors+"-Door "+color+" "+make+" "+model+" "+(convertible?"Convertible":""));
    }
}

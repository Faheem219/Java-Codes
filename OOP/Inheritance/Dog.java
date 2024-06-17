package OOP.Inheritance;

public class Dog extends Animal{
    private String earShape;
    private String tailShape;

    public Dog(){
        super("Mutt","Big",50);
    }

    // This has both animal and dog specific fields, also super must be first statement
    public Dog(String type, double weight, String earShape, String tailShape){
        super(type, weight<15?"small":(weight<35?"medium":"large"),weight);
        this.earShape=earShape;
        this.tailShape=tailShape;
    }

    // This makes it even easier:
    public Dog(String type, double weight){
        this(type, weight, "Perky","Curled");
    }

    @Override
    public String toString() {
        return "Dog{"+"earShape='"+earShape+"\'"+", tailShape='"+tailShape+"\'"+"}"+super.toString();
    }

    // The following will OVERRIDE the method defined in animal (parent) class:
    public void makeNoise(){
        if(type=="Wolf"){ // if type was private in animal, even this subclass wont have access to it
            System.out.print("Ow Woooo! ");
        }
        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        // TODO Auto-generated method stub
        super.move(speed); // This will call the move method of parent class 
        if(speed=="slow"){
            walk();
            wagTail();
        }
        else{
            run();
            bark();
        }
        System.out.println();
    }

    // this method is private because it will be called from an existing public method in this class
    private void bark(){
        System.out.print("Woof! ");
    }

    private void run(){
        System.out.print("Dog Running ");
    }

    private void walk(){
        System.out.print("Dog Walking ");
    }

    private void wagTail(){
        System.out.print("Tail Wagging ");
    }
}

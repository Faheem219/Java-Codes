package OOP; // This is used to group classes together, name can be anything

public class Main {
    public static void main(String[] args) {
        // firstClassCar car=null; Doing this will invoke Null Pointer Exception
        System.out.println("\n=======================================");
        System.out.println("              Classes Demo             ");
        System.out.println("=======================================\n");

        firstClassCar car=new firstClassCar(); // Code to create a class, known as instantiation of a class
        car.describeCar();

        car.setMake("Porsche");
        System.out.println("make = "+car.getMake());

        System.out.println("\n=======================================");
        System.out.println("          Constructors Demo            ");
        System.out.println("=======================================\n");

        constructorClassCar car2=new constructorClassCar();
        car2.describeCar();

        constructorClassCar car3=new constructorClassCar("Tesla","Model X","Grey",4,false);
        car3.describeCar();

        System.out.println("\n=======================================");
        System.out.println("                 POJO Demo              ");
        System.out.println("=======================================\n");

        for(int i=1;i<5;i++){
            pojoExampleStudent s = new pojoExampleStudent("S123"+i,
            switch(i){
                case 1-> "Mary";
                case 2-> "Carol";
                case 3-> "Tim";
                case 4-> "Harry";
                default->"Anonymous";
            }, "21/05/2005", "Java Masterclass");
            System.out.println(s); // no need to write s.toString() as it is implicitly done if defined in class
        }

        System.out.println("\n=======================================");
        System.out.println("               Record Demo              ");
        System.out.println("=======================================\n");

        for(int i=1;i<5;i++){
            recordExampleStudent s = new recordExampleStudent("S123"+i,
            switch(i){
                case 1-> "Mary";
                case 2-> "Carol";
                case 3-> "Tim";
                case 4-> "Harry";
                default->"Anonymous";
            }, "21/05/2005", "Java Masterclass");
            System.out.println(s);
        }

        pojoExampleStudent s = new pojoExampleStudent("S23", "Ann", "21/05/2005", "Java");
        recordExampleStudent s1 = new recordExampleStudent("S23", "Ann", "21/05/2005", "Java");

        s.setClassList(s.getClassList()+" Masterclass");
        System.out.println(s.getName()+" is in "+s.getClassList());
        System.out.println(s1.name()+" is in "+s1.classList());
    }
}

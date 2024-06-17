package OOP.Inheritance;

public class theObjectClass extends Object{ // This is implicitly done, same as: extends java.lang.Object
    public static void main(String[] args) {
        
        Student max= new Student("Max", 21);
        System.out.println(max.toString()); // the default toString will print the class name followed by @
        // and a hashcode which is specific to the particular instance of a class

        // System.out.println(max); This is same as above

        PrimarySchoolStudent jimmy= new PrimarySchoolStudent("Jimmy", 8, "Carole");
        System.out.println(jimmy);
    }
}

class Student{
    private String name;
    private int age;

    Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name+" is "+age+" "+super.toString();
    }
}

class PrimarySchoolStudent extends Student{
    private String parentName;

    PrimarySchoolStudent(String name, int age, String parentName){
        super(name,age);
        this.parentName=parentName;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return parentName+"'s kid, "+super.toString();
    }
}
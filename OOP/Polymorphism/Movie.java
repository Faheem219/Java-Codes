package OOP.Polymorphism;

public class Movie {
    private String title;

    public Movie(String title){
        this.title=title;
    }

    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName(); // This refers to the current running instance
        // and it will return the runtime info on the executing class, getClass will give class name.
        System.out.println(title+" is a "+instanceType+" film");
    }

    // Here we are returning a Movie instance reference (Same as returning classes in C++):
    public static Movie getMovie(String type, String title){
        return switch(type.toUpperCase().charAt(0)){
            case 'A'->new Adventure(title);
            case 'C'->new Comedy(title);
            case 'S'->new ScienceFiction(title);
            default->new Movie(title);
        };
    }
}

// This will package wide access as it has no access modifier:
class Adventure extends Movie{

    public Adventure(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        // TODO Auto-generated method stub
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),"Pleasant Scene","Scary Music","Something bad happens");
    }

    public void watchAdventure(){
        System.out.println("Watching an Adventure!");
    }
}

class Comedy extends Movie{

    public Comedy(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        // TODO Auto-generated method stub
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),"Something funny happens","Even funnier","Happy Ending");
    }

    public void watchComedy(){
        System.out.println("Watching a Comedy!");
    }
}

class ScienceFiction extends Movie{

    public ScienceFiction(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        // TODO Auto-generated method stub
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),"Bad Aliens","Chase scene","Planet Blows");
    }

    public void watchScienceFiction(){
        System.out.println("Watching a Science Fiction thriller!");
    }
}
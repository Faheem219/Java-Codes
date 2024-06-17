package OOP.Polymorphism;

public class castingObjectVarRuntimeTesting {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();
        System.out.println();

        // Adventure jaws = Movie.getMovie("A", "Jaws"); This will not work, as Movie type not compatible
        // with adventure, so we can use casting to make this work:
        Adventure jaws = (Adventure)Movie.getMovie("A", "Jaws");
        //Adventure jaws = (Adventure)Movie.getMovie("C", "Jaws"); This will compile but will throw
        // a ClassCastException at runtime
        jaws.watchMovie();
        System.out.println();

        Object comedy =Movie.getMovie("C", "Airplane");
        // comedy.watchMovie(); This will not work as the method watchMovie isnt defined in the Object class
        Comedy comedy2 = (Comedy)comedy;
        comedy2.watchComedy();
        System.out.println();

        // Var is a special keyword in java that tells java to figure out the compile-time type for us,
        // this is known as type inference:
        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();
        System.out.println();

        var plane = new Comedy("Airplane");
        plane.watchComedy();
        System.out.println();

        // TESTING THE RUNTIME TYPE:
        Object unknownObject = Movie.getMovie("C", "Airplane");
        if(unknownObject.getClass().getSimpleName()=="Comedy"){
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        }
        else if(unknownObject instanceof Adventure){
            ((Adventure) unknownObject).watchAdventure();
        }
        else if(unknownObject instanceof ScienceFiction syfy){ // here, if the unknownObject is an instance
            // of ScienceFiction it is automatically typed as a ScieneFiction variable and assigned to
            // the binding variable which here is syfy
            syfy.watchScienceFiction();
        }
    }
}

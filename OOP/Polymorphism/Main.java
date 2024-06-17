package OOP.Polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Movie theMovie = new Movie("Star Wars");
        theMovie.watchMovie();
        System.out.println();

        // This is an example of polymorphism, the output of watchMovie() has changed based on the type of 
        // runtime instance
        Movie theAdventureMovie = new Adventure("Star Wars");
        theAdventureMovie.watchMovie();
        System.out.println();

        Movie theNewMovie = Movie.getMovie("Science Fiction", "Star Wars");
        theNewMovie.watchMovie();
        System.out.println();

        Scanner s = new Scanner(System.in);
        while(true){
            System.out.print("%nEnter type (A, C, S, or Q for quit): ");
            String type = s.nextLine();
            if("Qq".contains(type)) break;

            System.out.println("%nEnter movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
        s.close();
    }
}

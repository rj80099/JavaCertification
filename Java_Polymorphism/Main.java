import java.util.Scanner;

public class Main extends Object {

    public static void main(String[] args) {

        // Movie theMovie = new Movie("Star Wars");
        // theMovie.watchMovie();
        // Movie theMovieAd = new Adventure("Star Wars");
        // theMovieAd.watchMovie();

        //calling static method on movie
        //Movie thMovie = Movie.getMovie("AdvScenture", "Star Wars");
        Movie thMovie = Movie.getMovie("s", "Star Wars");
        thMovie.watchMovie();

        Scanner s = new Scanner(System.in);
        //List list = new ArrayList<String>();
        while(true) {
            System.out.println("Enter Type (A for Adenture, C for comedy, S for Science Fiction, or Q to quit): ");
            String type = s.nextLine();
            if("Qq".contains(type)){
                s.close();
                break;
            }
            System.out.println("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }   

    }   
}


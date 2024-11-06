/**Polymorphism
 * It's the ability to execute different behaviour, for different types, which are determine at runtime.
 * Polymorphism enables you to write generic code based on the base class or a parent class. And this code in the main method is executable, meaning
 * it doesn't have to change as new subclass become available.
 * This code can handle any instances that are a movie or subclass of moview that are returned from the factory method.
 * 
 */
public class Movie {
    
    private String title;

    public Movie(String title){
        this.title = title;
    }
    
    public void watchMovie(){
      String instanceType = this.getClass().getSimpleName();  //this -> class instance, getclass() -> method is on java.object.lang return classtype information about the runtime instance on which the medthod is executing,getSimpleName -> from getClass() we can get the name of the class.
      System.out.println(title + " is a " + instanceType + " film");
    }

    public static Movie getMovie(String type, String title)
    {
      //this is factory method in software  design patterns
      //Factory method gives a ways to obtain an object without having to know the details of how to create one
      return switch(type.toUpperCase().charAt(0)){
        case 'A' -> new Adventure(title);
        case 'C' -> new Comedy(title);
        case 'S' -> new ScienceFiction(title);
        default -> new Movie(title);
      };
    }

  }

  class Adventure extends Movie {
    public Adventure(String title){
      super(title);
    }

    @Override
    public void watchMovie()
    {
      super.watchMovie();
      System.out.printf("... %s%n".repeat(3),"Pleasent Scene",
      "Scary Music", "Something Bad Happens"                                             );
    }

    public void watchAdventure() {
      System.out.println("Watching an Adventure!");
    }
  }
  class Comedy extends Movie {
    public Comedy(String title){
      super(title);
    }

    @Override
    public void watchMovie()
    {
      super.watchMovie();
      System.out.printf("... %s%n".repeat(3),"happy ending",
      "Something funny happens", "Something even funnier Happens"                                             );
    }
    public void watchComdey() {
      System.out.println("Watching a Comedy!");
    }
  }
  class ScienceFiction extends Movie {
    public ScienceFiction(String title){
      super(title);
    }

    @Override
    public void watchMovie()
    {
      super.watchMovie();
      System.out.printf("... %s%n".repeat(3),"Bad aliens",
      "Space Guys", "Planet Blowup"                                             );
    }
    public void watchScienceFiction() {
      System.out.println("Watching an Science Fiction!");
    }
  }

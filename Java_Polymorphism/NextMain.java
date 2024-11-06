public class NextMain {
    public static void main(String[] args) {
        Movie thMovie = Movie.getMovie("A", "Jaws");
        thMovie.watchMovie();

        //compiler is not able to figure out the return type os Movie is an Adventure class instance
        //So resolve this issue we can cast the instances to advanture type 
        //Adventure jaws = Movie.getMovie("A", "Jaws");
        Adventure jaws = (Adventure)Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        //This won't work has it has to cast to movie type.
        Object comedy = Movie.getMovie("C", "Airplane");
        //Movie comedyMovie = (Movie) comedy;
        //comedy.watchComdey();  //Compiler is unable to determine the type of the class that gerneric object type comedy is hoilding
        //comedyMovie.watchComdey();  //compiler will only look into reference type and watchcomedy is not in movie class
    
       //After casting to comedy class it is ablt to compile and run
        Comedy comedyMovies = (Comedy)comedy;
        comedyMovies.watchComdey();


        //var is a special contextual keyword in java that lets our code take the advantage of Local variable Type Inference.
        //By using var we're telling java to figure out the compile-time type for us.


        var airplane = Movie.getMovie("C", "Ariplane");
        airplane.watchMovie();

        var plane = new Comedy("Arplane");
        plane.watchComdey();

        //LVTJ - Local variable type inference was introduced in Java 10.
        //One of the banifits is to help with readibility of code. Another is to reduce boierplate code.
        //The reason to call it LVTJ is:
        //1. It can't be used in field declaration on a class
        //2. It cannot be used in method signature, either as a parameter type or return type.
        //It can't be used without assignmet because the type can't be inferred in that clase
        //It can't be assgined a null literal, again because a type can't be inferred in that case.
        


        //run time vs compile type typing
        //Compile time type is a decalared type.This type is declared as a variable reference, a method return type, or a method parameter

        //In case of LVTJ, we don't explicity declare a type for the compilerd reference type Instead by thhe compiler, but the byte code generatied is the same as if we had declared the type.
    
    /** Leture 110: testing the runtime type using instanceof operator
 * 
 * Evalute What is the runtime type is 
 * How can test the actual runtime tyoe of a variable if its decalred type is defferent?
 * > We determine the runtime type of an object in several ways
 * 
 */

        Object unknownObject = Movie.getMovie("C", "Airplane");
        if(unknownObject.getClass().getSimpleName() == "Comdey"){
            Comedy c = (Comedy)unknownObject;
            c.watchComdey();
        }
        //instanceof Operator lets you test the type of an object or instance
        //The reference variable you are testing is the left Operator i.e unknownObject
        //the type you are testing for is the right Operand. i.e Adventure.
        //It's important to see that the advanture is not in quotes, meaning, i'm not testing the type name but the actual type itself.

        //This Operator return true if unknownObject is an instance of Adventure.

        else if (unknownObject instanceof Adventure)
        {

            ((Adventure)unknownObject).watchAdventure(); 
        } else if(unknownObject instanceof ScienceFiction syfy)  //this is pattern matching support that become part of Java 11
        {
            syfy.watchScienceFiction();;
        }
    }


    
}



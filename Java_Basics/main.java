public class main{
    //create metho to convert seconds to hour format 
    //validate the seconds and mins passed.
    public static void main(String[] args) {

        System.out.println(getDurationString(-3945));//first test case
        System.out.println(Math.PI);//second test case
    }

    public static String getDurationString(int seconds)
    {

        //Two step approach to get hour

        if(seconds<0)
            return "Invalid data for seconds(" +seconds+"), must be a positive interger value";
        int minutes = seconds/60;

        return getDurationString(minutes, seconds);
    }
    public static String getDurationString(int minutes,int seconds)
    {
        if(minutes<0)
            return "Invalid data for minutes(" +minutes+"), must be a positive interger value";
        
        if(seconds<0||seconds>59)
            return "Invalid data for seconds(" +seconds+"), must be between 0 and 59";

        int hours=minutes/60;
        System.out.println("hours ="+hours);

        int remainingMinutes = minutes%60;
        System.out.println("minutes= "+minutes);
        System.out.println("reaminingMinutes= "+remainingMinutes);

        int remainingSeconds= seconds%60;
        System.out.println("remainingSecond= "+remainingSeconds);

        return hours +"h "+remainingMinutes+"m "+remainingSeconds+"s";
    }

    public static String getQuarter(String month){
        return switch(month){
            case "JAN","FEB","MAR"->"1st";
            case "APR","MAY","JUNE"->"2nd";
            case "JULY","AUG","SEP"->"3rd";
            case "OCT","NOV","DEC"->"4th";
            default->{
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }
}

class Node{
    int data;
    Node next;
    public:
    Node(int val){
        this.data=val;
        this.next=null;
    }
}

Class MyLinkedList{
    Node head;
    int length;
    public:
    MyLinkedList(){
        head=null;
        length=0;
    }

}

public int get (int index){


}

public void addAtHead(int val){
    Node newHead = new Node(val);
    newHead.next = this.head;
}
/*
 * Minutes To Years and Days Calculator
Write a method printYearsAndDays with parameter of type long named minutes.

The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.

If the parameter is less than 0, print text "Invalid Value".

Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".

XX represents the original value minutes.
YY represents the calculated years.
ZZ represents the calculated days.



EXAMPLES OF INPUT/OUTPUT:

printYearsAndDays(525600);  → should print "525600 min = 1 y and 0 d"

printYearsAndDays(1051200); → should print "1051200 min = 2 y and 0 d"

printYearsAndDays(561600);  → should print "561600 min = 1 y and 25 d"



TIPS:

Be extra careful about spaces in the printed message.

Use the remainder operator

1 hour = 60 minutes

1 day = 24 hours

1 year = 365 days

NOTES

The printYearsAndDays method needs to be defined as public static ​like we have been doing so far in the course.

Do not add main method to solution code.

The solution will not be accepted if there are extra spaces


 * 
 * public class MinutesToYearsDaysCalculator {
    // write code here
    public static void printYearsAndDays(long minutes){
        if(minutes>=0)
        {
        long hour = minutes/ 60L;
        long days = hour / 24L;
        long year = days /365L;
        long daysLeft = days % 365L;
        
        System.out.println(minutes+" min"+" = "+year+" y and "+daysLeft+" d");
        }
        else
            System.out.println("Invalid Value");
    }
}
 */
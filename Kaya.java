import java.util.*;

public class Kaya{


    public static void main(String[] args){

Scanner input = new Scanner(System.in);



System.out.println( " enter the first velocity");

double v0 = input.nextDouble();

System.out.println( " enter the second velocity");

double v1 = input.nextDouble();

System.out.println( " enter the time");
int seconds = input.nextInt();


double acceleration = (v1 - v0)/seconds;


System.out.println( " the acceleration is " + acceleration);




    }
}  
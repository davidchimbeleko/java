import java.util.*;

public class Distance{


    public static void main(String[] args){

Scanner input = new Scanner(System.in);



System.out.println( " enter driving distance ");

double distance = input.nextDouble();


System.out.println( " enter miles per gallon ");
double miles = input.nextDouble();

System.out.println( " enter price per gallon");

double price = input.nextDouble();




double cost = (distance * price)/miles;

System.out.println( " the cost of driving is " + cost);

    }
}  


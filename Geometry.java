import java.util.*;

public class Geometry{


    public static void main(String[] args){

Scanner input = new Scanner(System.in);



System.out.println( " enter x1 & y1 ");

double x1 = input.nextDouble();



double y1 = input.nextDouble();

System.out.println( " x2 & y2");

double x2 = input.nextDouble();

double y2 = input.nextDouble();

double pointA = Math.pow((x2-x1),0.5);

double pointB = Math.pow((y2-y1),0.5);

double distance = Math.pow( ( pointA + pointB),0.5);


System.out.println( " the distance is " + distance);










    }
}  
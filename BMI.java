import java.util.*;

public class BMI{

public static void main(String[] args){


Scanner input = new Scanner(System.in);

System.out.println( " enter weight in pounds");

double weight = input.nextDouble();

System.out.println( " enter height in  inches");

double height = input.nextDouble();

double weightinkgs = weight * 0.45359237;

double heightinkgs = height * 0.0254;


double BMI = weightinkgs * heightinkgs;

System.out.println( " BMI is :" + BMI);




}



}
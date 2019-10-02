import java.lang.Math;

 import java.util.Scanner;



 public class sr1 {



     public static void main(String[] args) {

         Scanner in = new Scanner(System.in);

System.out.print("Enter a length: ");

double rectLength = in.nextDouble();



System.out.print("Enter a width: ");

double rectWidth = in.nextDouble();







double rectArea = rectLength*rectWidth;








System.out.printf("\nThe area of a" +rectLength+"-by-"+rectWidth+" rectangle is %.1f.\n", rectArea);



   in.close();

 }
}

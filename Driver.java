package message;

public class Driver{

public static void main(String[] args){

int b[] = {11 , 13}; // with curly brackets being empty, the exception will be thrown.

printAverage(b);
}
public static int average(int[] a) {
   int total = 0; 
   for(int i = 0; i < a.length; i++)
     total += a[i]; 
   return total / a.length; 
} 
public static void printAverage(int[] a) {
   try {
      int avg = average(a);
      System.out.println("the average is: " + avg); 
   }
   catch(ArithmeticException e) {   
      System.out.println("error calculating average");
   } 
}}

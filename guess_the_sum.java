import java.util.Scanner;
public class ex2 {
public static void main(String args[]) {
Scanner input = new Scanner(System.in); int min = 0;
int max = 100;
int a = (int)(Math.random()*(max-min+1)+min);
int b = (int)(Math.random()*(max-min+1)+min);
System.out.println("Add the two numbers: " + a + " " + b);
Double n = input.nextDouble();
if (n!= a+b) {
while (a + b != n) {
}
System.out.println("That's not the right answer..");
System.out.println("Add the two numbers: " + a + " " + b); Double m = input.nextDouble();
n = m;
}
System.out.println("That's the correct answer!");

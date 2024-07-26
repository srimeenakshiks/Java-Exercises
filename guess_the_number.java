import java.util.Scanner;
public class ex2 {
public static void main(String args[]) {
Scanner input = new Scanner(System.in); int min = 0;
int max = 100;
int a = (int)(Math.random()*(max-min+1)+min); System.out.println("Guess the number!"); Double n = input.nextDouble();
if (n!= a) {
while (a != n) {
System.out.println("That's not the number.."); if (n> a){
}
System.out.println("Your answer is greater than the actual number!");
else if (n <a) {
}
System.out.println("Your answer is lower than the actual number!");
System.out.println("Guess the number!");
Double m = input.nextDouble();
n=m;
}
System.out.println("That's the correct answer!");

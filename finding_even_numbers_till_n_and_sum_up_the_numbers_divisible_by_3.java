import java.util.Scanner;
public class hello_world {
public static void main(String args[]) { Scanner input = new Scanner(System.in); System.out.println("n: ");
Double n = input.nextDouble();
double sum = 0;
for(int i = 0; i < n+1; i++) {
}
if (1%2==0) {
}
if (i%3 == 0) {
}
sum += i;
System.out.println("The sum is " + sum);

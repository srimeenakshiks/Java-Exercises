import java.util.Scanner;
public class Main {
public static void main(String[] args) { Scanner input = new Scanner(System.in); System.out.println("number of rows: "); int r = input.nextInt();
System.out.println("number of columns: "); int c = input.nextInt(); int[][] array = new int[r][c]; for(int i=0; i<r; i++){ for(int j=0; j<c; j++) { System.out.println("Enter: "); array[i][j] = input.nextInt();
for (int i=0; i<r; i++) { for (int j=0; j < c; j++) { System.out.print(array[i][j] + " ");
System.out.println();

import java.util.*;

public class Allmatrix {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

int[][] A = new int[2][2];

int[][] B = new int[2][2];

int[][] result = new int[2][2];

System.out.println("enter the numbers for first 2x2 matrix :");
for(int i=0; i<2; i++)
for(int j=0; j<2; j++)
A[i][j] = sc.nextInt();


System.out.println("enter the numbers for second 2x2 matrix :");
for(int i=0; i<2; i++)
for(int j=0; j<2; j++)
B[i][j] = sc.nextInt();

System.out.println("addition of 2x2 matrix :");
for(int i=0; i<2; i++){
for(int j=0; j<2; j++){
result[i][j] = A[i][j]+B[i][j];
System.out.println(result[i][j] + " ");
}}
  
}
}
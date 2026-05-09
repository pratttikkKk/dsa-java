import java.util.Scanner;

class Stack{
private int[] stackarray;
private int top;
private int capacity;

public Stack(int size){
capacity=size;
stackarray = new int[capacity];
top=-1;
}
public void push(int element){
if(top == capacity-1){
System.out.println("stack is overflow");
}
else{
stackarray[++top]=element;
System.out.println("element pushed successfully."+element);
}
}
public void pop(){
if(top == -1){
System.out.println("stack is underflow.");
}
else{
int popelement = stackarray[top--];
System.out.println("element poped successfully." + popelement);
}
}
}
public class StackOperations{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.println("Enter the size of the stack array:");
int size = sc.nextInt();
Stack st = new Stack(size);

int choice;
do{

System.out.println("1. push the element");
System.out.println("2.pop the element");
System.out.println("3.");
choice = sc.nextInt();

switch(choice){
case 1:
System.out.println("enter the element to push:");
int element = sc.nextInt();
st.push(element);
break;

case 2:
st.pop();
break;

default :
System.out.println("select valid number.");
}
}
while(choice != 2);
sc.close();
}
}





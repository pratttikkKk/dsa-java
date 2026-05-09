class Employee{
private String firstname;
private String lastname;
private double monthlysalary;

public Employee(String firstname, String lastname, double monthlysalary){
this.firstname=firstname;
this.lastname=lastname;

if(monthlysalary > 0){
this.monthlysalary= monthlysalary;
}
else{
this.monthlysalary = 0.0;
}
}

public void setfirstname(String firstname){
this.firstname=firstname;
} 
public void setlastname(String lastname){
this.firstname=lastname;
} 

public void setmonthlysalary(double monthlysalary){
if(monthlysalary > 0){
this.monthlysalary= monthlysalary;
}
else{
this.monthlysalary = 0.0;
}
} 

public String getfirstname(){
return firstname;
}

public String getlastname(){
return lastname;}

public double getmonthlysalary(){
return monthlysalary;
}

public void raisesalary(double percent){
if (percent > 0){
monthlysalary = monthlysalary +(monthlysalary * percent/100);
}
}

public double yearlysalary(){
return monthlysalary*12;
}
}
public class EmployeeTest{
public static void main(String args[]){
Employee e1 = new Employee("pratik","farate",100);
Employee e2 = new Employee("Rohit","sharma",1000);

System.out.println("Before 10% raise: ");
System.out.println(e1.getfirstname()+" " +e1.getlastname() +" " + "yearlysalary: "+e1.yearlysalary());
System.out.println(e2.getfirstname()+" " +e2.getlastname() +" " + "yearlysalary: "+e2.yearlysalary());

e1.raisesalary(10);
e2.raisesalary(10);

System.out.println("afetr 10% raise: ");
System.out.println(e1.getfirstname()+" " +e1.getlastname() +" " + "yearlysalary: "+e1.yearlysalary());
System.out.println(e2.getfirstname()+" " +e2.getlastname() +" " + "yearlysalary: "+e2.yearlysalary());






}
}
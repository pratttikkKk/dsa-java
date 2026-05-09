public class Employee{
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

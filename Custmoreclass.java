import java.util.Scanner;

public class Custmoreclass {
	Scanner sc = new Scanner(System.in);
  private String name;
  private String gmail;
  private int age;
  private double creadit_limit;
  private double salary;
   public void accept() {
	   
	   System.out.println("ente the name of customer");
	   name=sc.next();
	   System.out.println("enter the gmail of cust");
       gmail=sc.next();
       System.out.println("enter the age ");
       age=sc.nextInt();
       System.out.println("enter the salary");
       salary=sc.nextInt();
       
   }
 void setlimit(double salary2)
   {
	   if(salary2<25000)
	   {
		   System.out.println("customer credit limit is 25000");
	   }
	   else if(salary2>=25000)
	   {
		   System.out.println("customer credit limit is 50000");
	   }
	   else  {
		   System.out.println("customer credit limit is 75000");
	   }
   }
   public void display()
   {
	  
	   System.out.println("name ::-"+name);
	  
	   setlimit(salary);
	   
   }
}

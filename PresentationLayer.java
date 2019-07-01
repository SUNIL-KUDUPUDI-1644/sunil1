package com.cg.eis.pl;
import java.util.Scanner;



import com.cg.eis.bean.Employee;
import com.cg.eis.service.ServiceLayer;

 

public class PresentationLayer
{
    public static void main(String[] ar)  
{
    ServiceLayer slc=new ServiceLayer();
    Scanner s=new Scanner(System.in);
    System.out.println("Enter Employee Details:");
    System.out.print("Enter id:");
    int id=s.nextInt();
    System.out.print("Enter name:");
    String name=s.next();
    System.out.print("Enter Employee salary:");
    int salary=s.nextInt();
    System.out.print("Enter Employee designation:");
    String design=s.next();
    
    
    Employee e=new Employee(id,name,salary,design);
    slc.storeEmployee(e);
    Employee e1=slc.returnToPl();
    System.out.println(e);
    slc.storeInsurance(e);
    String s3=slc.returnInsurancetoPl();
    System.out.println("Insurance Scheme is "+s3);

 
 

}
}

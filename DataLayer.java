
package com.cg.eis.dao;

 

import java.util.ArrayList;

 

import com.cg.eis.bean.Employee;
import com.cg.eis.service.ServiceLayer;

 

public class DataLayer {
    ArrayList<Employee> a=new ArrayList<Employee>();
    ArrayList<String> a1=new ArrayList<String>();
    Employee e=new Employee();

 

    public void finalStore(Employee e) 
    
    {    //ServiceLayerClass s11=new ServiceLayerClass();
    
        a.add(e);
        
    }
    
    public Employee returnEmployee()
    {
        Employee e1=(Employee)a.get(0);
        return e1;
        
    }

 

    public void addInsurance(String s) 
    {
        a1.add(s);
        
    }
    public String returnInsurance()
    {
        
        String s1=(String)a1.get(0);
        return s1;
        
    }

 




}








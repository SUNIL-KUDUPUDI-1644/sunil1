package com.cg.eis.service;
import com.cg.eis.dao.DataLayer;
import com.cg.eis.bean.Employee;

 

public class ServiceLayer
{
    public ServiceLayer() {}
    Employee e=new Employee();
DataLayer d=new DataLayer();
public void storeEmployee(Employee e)
{
      d.finalStore(e);
}
public Employee returnToPl()
{
    d.returnEmployee();
    return e;
}
public void storeInsurance(Employee e)
{
    if((e.salary>=5000 && e.salary<20000)&&(e.design.equals("Associate")))
            {
        d.addInsurance("Scheme C");
            }
    else if((e.salary>=20000 && e.salary<40000)&&(e.design.equals("Programmer")))
    {
        d.addInsurance("Scheme B");
    }
    else if((e.salary>=40000)&&(e.design.equals("Manager")))
    {
        d.addInsurance("Scheme A");
    }
    else if((e.salary<5000)&&(e.design.equals("Clerk")))
    {
        d.addInsurance("NO Scheme");
    }
    else
    {
        d.addInsurance("Please check the given details");
    }
}
public String returnInsurancetoPl()
{
    String s2=d.returnInsurance();
    return s2;
}
}

 






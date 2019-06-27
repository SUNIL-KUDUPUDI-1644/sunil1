package com.capg.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.lang.*;

import com.capg.mobile.Mobile;


public class Daoimp implements Dao{
private static Map<Integer,Mobile> l1 = new HashMap<Integer,Mobile>();
private static List<Mobile> l2 = new ArrayList<Mobile>();	
private static List<Mobile> l4 = new ArrayList<Mobile>();
	static{
		Mobile m1=new Mobile("Nokia",100,12000);
		Mobile m2=new Mobile("Samasung",101,12500);
		Mobile m3=new Mobile("Apple",102,30000);
		Mobile m4=new Mobile("Zsas",103,23000);
		l1.put(100,m1);
		l1.put(101,m2);
		l1.put(102,m3);
		l1.put(103, m4);
	}
	List<Integer> l3 = new ArrayList<Integer>();
	@Override
	public void sortById() {
		Mobile m = new Mobile();
		for(Map.Entry<Integer, Mobile> entry:l1.entrySet())
		{
		l2.add(entry.getValue());
		l3.add(entry.getValue().getMobid());
		
	}
		Collections.sort(l3);;
		for(int i=0;i<l3.size();i++)
		{
			System.out.println(getMobid(l3.get(i)));
		}

}
public Mobile getMobid(int mobid) {
		Mobile m = new Mobile();
	for(Mobile m1 : l2)
	{
		for(int i=0;i<=3;i++)
		{
		if(m1.getMobid()==mobid)
		{
			m=m1;
	
			
		}
		}
		
	}
		return m;
	}


							/*SORT BY NAME*/
List<String> l5 = new ArrayList<String>();
@Override
public void sortByName() {
	Mobile m = new Mobile();
	for(Map.Entry<Integer, Mobile> entry:l1.entrySet())
	{
	l2.add(entry.getValue());
	l5.add(entry.getValue().getName());

	
}
	Collections.sort(l5);;
	System.out.println(l5);
	for(int i=0;i<l5.size();i++)
	{
		System.out.println(getName(l5.get(i)));
	}
}
public Mobile getName(String name) {
	Mobile m = new Mobile();
for(Mobile m1 : l2)
{
	for(int i=0;i<=3;i++)
	{
	if(m1.getName().equalsIgnoreCase(name))
	{
		m=m1;
		
		
	}
	}
	
}
	return m;
}



							/*SORT BY PRICE*/


List<Integer> l6 = new ArrayList<Integer>();
@Override
public void sortByPrice() {
	Mobile m = new Mobile();
	for(Map.Entry<Integer, Mobile> entry:l1.entrySet())
	{
	l2.add(entry.getValue());
	l6.add(entry.getValue().getPrice());
	
}
	Collections.sort(l6);
	System.out.println(l6);
	for(int i=0;i<l6.size();i++)
	{
		System.out.println(getPrice(l6.get(i)));
	}

}
public Mobile getPrice(int price) {
	Mobile m = new Mobile();
for(Mobile m1 : l2)
{
	for(int i=0;i<=3;i++)
	{
	if(m1.getPrice()==price)
	{
		m=m1;
		
	}
	}
	
}
	return m;
}
				/*DELETEING RECORD*/
@Override
public void delete(int k) {
	Mobile m4 = new Mobile();
	for(Map.Entry<Integer, Mobile> entry:l1.entrySet())
	{
	l2.add(entry.getValue());
	}
	for(Mobile m1 : l2)
	{
		for(int i=0;i<=3;i++)
		{
		if(m1.getMobid()==k)
		{
			m4=m1;
			
		}
		}
		
	}
	l2.remove(m4);
	System.out.println(l2);
			
}
	
		
			
}






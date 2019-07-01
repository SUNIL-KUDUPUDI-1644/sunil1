package com.in;

interface  Power
{
    public int cal(int x,int y);
}

public class Excercise1 {

    public static void main(String[] args)
    {
    Power p=(v,z)->{
        int res=1;
        for(int i=1;i<=z;i++)
        res=res*v;
        return res;
    };
    int res=p.cal(2, 3);
    System.out.println(res);
    }

    }
 


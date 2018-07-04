z=int(input("enter year"))
if z>=1 and z<=100000:
    if z>=1 and z<400:
        if(z%4==0) and z%100!=0:
            print("leap year")
        else:
            print("non leap year")
    elif z>=400 and z<=100000:
         if z%400==0 or z%4==0:
             print("leap year")
         else:
             print("non leap year")
else:
    print("invalid")

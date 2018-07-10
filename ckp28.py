a=int(input())
c=int(a/2)
for g in range(1):
    for b in range(a,c,-1):
        z=0
        k=b
        e=[]
        h=0
        while(b!=0):
            d=b%10
            if(d==0 and b==0):
                break
            e.append(d)
            b=int(b/10)
        for f in range(0,len(e)):
            h=h+e[f]
        if((h+k)==a):
            z=z+1
            print(z)
            print(k)
            
        

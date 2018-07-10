s=[]
n=int(input())
if(1<=n<=100000):
    a=input()
    s.extend([int(x) for x in a.split()])
    swap=0
    for j in range(0,n):
        for k in range(j+1,n):
            if(s[j]<s[k]):
                swap=s[j]
                s[j]=s[k]
                s[k]=swap
    k=len(s)
    o=[]
    num=0
    d=k-1
    for h in range(0,k):
        t=s[h]*(10**d)
        d=d-1
        o.append(t)
        num=num+t
    print(num)
   
         
            

n,q=input().split()
n=int(n)
q=int(q)
y=0
for i in range(n,(q+1)):
    a=[]
    x=0
    a=list(bin(i))
    b=a[2:]
    k=0
    for i in range(0,len(b)):
        if(int(b[i])==1):
            k=k+1
    for j in range(k,0,-1):
        if(k%j==0):
            x=x+1
    if(x==2):
        y=y+1
print(y)

q=int(input("enter the number"))
n1=q
s=[]
t=[]
y=[]
for i in range(0,10000000000):
        k=n1%10
        if(k==0 and n1==0):
            break
        s.append(k)
        n1=int(n1/10)
e=len(s)
print(e)
print(s)
r=int(input("enter digits to remove"))
n3=e-r
t=s[:n3]
print(t)
swap=0
for m in range(0,len(t)):
    for n in range(m+1,len(t)):
        if(t[m]>t[n]):
            swap=t[m]
            t[m]=t[n]
            t[n]=swap
x=len(t)
print(t)
num=0
g=x-1
for z in range(0,x):
    d=t[z]*(10**g)
    num=num+d
    g=g-1
print(num)
    

            

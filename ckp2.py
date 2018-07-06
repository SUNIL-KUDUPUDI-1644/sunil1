q=int(input("enter the number"))
s=[]
t=[]
y=[]
for i in range(0,10):
        k=q%10
        if(k==0):
            break
        s.append(k)
        q=int(q/10)
e=len(s)
print(e)
print(s)
r=int(input("enter digits to remove"))
for j in range(0,r):
    print("element to remove")
    k=int(input("enter the no."))
    t.append(k)
print(t)
y=list(set(s)-set(t))
print(y)
swap=0
for m in range(0,len(y)):
    for n in range(m+1,len(y)):
        if(y[m]>y[n]):
            swap=y[m]
            y[m]=y[n]
            y[n]=swap
x=len(y)
print(y)
num=0
g=x-1
for z in range(0,x):
    d=y[z]*(10**g)
    print(d)
    num=num+d
    g=g-1
print(num)
    

            

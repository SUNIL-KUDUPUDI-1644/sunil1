a=int(input())
s=[]
b=[]
c=[]
n3=0
b=input()
s.extend([int(x) for x in b.split()])
for i in range(1,(len(s))):
    b=s[:i]
    c=s[(i):]
    n1=0
    n2=0
    for j in range(0,len(b)):
        n1=n1+b[j]
    n1=n1/(len(b))
    for k in range(0,len(c)):
        n2=n2+c[k]
    n2=n2/(len(c))
    if(n1==n2):
        n3=n3+1
if(n3>=1):
    print("yes")
else:
    print("no")

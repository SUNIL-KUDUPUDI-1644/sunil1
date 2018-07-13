n=int(input())
s=[]
q=[]
z=[]
p1=[]
a=input()
p1.extend([int(x) for x in a.split()])
p2=sorted(p1)
s=p2[::-1]
for i in range(0,len(s)):
    d=bin(s[i])
    q=list(d)
    b=q[2:]
    k=0
    x=0
    y=0
    for j in range(0,len(b)):
        if(int(b[j])==1):
            k=k+1
    z.append(k)
from collections import defaultdict
d = defaultdict(list)
for n2 in range(0,len(s)):
    d[s[n2]].append(z[n2]) 
import operator
for n6 in range(0,len(d)):
    n5=max(d.items(), key=operator.itemgetter(1))[0]   
    del d[n5]
    print(n5)

        
        

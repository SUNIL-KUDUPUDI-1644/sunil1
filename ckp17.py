a,b=input().split()
a=int(a)
b=int(b)
s=[]
z=0
c=input()
s.extend([int(x) for x in c.split()])
for j in range(0,len(s)):
    for k in range(j+1,len(s)):
        if(s[j]+s[k]==b):
            z=z+1
if(z>0):
    print("yes")
else:
    print("no")
            
        
            
            

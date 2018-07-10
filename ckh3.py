q=int(input())
s=[]
l=[]
if(1<=q<=100000):
   a=input()
   s.extend([int(x) for x in a.split()])
   for k in range(0,q):
       if(k==s[k]):
           l.append(k)
   for m in range(0,len(l)):
       print(l[m],end=" ")
   j=len(l)
   if(j==0):
       print("-1")
        
    

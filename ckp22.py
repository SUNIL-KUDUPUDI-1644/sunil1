w=int(input())
s=[]
q=input()
s.extend([int(x) for x in q.split()])
add=0
add1=0
for i in range(0,len(s),2):
    add=add+s[i]
for j in range(1,len(s),2):
    add1=add1+s[j]    
if(add>add1):
    print(add)
else:
    print(add1)
    
    

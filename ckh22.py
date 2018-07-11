a=int(input())
s=[]
k=[]
b=input()
s.extend([int(x) for x in b.split()])
num=1
for i in range(0,len(s)):
    num=num*s[i] 
for j in range(0,len(s)):
         k.append(str(int((num)/s[j]))+" ")
p=""
for z in k:
    p+=z
print(p[:(len(p)-1)])

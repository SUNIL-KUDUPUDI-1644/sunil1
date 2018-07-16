d,b=input().split()
d=int(d)
b=int(b)
s=[]
j=input()
s.extend(int(x) for x in j.split())
l=int(input())
a=0
for i in range(0,len(s)):
    a=a+s[i]
x=((a//2)-(s[b]//2))
if(x==l):
    print("Bon Apptit")
else:
    print(l-x)

a=int(input())
k=0
s=[]
b=input()
s.extend([int(x) for x in b.split()])
for z in range(0,len(s)):
    k=k+s[z]
print(k)

a,b=input().split()
a=int(a)
b=int(b)
s=[]
c=input()
s.extend([int(x) for x in c.split()])
for i in range(0,len(s)):
    for j in range(i+1,len(s)):
        if(s[i]<s[j]):
            swap=s[i]
            s[i]=s[j]
            s[j]=swap
print(s[b-1])

        
    

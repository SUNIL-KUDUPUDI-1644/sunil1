s=[]
z=int(input())
b=input()
s.extend([int(x) for x in b.split()])
for i in range(0,len(s)):
    for j in range(i,len(s)):
        if(s[i]>s[j]):
            swap=s[i]
            s[i]=s[j]
            s[j]=swap
k=[]
p=len(s)
for l in range(len(s)):
    p=p-1
    if((len(s)%2)!=0):
        k.append(s[p])
        if(l==p):
            break;
        k.append(s[l])
    else:
        k.append(s[p])
        k.append(s[l])
        if(p-l==1):
            break;
n2=[]
for n1 in range(0,len(k)):
         n2.append(str(k[n1])+" ")
n3=""
for n4 in n2:
    n3+=n4
print(n3[:(len(n3)-1)])       

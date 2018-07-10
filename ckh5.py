w=int(input())
s=[]
q=[]
a=[]
b=input()
s.extend([int(x) for x in b.split()])
for j in range(0,w):
    for k in range(j+1,w):
        if(s[j]==s[k]):
            q.append(s[j])
a=set(s)-set(q)
z=list(a)
for l in range(0,len(z)):
    print(z[l],end=" ")

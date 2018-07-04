w=int(input("enter the no."))
s=[]
q=[]
for i in range(0,w):
    s.append(int(input("enter the no.")))
print(s)
for j in range(0,w):
    for k in range(j+1,w):
        if(s[j]==s[k]):
            q.append(s[j])
print(q)
e=len(q)
for l in range(0,e):
    for m in range(l+1,e):
        if(q[l]<q[m]):
            swap=q[l]
            q[l]=q[m]
            q[m]=swap
print(q)
        

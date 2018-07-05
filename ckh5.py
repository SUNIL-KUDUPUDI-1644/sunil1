w=int(input("enter the no."))
s=[]
q=[]
a=[]
for i in range(0,w):
    s.append(int(input("enter the no.")))
print(s)
for j in range(0,w):
    for k in range(j+1,w):
        if(s[j]==s[k]):
            q.append(s[j])
print(q)
a=set(s)-set(q)
print(a)        

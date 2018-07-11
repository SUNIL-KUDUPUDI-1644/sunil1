w,e=input().split()
w=int(w)
e=int(e)
if(w>=e):    
    s=[]
    q=[]
    a=[]
    f=[]
    b=input()
    s.extend([int(x) for x in b.split()])
    c=input()
    q.extend([int(x) for x in c.split()])
    for m in q:
        if m not in s:
            f.append(m)
    if(len(f)==0):
        for k in range(0,e):
            for l in range(0,w):
                if(q[k]==s[l]):
                    a.append(s[l])
        if(len(a)<=len(s)):
            print("YES")
    else:
        print("NO")


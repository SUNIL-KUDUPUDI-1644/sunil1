n,q=input().split()
n=int(n)
q=int(q)
s=[]
g=[]
h=[]
t=[]
a=input()
s.extend([int(x) for x in a.split()])
for j in range(0,q):
    u,v=input().split()
    u=int(u)
    v=int(v)
    g.append(u)
    h.append(v)
for k in range(0,q):
    t=s[(g[k]-1):(h[k]+1)]
    for l in range(0,len(t)):
        for m in range(l+1,len(t)):
            if(t[l]>t[m]):
                swap=t[l]
                t[l]=t[m]
                t[m]=swap
    print(t[0])

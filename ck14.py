n=int(input("enter the no. n"))
q=int(input("enter the no. q"))
s=[]
g=[]
h=[]
t=[]
for i in range(0,n):
    s.append(int(input("enter numbers")))
print(s)
for j in range(0,q):
    u=int(input("enter u"))
    g.append(u)
    v=int(input("enter v"))
    h.append(v)
for k in range(0,q):
    t=s[(g[k]-1):(h[k])]
    num=0
    for l in range(0,len(t)):
        num=num^t[l]
    print(num)

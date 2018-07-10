a=int(input())
l=[]
for x in range(a):
    j=input("")
    l.append(j)
c=[]
for i in range(len(l)):
    c.append(list(l[i]))
for k in range(1):
    for h in range(len(c[k])):
        if(c[k][h]==c[k+1][h]):
            print(c[k][h],end="")
        else:
            break

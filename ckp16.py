b=int(input())
j=[]
c=input()
j.extend([int(x) for x in c.split()])
print(j)
for z in range(0,len(j)):
    for k in range(z+1,len(j)):
        if(j[z]>j[k]):
            swap=j[z]
            j[z]=j[k]
            j[k]=swap
d=0
p=0
print(j)
for l in range(1,len(j)):
    if(j[l-1]==j[l]):
        p=p+d
    else:
        d=d+1
        p=p+d
print(p+len(j))

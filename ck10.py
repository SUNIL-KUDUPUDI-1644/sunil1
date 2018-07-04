q=int(input("enter the no."))
count=0
for i in range(1,10):
    l=int(q/10)
    if(l!=0):
        count=count+1
        q=l
f=count+1
print(f)

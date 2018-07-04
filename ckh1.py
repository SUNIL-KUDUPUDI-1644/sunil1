n=int(input("enter number"))
s=[]
d=[]
for i in range(0,n):
    s.append(int(input("enter elements")))
print(s)
for j in range(0,n):
    for k in range(j+1,n):
        if(s[j]==s[k]):
            d.append(s[j])
if(len(d)!=0):
    print(d[0])
else:
    print("unique")
            

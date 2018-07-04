e=int(input("enter the no."))
s=[]
for i in range(0,e):
    s.append(int(input("enter the elements")))
print(s)
for j in range(0,e):
    if ((j%2==0) and (s[j]%2!=0)) or ((j%2!=0) and (s[j]%2==0)):
        print(s[j])

n=int(input("enter number N"))
k=int(input("enter number K"))
s=[]
for i in range(1,n+1):
    q=int(input("enter the element in array"))
    s.append(q)
print(s)
for j in range(0,k):
    l=s[j]+s[j+1]
print(l)

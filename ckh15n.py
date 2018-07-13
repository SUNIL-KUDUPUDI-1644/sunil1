s=int(input())
a=[]
b=input()
a.extend([int(x) for x in b.split()])
maxi=0
z=0
for i in range(0,len(a)):
        z= z+a[i]
        if (maxi<z):
            maxi=z
        if z< 0:
            z=0 
print(maxi)
    

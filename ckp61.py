n1=input()
n2=input()
p=""
j=0
for i in range(0,len(n1)):
    d=(ord(n1[i])-96+ord(n2[i])-96)
    if(d<=26):
        p+=chr(96+d)
    else:
        z=d-26
        p+=chr(96+z)
print(p)
    

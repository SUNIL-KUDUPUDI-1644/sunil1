w=int(input("enter the no."))
s=[]
q=[]
for i in range(0,w):
    s.append(int(input("enter the no.")))
print(s)
for j in range(0,w):
    for k in range(j+1,w):
        for l in range(k+1,w):
            if(s[j]+s[k]==s[l]):
                print(s[j])
                print(s[k])
                print(s[l])
                print("\n")

        

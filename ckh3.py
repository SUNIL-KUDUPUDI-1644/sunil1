q=int(input("enter no."))
s=[]
l=[]
if(1<=q<=100000):
    for w in range(0,q):
        s.append(int(input("enter elements")))
    print(s)
    for k in range(0,q):
        if(k==s[k]):
            l.append(k)
    print(l)
    s=len(l)
    if(s==0):
        print("'-1'")
        
    

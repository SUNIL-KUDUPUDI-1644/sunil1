print("first no. should be greater than 2nd")
w=int(input("enter the 1st no."))
e=int(input("enter the 2nd no."))
if(w>e):    
    s=[]
    q=[]
    a=[]
    f=[]
    for i in range(0,w):
        s.append(int(input("enter the 1st array")))
    print(s)
    for j in range(0,e):
        q.append(int(input("enter the 2nd array")))
    print(q)
    for m in q:
        if m not in s:
            f.append(m)
    if(len(f)==0):
        for k in range(0,e):
            for l in range(0,w):
                if(q[k]==s[l]):
                    a.append(s[l])
        if(len(a)<=len(s)):
            print("yes")
        else:
            print("no")
    else:
        print("not subset")
else:
    print("enter again")


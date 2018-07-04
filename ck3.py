char=input("enter a char=\n")
if (char>='a' and char <='z') or (char>'A' and char<'Z'):
   if char=='a' or char=='e' or char=='i' or char=='o' or char=='u':
       print("vowel")
   else:
       print("const")    
else:
    print("invalid syntax")

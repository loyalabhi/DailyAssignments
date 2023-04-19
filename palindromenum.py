n=int(input("Enter a number : "))
rev=0
rem=0
ori=n
while(n!=0):
    rem=n%10
    rev=rev*10+rem
<<<<<<< HEAD
    n=n//10
if (rev==ori):
    print("Number is palindrome.",ori)
else:
    print("Not a palindrome.",ori)      
=======
    n//=10
if (rev==ori):
    print("Number is palindrome.",ori)
else:
    print("Not a palindrome.",ori)    
>>>>>>> 0a3c4eda328cbd6598a19e57d961e711212edca2

n=int(input("Enter a number : "))
rev
rem
ori=n
while(n!=0):
    rem=n%10
    rev=rev*10+rem
    n=n//10
if (rev==ori):
    print("Number is palindrome.",ori)
else:
    print("Not a palindrome.",ori)      
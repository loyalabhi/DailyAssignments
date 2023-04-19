n=int(input("ENter a number : "))\
rev=0
rem=0
ori=0
ori=n
while(n):
    rem=n%10
    rev=rev*10+rem
    n/=10
if (rev==ori):
    print("Number is palindrome.",ori)
else:
    print("Not a palindrome.",ori)    
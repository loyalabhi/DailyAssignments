a = int(input('Enter first number  : '))
b = int(input('Enter second number : '))
c = int(input('Enter third number  : '))

if a>b and a>c:
    if(b<c):
        temp=a
        a=b
        b=c
        c=temp
    else:
        temp=a
        a=c
        c=temp
elif b>a and b>c:
    if(a<c):
        temp=b
        a=c
        c=temp
    else:
        temp=b
        b=a
        a=c
        c=temp
else:
    if(a>b):
        temp=b
        b=a
        a=temp
print(a,b,c)
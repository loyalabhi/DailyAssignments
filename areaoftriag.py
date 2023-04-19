operation=int(input("Enter 1 for area of tri, 2 for square, 3 for rectangle : "))
if (operation==1):
    b=int(input("Enter base of triangle : " ))
    h=int(input("Enter height of triangle : "))
    print("Area of triangle is : ",(0.5*b*h))
elif (operation==2):
    s=int(input("Enter side of square : " ))
    print("Area of square : ",s*s)
elif(operation==3):
    l=int(input("Enter length of rectangle : "))
    br=int(input("Enter breadth of rectangle : "))
    print("Area of rectangle is : ",l*br)
else:
    print("Invalid operation")    

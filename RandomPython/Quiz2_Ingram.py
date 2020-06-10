#Chad Ingram
#09.23.2015
#Quiz2_Ingram

#Input Name and Salary an Hours

naMe=input("Enter employee name: ")
waGe=float(input("Enter the hourly wage:$ "))
hoUrs=float(input("Enter the amount of hours worked last week: "))
print()
#Calculate your regular salary
reGsalary=waGe*hoUrs
oveRwage=float(waGe*1.50)
oveRsalary=float(hoUrs-40)*oveRwage+reGsalary

if hoUrs > 40:
    print("Pay to the Order of:",naMe,"\nIn the amount of:$%.2f"%(oveRsalary))


else:
    print("Pay to the Order of:",naMe,"\nIn the amount of:$%.2f"%(reGsalary))




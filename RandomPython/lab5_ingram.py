#Chad Ingram
#9/21/2015

gaLLon=float(input("Enter the number of gallons of gas you have in the tank: "))
milesPergaLL=float(input("Enter how many miles do you get to the gallon:"))
pricePergaLL=float(input("Enter how much is gas per gallon:"))

costPerhun=(pricePergaLL/milesPergaLL)*100
cuRdistance=gaLLon*milesPergaLL

print("The cost per 100 miles is $ %.2f"%(costPerhun))

print("And you should be able to push %.2f\n"%(cuRdistance),"miles in your current situation.")


import os
os.system("pause")

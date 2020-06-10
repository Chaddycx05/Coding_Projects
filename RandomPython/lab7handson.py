#chad ingram
#python lab 8

#input your income
income=float(input("Enter your income:"))

#compute the tax
if income <= 50000:
    tax = (income * 0.01)
elif income > 50000 and income <=75000:
    tax = 500 + (income - 50000) * 0.02
elif income >= 75000 and income <= 100000:
    tax = 1000 + (income - 50000) * 0.03
elif income > 100000 and income <= 250000:
    tax = 1750 + (income - 50000) * 0.04
elif income > 250000 and income <= 500000:
    tax = 7750 + (income - 50000) * 0.05
else:
    tax = 20250 + (income - 500000) * 0.06

#display tax results
print("You owe 'us' ", tax)

import os
os.system("pause")

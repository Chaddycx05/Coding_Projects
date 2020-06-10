#Chad
#This is a constant declaration because the amounts WILL NEVER change!
def main():
  print("Balance is 1000")
  print("your intrerest rate is .050")
  balance=1000   #declare variable
  interest_rate=0.05
#calculate year1 balance
  interest_earned = balance * interest_rate

  year1_balance = interest_earned + balance
  print("Your first years balance is:", year1_balance)

#calculate year2 balance
#remember to veiw the correct Variable!!!!

  year2_balance = (year1_balance * interest_rate) + year1_balance
  print ("Your second year balance is:",year2_balance)

#display and invoke using decimal format
#Decimal format %.2(number of decimal spaces)
  print("Year1 Balance is : %.7f" %(year1_balance))


  year3_balance = (year2_balance * interest_rate)+ year2_balance
  print("Year 3 balance is:", year3_balance)

def main()

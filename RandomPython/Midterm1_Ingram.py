#Chad Ingram
# Mid term 1
#10.14.2015
#Ingram
def main():

  grade1=int(input("Please enter your grade:"))
  grade2=int(input("Please enter your second grade:"))
#print(total)
  total=grade1+grade2
  average= total/2
  print("The average of your grades is:",average)

#figure letter grade
  if(average <= 100 and average >= 90):
      print("Your results is an 'A'")
  if(average <=89 and average >= 80):
      print("Your results is a 'B'")
  if(average <=79 and average >= 70):
      print("Your results is a 'C'")
  if(average <=69 and average >= 0):
      print("You have resulted in 'Failure'")

     
student=int(input("Enter another grade if you'd like, otherwise press enter to end the program:"))

main()

import os
os.system("pause")
                   



















    
      
        




    

# Coding_Projects
## Chad Ingram 

This is a place to sort of display some code that I've worked on or am working on... 
Definitely going to rebuild some of the things from previous classes that I've taken in the past. 

This will have everything from hello world in Python
``` python
    print('Hello World') 
```

to Design patterns in Java

``` Java
public class SingletonObject {

   //create an object of Singleton Object
   private static SingletonObject instance = new SingletonObject();
   //make the constructor private so that this class cannot be
   //instantiated
   private SingletonObject(){}
   //Get the only object available
   public static SingletonObject getInstance(){
      return instance;
   }
   public void showMessage(){
      System.out.println("Hello World!");
   }
}
// ------------------------------------

public class SingletonPatternDemo {
   public static void main(String[] args) {
     //Get the only object available
     SingletonObject object = SingletonObject.getInstance();

     //show the message
     object.showMessage();
   }
}

```

... and a myriad of things between.


### Formal projects should be in their own repo upon "conclusion"


package employee;
import java.util.*;  
class Emp {  
int age,salary;  
String name;  
int quantity;  
public Emp(String name, int age, int salary) {  
    this.name = name;  
    this.age = age;  
    this.salary = salary;  
   }  
}  
public class Employee {
    public static void main(String[] args) {
        int sum = 0,j = 0,mean = 0;
   //Creating list of Emps  
    List<Emp> list=new ArrayList<Emp>();  
    Scanner in = new Scanner(System.in);  
    //Creating Emps  
    int i=0;
        while(i<3)
    {
         System.out.println("Enter the Name, Age(21-60) and salary(1000-4000) of an employee");
        String name=in.nextLine();  
        int age=Integer.parseInt(in.nextLine());
        int salary=Integer.parseInt(in.nextLine());
        if(age>=21&&age<=60&&salary>=1000&&salary<=4000)
        {
          Emp b1=new Emp(name,age,salary);  
        //Adding Emps to list  
          list.add(b1); 
        }
        else
        {
           System.out.println("Age must varying from 21 to 60 and salary must varying from 1000 to 4000");
           continue;
        }
        i++;  
    }
   //Traversing list  
   try{
    for(Emp e:list){  
        if(e.salary>3000)
        {
            sum+=e.age;
            System.out.println("employers with salary more than 3000");
            System.out.println(e.name+" "+e.age+" "+e.salary);  
            j++;
        }
    }
    mean=sum/j;
  System.out.println("mean age of the employers with salary more than 3000"+" "+mean);  
   }catch(Exception e){System.out.println(e+"  "+ "No employee with salary greater than 3000");}
}  
}
        
        
        
        
    
/*Assignment 3 

Create EmployeeDetails class with 4 instance array variables. 
EmployeeDetails() : memory size for array id,name,salary, desg must assign in constructor at run time. 
read() 
		read all employee id,name,salary,desg 
calSalary()
		hra, da, pf local variables. 
		calculate salary 
bonus() 
		apply bonus 
display() 
		display details 

EmployeeTest :
			Main methods 
			Object creation 
		And calling all methods 
			
Take n number records through keyboards as Id,Name,Salary,Desg  
(array id,name,salary,Desg).

Salary = salary + hra + da – pf;
	 Hra is 10% salary 
	Da is 7 % salary 
	Pf 5 % salary 
If desg is manager 
		15% bonus
If developer  10% bonus 
Else 
		5 % bonus 

 
Id, name, salary( grossSalary +bonus ) and desg /////////////////////////////////////////////////// */



import java.util.*;
class Ass3{
             int[] id;
             String[] name;
             int[] salary;
             String[] designation;
              Scanner obj= new Scanner(System.in);

         Ass3{
        System.out.println("Enter the Number of Elements you want to store");
        int n=obj.nextInt();
          id=new int[n];
          name=new String[n] ;
          salary=new int[n];
          designation=new String[n];
        }


       void read(){
          System.out.println("Enter element of array( id,name,salary,designation)");
         for(int i=0;i<n;i++){
              id[i]= obj.nextInt();
              name[i]=obj.next();
               salary[i]= obj.nextInt();
              designation[i]=obj.next();
            }
          }


         void display(){
             for(int i=0;i<n;i++){
              System.out.println("id="+id[i]);
             System.out.println(" name="+ name[i]);
             System.out.println(" salary="+calSalary(salary[i]));
             System.out.println("designation="+designation[i]);
           } 
         }



        int calSalary(int salary){
           int income;
           income= salary+(10*salary)/100 + (7*salary)/100 - (5*salary)/100;
          for(int i=0;i<n;i++){
            
              if( designation[i].equals("manager"){
                income=income + (income*15)/100;
                 System.out.println("salary="+ salary[i]);
               }
             else if(designation[i].equals("developer"){
                income=income + (income*10)/100;
                System.out.println("salary="+ salary[i]);
              }
              else{
                income=income + (income*5)/100;
                System.out.println("salary="+ salary[i]);
             }
           }
         }

    
        }
   }

class EmployeeTest{
   public static void main(String[] args){
    Ass3 a= new Ass3();
    a.read();
    a.display();
   }
}


























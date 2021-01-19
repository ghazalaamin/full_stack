/* Assignment 2 

Take n number records through keyboards as Id,Name,Salary,Desg  
(array id,name,salary,Desg).

Salary = salary + hra + da – pf;
	 Hra is 10% salary 
	Da is 7 % salary 
	Pf 5 % salary */

/* If desg is manager (desg ...equals(Developer))
		15% bonus
If developer  10% bonus 
Else 
		5 % bonus 

 
Id, name, salary( grossSalary +bonus ) and desg */



import java.util.*;
class Ass2{
       public static void main(String[] args){
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the Number of Elements you want to store");
        int n=obj.nextInt();
         int[] id=new int[n];
         String[] name=new String[n] ;
         int[] salary=new int[n];
         String[] designation=new String[n];
    
          System.out.println("Enter element of array( id,name,salary,designation)");
         for(int i=0;i<n;i++){
              id[i]= obj.nextInt();
              name[i]=obj.next();
               salary[i]= obj.nextInt();
              designation[i]=obj.next();
            }
           int income;
           income= salary+(10*salary)/100 + (7*salary)/100 - (5*salary)/100;
          for(int i=0;i<n;i++){
            
             System.out.println("id="+id[i]);
             System.out.println(" name="+ name[i]);
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
             System.out.println("designation="+designation[i]);
           }
        }
   }













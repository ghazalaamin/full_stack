/*Assignment 5:

Create Student class which contains sId,SName,Age,Marks[](PCMB) ,Grade(char)
Scanner obj 
read()		
			take 
			id
			name,
			age 
				for(i=0;iM<marks.length;i++) {
					marks[i]=obj.next()
}	
calculateGrade()
			local variable total,avg;
				avg > 90	A+
				avg >80	A
				avg >70	B
				avg >55	C
				else 
						D
			
display
		id,name,age,Grade

StudentTest 
		Create Student array object 
		How many student details do you want to store. 
		
		Student std[]=new Students[n];
		for(int i=0;i<n;i++) {
			std[i]=new Student();
			std[i].read();
}
		for(int i=0;i<i++){
			std[i].calculateGrade();
}
		for(int i=0;i<i++){
			std[i].display(); */



import java.util.*;
class Student5{
   public static void main(String[] args){
    Scanner obj= new Scanner(System.in);
    int sId;
    String sName;
    int age;
    int marks[]= new int[4];
    void read(){
        System.out.println("enter the values of id, name, age, marks(PCMB)");
        sId=obj.nextInt();
        sName=obj.next();
        age=obj.nextInt();
        
       for(int i=0;i<4;i++){
         marks[i]=obj.nextInt();
      }
    }
   void calculateGrade(){
      int total,avg;
        
      for(int i=0;i<4;i++){
       total=total+marks[i];
      }
        avg=total/4;
        if(avg>90){
          System.out.println("GRADE A+");
         }
          else if(avg>80){
          System.out.println("GRADE A");
         }
          else if(avg>70){
          System.out.println("GRADE B");
         }
           else if(avg>55){
          System.out.println("GRADE C");
         }
        else{
         System.out.println("GRADE D");
        }
     }
    void display(){
       System.out.println("id="+sId);

       System.out.println("name="+sName);
     
       System.out.println("age="+age);
       
     
    }
   }
 }
 
 class StudentTest{
   publiv static void main(String[] args){
   Scanner obj=new Scanner(System.in);
    System.out.println("how many Student details you want to store");
     int n=obj.nextInt();
     Student[] std= new Student[n];
                 for(int i=0;i<n;i++) {
			std[i]=new Student();
			std[i].read();
                       
                 }
		for(int i=0;i<i++){
                        std[i].display();
			std[i].calculateGrade();
                }
		
 }





























import java.util.*;
class CompareToSort{
    public static void main(String[] args){
     Scanner obj=new Scanner(System.in);
     System.out.println("enter how many name you want to store");
      int n= obj.nextInt();
      String[] name = new String[n];
     for(int i=0;i<n;i++){
       String temp=obj.next();
       name[i]=temp;
      }
   String[] sortName = new String[n];
        for(int i=0;i<n;i++){ 
          for(int j=1;j<n;j++){
         if(name[i].toUpperCase().compareTo(name[j].toUpperCase())>0){
            String temp=name[i];
            name[i]=name[j];
            name[j]=temp;
               }
            }
          }
        System.out.println("name after sort");
      for(int i=0;i<n;i++){
       System.out.println(name[i]);
          }
       }
    }



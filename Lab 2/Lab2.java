import java.util.Scanner;
 class Student{
String name;
int i,n,usn,grade=0;
int marks[]=new int [5];
int credits[]=new int[6];
double total=0;
 void get_input()
 {
 Scanner m= new Scanner(System.in);
 System.out.println("Enter Student Name:");
 name=m.next();
 System.out.println("Enter USN of student:");
 usn=m.nextInt();
 System.out.println("Enter number of subjects:");
 n=m.nextInt();
 System.out.println("Enter the credits and marks of suject:");
 for(i=0;i<n;i++)
 {
 	 	 System.out.println("Enter marks of Credits "+(i+1)+" :");
 	 	 credits[i]=m.nextInt();
 	 	 System.out.println("Enter marks of subject"+(i+1)+":");
 	 	 marks[i]=m.nextInt();
 }
 }
 void calculate()
 {
 for(i=0;i<n;i++)
 {
 if(marks[i]>=90 && marks[i]<=100)
 grade=10;
 else if(marks[i]>=80 && marks[i]<=90)
 grade=9;
 else if(marks[i]>=70 && marks[i]<=80)
 grade=8;
 else if(marks[i]>=60 && marks[i]<=70)
 grade=7;
 else if(marks[i]>=50 && marks[i]<=60)
 grade=6;
 else if(marks[i]>=40 && marks[i]<=50)
 grade=5;
 else if(marks[i]>=0 && marks[i]<=40)
 grade=0;
 else
 System.out.println("invalid");
 total=total+(grade*credits[i]);
 }
 total=total/20;
 System.out.println("Sgpa="+total);
 }
 void display_output()
 {
 System.out.println("Name: "+name);
 System.out.println("usn"+usn);
 System.out.println("Sgpa="+total);
 }
public static void main(String args[])
{
 Student s1=new Student();
 s1.get_input();
 s1.calculate();
 s1.display_output();
}
 }

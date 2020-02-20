import java.util.*;
public class CostEst {
 float area;
 String standardLevel;
 boolean automation;
 
 void findcost()
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.format("%s","enter the area of the house in square feets :");
	 area=sc.nextFloat();
	 System.out.format("%s","Choose the material standard leve by entering corresponding codes :\n s:standard material\n as:above standard material\n hs:high standard material");
	 standardLevel=sc.next();
	 try {
	 System.out.format("%s","Do you want automation ? Enter true or false.");
	 automation=sc.nextBoolean();
	 }
	 catch(InputMismatchException e)
	 {
		 System.out.format("%s",e);
	 }
	 if(automation)
	 {
		 System.out.format("%s","Cost ="+area*2500);
	 }
	 else
	 {
		 if(standardLevel.equals("s"))
			 System.out.format("%s","Cost ="+area*1200);
		 else if(standardLevel.equals("as"))
			 System.out.format("%s","Cost ="+area*1500);
		 else if(standardLevel.equals("hs"))
			 System.out.format("%s","Cost ="+area*1800);
	 }
 }
}

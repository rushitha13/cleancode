import java.util.*;
public class InterestCal {
    int P,r,t,n;
    void calculate()
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.format("%s","Enter the value of principal balance :");
    	P=sc.nextInt();
    	System.out.format("%s","Enter the value of annual interest rate :");
    	r=sc.nextInt();
    	System.out.format("%s","Enter the value of time in years :");
    	t=sc.nextInt();
    	System.out.format("%s","Enter the value of time period :");
    	n=sc.nextInt();
    	float SI=simpleInterest(P,r,t);
    	float CI=compundInterest(P,r,t,n);
    	System.out.format("%s","SI :"+SI);
    	System.out.format("%s","CI :"+CI);
    	
    }
    float simpleInterest(int P,int r,int t)
    {
    	int A=P*(1+r*t);
    	return (float)A;
    }
    float compundInterest(int P,int r,int t,int n)
    {
    	int A=P*(1+r/n)*n*t;
    	return (float)A;
    }
}

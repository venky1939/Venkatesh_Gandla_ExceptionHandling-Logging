package app.epam.myProject;
import java.io.*;
import java.util.Scanner;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
class A
{
	private static final Logger LOGGER = LogManager.getLogger(A.class);
	static void meth()
	{
		double pr, rate, t, sim,com;
	    Scanner sc=new Scanner (System. in);
	    LOGGER.info("Enter the amount:");
	    pr=sc.nextDouble();
	    LOGGER.info("Enter the No.of years:");
	    t=sc.nextDouble();
	    LOGGER.info("Enter the Rate of  interest");
	    rate=sc.nextDouble();
	    A.simple(pr,t,rate);
	    A.compound(pr,t,rate);
	    
	    LOGGER.info("Method executed successfully");
	}
	static void simple(double pr,double t,double rate)
	{
		double sim;
		sim=(pr * t * rate)/100;
		LOGGER.info("Simple Interest="+sim);
	}
	static void compound(double pr,double t,double rate)
	{
		double com;
		com=pr * Math.pow(1.0+rate/100.0,t) - pr;
		LOGGER.info("Compound Interest="+com);
	}
}

public class App 
{
    public static void main( String[] args )
    {
        A.meth();
        
    }
    
   
	
}

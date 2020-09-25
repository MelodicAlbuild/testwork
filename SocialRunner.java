//(c) A+ Computer Science
// www.apluscompsci.com
//Name -

public class SocialRunner
{
	public static void main( String args[] )
	{
        Social run = new Social();
        System.out.println("SS# 456-56-234 has a total of " + run.chopAndAdd("456-56-234"));
        System.out.println("SS# 1-1-1 has a total of " + run.chopAndAdd("1-1-1"));
        System.out.println("SS# 102-2-12 has a total of " + run.chopAndAdd("102-2-12"));
        System.out.println("SS# 0-0-0 has a total of " + run.chopAndAdd("0-0-0"));
        System.out.println("SS# 75-99 has a total of " + run.chopAndAdd("75-99"));
	}
}
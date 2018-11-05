//(c) A+ Computer Science
// www.apluscompsci.com

//if else if statement

public class IfElseIfUIL
{
	//pre - uilScore >=0 && uilScore <=240
	//post - String values returned
	public static String checkScore( int uilScore )
	{
		if (uilScore <= 130)
				return "take more tests";
		else if (uilScore < 220)
				return "district bound";
		else if (uilScore < 240)
				return "region bound";
		else if (uilScore == 240)
				return "state bound";
		else if (uilScore > 240)
				return "invalid score";
		return "brh";
	}

	public static void main(String args[])
	{
		int score = 220;
		System.out.println( checkScore( score ) );			//outs region bound

		score = 240;
		System.out.println( checkScore( score ) );			//outs state bound

		score = 130;
		System.out.println( checkScore( score ) );			//outs take more tests

		score = 190;
		System.out.println( checkScore( score ) );			//outs district bound
	}
}

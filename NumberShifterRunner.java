import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		NumberShifter test = new NumberShifter();
		test.shiftEm(test.makeLucky7Array(20));
		
		test.shiftEm(test.makeLucky7Array(20));
		
		test.shiftEm(test.makeLucky7Array(20));
	}
}



import java.util.Scanner;

/**
 * ExampleRunningClass Class Javadoc
 * @author CanaDev / TylerAndreasen
 */
@Deprecated
public class ExampleInteract
{
	/**
	 * Main Javadoc
	 *
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner userIn = new Scanner(System.in);
		sopl("Greetings Existence");
		String ignorable = userIn.nextLine();
		sopl("Returns: "+ignorable);
		userIn.close();
	}

	/**
	 * Convenience Method: Prints the parameter s via the
	 * {@code System.out.println()} method.
	 *
	 * @param s
	 * @author CanaDev / TylerAndreasen
	 */
	private static void sopl(String s)
	{
		System.out.println(s);
	}

	/**
	 * Convenience Method: Prints the parameter p via the
	 * {@code System.out.print())} method.
	 *
	 * @param s
	 * @author CanaDev / TylerAndreasen
	 */
	private static void sop(String s)
	{
		System.out.print(s);
	}
}

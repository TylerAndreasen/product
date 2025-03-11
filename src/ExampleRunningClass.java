package src;

/**
 * ExampleRunningClass Class Javadoc
 * @author CanaDev / TylerAndreasen
 */
public class ExampleRunningClass
{
	/**
	 * Main Javadoc
	 *
	 * @param args
	 */
	public static void main(String[] args)
	{
		sopl("Greetings Existence");
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

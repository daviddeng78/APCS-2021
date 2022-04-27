// Ruawatrain: Benjamin Belotser, David Deng, Josiah Moltz
// APCS pd6
// L09 -- Some Folks Call It A Charades
// 2022-04-26
// time spent: 1.3 hrs

/**
 * Celebrity base class for the Celebrity game.
 * @author cody.henrichsen
 * @version 1.4 17/09/2018
 */
public class Celebrity
{
	/**
	 * The clue to determine the celebrity
	 */
	 private String _clue;

	/**
	 * The answer or name of the celebrity.
	 */
	 private String _answer;

	/**
	 * Creates a Celebrity instance with the supplied answer and clue
	 * @param answer
	 * @param clue
	 */
	public Celebrity(String answer, String clue)
	{
		_clue = clue;
		_answer = answer;
	}

	/**
	 * Supplies the clue for the celebrity
	 * @return
	 */
	public String getClue()
	{
		return _clue;
	}

	/**
	 * Supplies the answer for the celebrity.
	 * @return
	 */
	public String getAnswer()
	{
		return _answer;
	}

	/**
	 * Updates the clue to the provided String.
	 * @param clue The new clue.
	 */
	public void setClue(String clue)
	{
		_clue = clue;
	}

	/**
	 * Updates the answer to the provided String.
	 * @param answer The new answer.
	 */
	public void setAnswer(String answer)
	{
		_answer = answer;
	}

	/**
	 * Provides a String representation of the Celebrity.
	 */
	@Override
	public String toString()
	{
		return "The celebrity is... " + _answer + "\nTheir clue was " + _clue;
	}

	public static void main(String[] args) {
		Celebrity ElonMusk = new Celebrity("Elon Musk", "Tesla");
		Celebrity ChrisPratt = new Celebrity("Chris Pratt", "Guardians of the Galaxy");
		Celebrity DavidDeng = new Celebrity("David Deng", "Ruawatrain");

		System.out.println(ElonMusk);
		System.out.println(ChrisPratt);
		ChrisPratt.setClue("The Lego Movie");
		System.out.println(ChrisPratt.getClue());
		System.out.println(DavidDeng);
		DavidDeng.setAnswer("Brenden");
		System.out.println(DavidDeng.getAnswer());
	}
}

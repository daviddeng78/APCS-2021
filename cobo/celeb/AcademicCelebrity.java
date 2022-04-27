public class AcademicCelebrity extends Celebrity {
	private String field;

	public AcademicCelebrity(String answer, String clue) {
    super(answer, clue);
		processClues();
  }

	private void processClues() {
		String[] clues = super.getClue().split(",");
		field = clues[0];
		super.setClue(clues[1]);
	}

	public String getClue() {
		return "This Academic is in the field of " + field + ". Their clue is: " + super.getClue();
	}

	public String toString() {
		return "The Academic is... " + getAnswer() + ". They are in the field of " + field + ".\nTheir clue was " + super.getClue() + ".";
	}
}

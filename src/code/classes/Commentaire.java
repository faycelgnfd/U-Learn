package code.classes;

public class Commentaire {

	private final int numComm;
	private String text;
	
	public Commentaire(int num, String text)
	{
		this.numComm = num;
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void modifierComm(String text) {
		this.text = text;
	}

	public int getNumComm() {
		return numComm;
	}
}

package word;

public class Word {

	/* �ܾ��� ���α׷��� �ۼ�
	 * �ܾ� ��� Ŭ����
	 * word, mean
	 * */
	
	private String word;
	private String mean;
	
	public Word() {
	
	}
	
	public Word(String word, String mean) {
		this.word=word;
		this.mean=mean;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMean() {
		return mean;
	}

	public void setMean(String mean) {
		this.mean = mean;
	}

	@Override
	public String toString() {
		return word + ":" + mean;
	}
	

}

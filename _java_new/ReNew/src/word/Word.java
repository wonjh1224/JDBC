package word;

public class Word {

	/* 단어장 프로그램을 작성
	 * 단어 등록 클래스
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

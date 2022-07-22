package application;

import java.util.Random;

/*
 * 랜덤 단어를 생성해주는 클래스
 */
public class RandomWord {
	
	private String books = "politics priority cigarette comparison obligation supermarket homework collection marriage girlfriend contribution significance committee activity departure relationship attention medicine presentation importance inspection ambition resolution assistance preparation competition conversation independence secretary baseball";
	private String[] words = books.split(" "); //스페이스로 단어들을 분리해서 배열
	private Random random = new Random();
	
	private String selectWord; //랜덤으로 선택된 단어
	/* 생성자로 생성시 단어가 선택됨 */
	public RandomWord() {
		selectWord = words[random.nextInt(words.length)]; //첫번째 단어
	}
	/* 단어배열 words에 있는 모든 단어 출력 */
	public void getWords() {
		for(String word : words) {
			System.out.println(word);
		}
	}
	/* 선택된 한개의 단어 리턴 */
	public String toString() {
		return selectWord;
	}
	
}

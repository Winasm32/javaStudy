package application;

/*
 * 전체 행맨 게임을 실행하는 클래스
 */
public class Hangman {
	
	private boolean running = false;
	private RandomWord word = new RandomWord();
	
	public void run() {
		do {
			displayWord();      //화면에 단어표시
			getUserInput();	    //입력받음
			checkUserInput();	//맞는지 체크 => 맞을시 running=false			
		} while (running);
	}

	public void displayWord() {	 
		System.out.println(word.toString()); //랜덤으로 선택된 단어		
	}
	
	public void getUserInput() {
		System.out.println("단어 맞추기");
	}
	
	public void checkUserInput() {
		System.out.println("체크");
	}




}

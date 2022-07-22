package application;

public class 불린OR {

	public static void main(String[] args) {
		
		boolean isRaining = true;  //비가오는가?
		boolean mightRain = false; //비가올수도있는가?
		boolean takeUmbrella = false; //우산을가져감?
		
		takeUmbrella = isRaining || mightRain; //하나의 값이라도 true면 true
				
		System.out.println(takeUmbrella);


	}

}

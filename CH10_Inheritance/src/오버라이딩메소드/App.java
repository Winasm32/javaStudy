package 오버라이딩메소드;

public class App {

	public static void main(String[] args) {
		// 고양이클래스를 집고양이, 길고양이 가 상속받음
		HouseCat cat1 = new HouseCat();
		cat1.vocal();
		cat1.hunt();
		
		RoadCat cat2 = new RoadCat();
		cat2.vocal();
		cat2.hunt();
		
		Tiger cat3 = new Tiger();
		cat3.vocal();
		cat3.hunt();
		
		System.out.println(cat1);
		System.out.println(cat2);
		System.out.println(cat3);

	}

}

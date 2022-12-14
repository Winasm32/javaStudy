package 다형성;

public class App {

	public static void main(String[] args) {

		Cat[] cats = { new HouseCat(), new RoadCat(), new Tiger() };
		// cats[0] == new HouseCat();
		// cats[1] == new RoadCat();
		// cats[2] == new Tiger();

//		cats[0].vocal();
//		cats[0].hunt();
//		
//		cats[1].vocal();
//		cats[1].hunt();
//		
//		cats[2].vocal();
//		cats[2].hunt();

		for (int i = 0; i < cats.length; i++) {
			cats[i].vocal();
			cats[i].hunt();
		}
		
		for(Cat c : cats) {
			c.vocal();
			c.hunt();
		}
		
		Cat cat1 = new HouseCat(); //부모타입으로 선언 (업캐스팅)
		cat1.vocal();
		cat1.hunt();
		//cat1.callMaster(); 부모타입일때 부모타입이 가능한 메소드만 가능
		
		HouseCat cat2 = (HouseCat) cat1; //다시 자식타입으로 다운캐스팅
		cat2.callMaster();
	}

}

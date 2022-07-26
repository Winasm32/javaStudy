package 메소드이너클래스;

public class App {
	
	private String name;
	
	public App() {
		name = "앨리자베스";
	}

	public static void main(String[] args) {
		App app = new App();
		app.run();
	}

	private void run() {
		//System.out.println(name);
		class Printer {
			public void print() {
				System.out.println(name);
			}
		}
		
		new Printer().print();
	}

}

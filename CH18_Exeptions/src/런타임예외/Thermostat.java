package 런타임예외;

public class Thermostat {

	// throws 예외는 예외를 미뤄서 이 메소드를 부를때 처리
	public void setTemperature(double t) {

		setMachineTemperature(t);
		
		System.out.println("온도 세팅 : " + t);
	}

	private void setMachineTemperature(double t) {
		if (t < 0 || t > 35) {
			throw new RuntimeException("온도가 비정상 입니다.");
		}		
	}
}

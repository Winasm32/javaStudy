package 예외던지기2;

public class Thermostat {

	// throws 예외는 예외를 미뤄서 이 메소드를 부를때 처리
	public void setTemperature(double t) throws Exception {

		setMachineTemperature(t);
		
		System.out.println("온도 세팅 : " + t);
	}

	private void setMachineTemperature(double t) throws Exception {
		if (t < 0 || t > 35) {
			throw new Exception("온도가 비정상 입니다.");
		}		
	}
}

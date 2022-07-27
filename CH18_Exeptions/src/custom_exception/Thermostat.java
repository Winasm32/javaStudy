package custom_exception;

import custom_exception.exceptions.TempOutOfRangeException;
import custom_exception.exceptions.TempTooHighException;
import custom_exception.exceptions.TempTooLowException;

public class Thermostat {

	// throws 예외는 예외를 미뤄서 이 메소드를 부를때 처리
	public void setTemperature(double t) throws TempTooLowException, TempTooHighException {

		setMachineTemperature(t);
		
		System.out.println("온도 세팅 : " + t);
	}

	private void setMachineTemperature(double t) throws TempTooLowException, TempTooHighException {
		if (t < 0 ) {
			throw new TempTooLowException("온도가 비정상 입니다.");
		} else if (t > 35) {
			throw new TempTooHighException("온도가 비정상 입니다.");
		}
	}
}

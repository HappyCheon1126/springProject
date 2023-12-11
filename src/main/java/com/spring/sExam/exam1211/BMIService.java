package com.spring.sExam.exam1211;

public class BMIService {
	public void calc(BMIVO vo) {
		double dblHeight = vo.getHeight() / 100.0;
		double bmi = vo.getWeight() / (dblHeight * dblHeight);
		
		String str = "";
		if(bmi < 18.5) str = "님은 저체중 입니다. 음식을 가리지 말고 많이 많이 드세요";
		else if(bmi <= 23) str = "님은 정상 입니다. 꾸준히 건강관리 잘 하세요.";
		else if(bmi <= 25) str = "님은 과체중 입니다. 지금부터라도 체중관리 잘 하세요.";
		else str = "님은 비만 입니다. 음식보기를 돌같이 하라~~~~~ 꾸준히 노력하세요...";
		
	  System.out.println(vo.getName() + str);
	}

	public void printLine() {
		System.out.println("======================================================");
	}
}

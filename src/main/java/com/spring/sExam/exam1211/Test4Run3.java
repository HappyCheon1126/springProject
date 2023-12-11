package com.spring.sExam.exam1211;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4Run3 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("xml/test4.xml");
		
		Test4VO vo = new Test4VO();
		vo.getService().printLine();
		vo.getService().printTitle();
		vo.getService().printLine();
		
		vo = (Test4VO) ctx.getBean("vo1");
		vo.getService().calc(vo);
		vo.getService().printSungjuk(vo);
		
		vo = (Test4VO) ctx.getBean("vo2");
		vo.getService().calc(vo);
		vo.getService().printSungjuk(vo);
		
		vo = (Test4VO) ctx.getBean("vo3");
		vo.getService().calc(vo);
		vo.getService().printSungjuk(vo);
		
		vo.getService().printLine();
		
		ctx.close();
	}
}

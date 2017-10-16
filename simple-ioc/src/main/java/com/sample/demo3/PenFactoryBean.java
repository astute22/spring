package com.sample.demo3;

import org.springframework.beans.factory.FactoryBean;

public class PenFactoryBean implements FactoryBean<Pen>{

	//getObject() 메소드가 반환하는 객체가 실제로 빈으로 등록됨
	public Pen getObject() throws Exception {
		// TODO Auto-generated method stub
		Pen pen = new Pen() {
			
			public void draw() {
				System.out.println("연필로 쓱쓱");
				
			}
		};
		return pen;
	}
	
	//실제로 빈으로 등록되는 객체의 타입을 반환하는 메소드
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Pen.class;
	}
	
	//빈으로 등록되는 객체를 싱글턴객체로 만들 것인지 여부를 반환하는 메소드
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}
}

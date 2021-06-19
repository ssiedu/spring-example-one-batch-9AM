package com.ssi;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class DemoBean implements InitializingBean, DisposableBean {
	
	private int x;
	private String y;
	
	public DemoBean() {
		System.out.println("Zero Args Constructor Called ...!");
	}
	public DemoBean(String x, String y) {
		System.out.println("Two Args (String,String) Constructor Called...!");
	}
	
	public DemoBean(int x, String y) {
		System.out.println("Two Args (int,String) Constructor Called...!");
		this.x = x;
		this.y = y;
	}




	public void stop() {
		//System.out.println("Cleaning Up...!");
	}
	
	public void doIt() {
		//System.out.println("Now Doing Processing....!");
	}
	
	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		System.out.println("Setting Value For X...!");
		this.x = x;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		System.out.println("Setting Value For Y...!");
		this.y = y;
	}
	@Override
	public String toString() {
		return "DemoBean [x=" + x + ", y=" + y + "]";
	}

	public void afterPropertiesSet() throws Exception {
		//System.out.println("Doing Some Processing After All Properties Set...!");
		
	}

	public void destroy() throws Exception {
		//System.out.println("This is Destry Method...!");
		
	}
	
	
}

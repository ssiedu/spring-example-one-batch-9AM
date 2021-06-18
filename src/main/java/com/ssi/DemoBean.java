package com.ssi;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class DemoBean implements InitializingBean, DisposableBean {
	
	private int x;
	private String y;
	
	public void stop() {
		System.out.println("Cleaning Up...!");
	}
	
	public void doIt() {
		System.out.println("Now Doing Processing....!");
	}
	
	public DemoBean() {
		System.out.println("Zero Args Constructor Called ...");
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
		System.out.println("Doing Some Processing After All Properties Set...!");
		
	}

	public void destroy() throws Exception {
		System.out.println("This is Destry Method...!");
		
	}
	
	
}

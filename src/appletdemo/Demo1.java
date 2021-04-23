package appletdemo;

import java.applet.Applet;
import java.awt.Graphics;

public class Demo1 extends Applet {
	public void init() {
		System.out.println("init");
	}

	public void start() {
		System.out.println("start");
	}

	public void paint(Graphics g) {
		System.out.println("start");
	}

	public void stop() {
		System.out.println("stop");
	}

	public void destroy() {
		System.out.println("destroy");
	}

}

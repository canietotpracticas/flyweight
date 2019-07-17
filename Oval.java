import java.awt.Color;
import java.awt.Graphics;

public class Oval implements Shape {

	//intrinsic property
	private boolean fill;

	public Oval(boolean f){
		this.fill=f;
		System.out.println("creando objeto Oval con relleno ="+f);
		//adding time delay
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void draw(Graphics circle, int x, int y, int width, int height,
			Color color) {
		circle.setColor(color);
		circle.drawOval(x, y, width, height);
		if(fill){
			circle.fillOval(x, y, width, height);
		}
	}

}
import processing.core.*;
import java.util.Calendar;

public class MyPApplet extends PApplet {
	private String URL = "https://upload.wikimedia.org/wikipedia/commons/9/9f/Sunset_pier.jpg";
	private PImage backgroundImg;
	
	public void setup() {
		size(200, 200);
		backgroundImg = loadImage(URL, "jpg");
	}
	
	public void draw() {
		backgroundImg.resize(0, height);
		image(backgroundImg, 0, 0);
		
		Calendar now = Calendar.getInstance();
		int hour = now.get(Calendar.HOUR_OF_DAY);
		
		if(hour >= 0 && hour <= 6) fill(194, 194, 194);
		else if(hour > 6 && hour < 17) fill(255, 209, 0);
		else if(hour >= 17 && hour <= 23) fill(51, 153, 255);
		
		ellipse(width/4, height/4, width/5, height/5);
	}
}

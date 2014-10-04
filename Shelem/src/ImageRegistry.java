import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;


public class ImageRegistry {
	public static HashMap<String, BufferedImage> images = new HashMap<String, BufferedImage>();
	
	
	public static final String IMAGE_PATH = "res/";
	


	public static BufferedImage loadImage(String name) {
		String fullPath = IMAGE_PATH + name;
		if(images.containsKey(name)) {
			return images.get(name);
		} else {
			BufferedImage b;
			try {
				b = ImageIO.read(new File(fullPath));
				images.put(name,b);
				return b;
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Cannot load image: "+fullPath);
			}
			return null;
		}
	}
	
	public static BufferedImage getImage(String name){
		return images.get(name);
	}
	
	public static void setImageGrid(BufferedImage img, int width, int height){
		BufferedImage	buffImg;
		double 			gridImgWidth 	= img.getWidth() / width;
		double			gridImgHeight	= img.getHeight() / height;
		
		for(Suit s: Suit.values()){
			images.put(s.toString(), img.getSubimage(0, 0, width, height));
		}
		
	}
	

}

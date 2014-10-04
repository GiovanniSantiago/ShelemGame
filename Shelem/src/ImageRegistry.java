import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;


public class ImageRegistry {
	private static HashMap<String, BufferedImage> images = new HashMap<String, BufferedImage>();
	
	public static final String IMAGE_PATH = "res/";
	
	/**
	 * Read an image from 'res/' folder
	 * @param name
	 * @return
	 * @throws IOException
	 */
	public BufferedImage getImage(String name) throws IOException {
		String fullPath = IMAGE_PATH + name;
		if(images.containsKey(fullPath)) {
			return images.get(fullPath);
		} else {
			BufferedImage b = ImageIO.read(new File(fullPath));
			images.put(fullPath,b);
			return b;
		}
	}
}
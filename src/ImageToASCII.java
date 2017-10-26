import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageToASCII {
    public static void main(String[] args) throws IOException {
        BufferedImage img = ImageIO.read(new File("C:/Users/joeac/Desktop/img01.png"));
        String s = "$@B%8&WM#*oahkbdpqwmZO0QLCJUYXzcvunxrjft/|()1{}[]?-_+~<>i!lI;:,\\\"^`.";
        for(int y=0;y<img.getHeight();y++) {
            System.out.println();
            for(int x=0;x<img.getWidth();x++) {
                int i = img.getRGB(x,y);
                Color c = new Color(i);
                double g = (0.2126 * c.getRed() + 0.7152 * c.getGreen() + 0.0722 * c.getBlue())/255;
                System.out.print(s.charAt((int)(g*s.length())));
            }
        }
    }
}
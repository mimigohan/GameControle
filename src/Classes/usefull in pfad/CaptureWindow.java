package imPCoption;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class CaptureWindow
{
public static void main(String[] args) throws Exception{
    Robot robot=new Robot();
    String ext="jpg";
    String filename="ProwessCapture."+ext;
    Rectangle scr=new Rectangle(1250,800);
    BufferedImage img;
    img=robot.createScreenCapture(scr);
    ImageIO.write(img, ext, new File(filename));
    System.out.println("A screenshot saved!");
}
}

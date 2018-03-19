package imPCoption;

import java.io.File;
import java.util.Date;

public class LastModification
{
public static void main(String[] args) {
    File file=new File("C://Program Files//Windows Media Player//setup_wm.exe");
    
    long lastModified=file.lastModified();
    
    System.out.println("File was last modified at:"+new Date(lastModified));
}
}

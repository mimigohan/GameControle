package imPCoption;

import java.io.File;

public class CreateDirectory
{
public static void main(String[] args) {
    File dir=new File("C://Users//marku//Desktop//TEST//ERSTELLT");
    
    boolean isDirectoryCreated=dir.mkdir();
    
    if(isDirectoryCreated)
        System.out.println("Directory created successfully");
    else
        System.out.println("Directory was not created successfully");
    }
}

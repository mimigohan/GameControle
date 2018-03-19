package imPCoption;

import java.io.File;

public class Renamefile
{
public static void main(String[] args) {
    File oldName=new File("C://Users//marku//Desktop//TEST//irgendwas");
    File newName=new File("C://Users//marku//Desktop//TEST//wird zu pro");
    
    boolean isFileRenamed=oldName.renameTo(newName);
    
    if(isFileRenamed)
        System.out.println("File has been renamed");
    else
        System.out.println("Error renaming the file");
}
}

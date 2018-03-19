package imPCoption;

import java.io.File;

public class DeleteDirectory
{
public static void main(String[] args) {
    File file=new File("C://Users//marku//Desktop//TEST//ERSTELLT//GG.txt");
    
    boolean blnDeleted=file.delete();
    
    System.out.println("Was file deleted? :"+blnDeleted);
}
}

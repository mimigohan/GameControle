package imPCoption;

import java.io.File;
import java.io.IOException;

public class CreateFile
{
public static void main(String[] args) {
    try{
        File file=new File("C://Users//marku//Desktop//TEST//ERSTELLT//GG.txt");
        if(file.createNewFile())
            System.out.println("success!");
        else
            System.out.println("Error, file already exists.");
    } 
    catch(IOException ioe)
    {
    ioe.printStackTrace();    
    }
}
}

package imPCoption;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObjectfile1
{
void writeObj()
{
    FileOutputStream fos=null;
    ObjectOutputStream oos=null;
    String file="Alok.txt";
    try
    {
        fos=new FileOutputStream(file);
        oos=new ObjectOutputStream(fos);
        WriteObjectfile2  t=new WriteObjectfile2 ("Alok",24);
        oos.writeObject(t);
        System.out.println("Object written");
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    finally {
        try
        {
            fos.close();
            oos.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
public static void main(String[] args) {
    WriteObjectfile1 ob=new WriteObjectfile1();
    ob.writeObj();
}
}

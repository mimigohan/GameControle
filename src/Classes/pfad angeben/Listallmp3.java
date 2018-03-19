package imPCoption;

import java.io.File;

public class Listallmp3
{
public static void main(String[] args) {
    extract("C:\\Users\\marku\\Music\\00music");
}
static void extract(String p)
{
    File f=new File(p);
    File l[]=f.listFiles();
    for(File x:l)
    {
        if(x.isDirectory())
        {
            extract(x.getPath());
        }
        else
        {
            String n=x.getName();
            if(n.endsWith(".mp3"))
            {
                String a=x.getPath();
                String fn=x.getName();
                System.out.println(a+"\\"+fn);
            }
        }
    }
}
}

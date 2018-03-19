package imPCoption;

import java.net.*;
import java.util.Date;
import java.io.*;



public class URLConnectionDemo
{
public static void main(String[] args) throws Exception{
    int ch;
    URL ob=new URL("https://www.google.de/");
    URLConnection uc=ob.openConnection();
    System.out.println("Content type: "+uc.getContentType());
    System.out.println("Document date: "+new Date(uc.getDate()));
    System.out.println("Last modified: "+new Date(uc.getLastModified()));
    System.out.println("Document expires "+uc.getLastModified());
    int len=uc.getContentLength();
    System.out.println("Content length: "+len);
    if(len>0)
    {
        InputStream in=uc.getInputStream();
        while((ch=in.read())!=-1)
        {
            System.out.println((char)ch);
        }
        in.close();
    }
}
}

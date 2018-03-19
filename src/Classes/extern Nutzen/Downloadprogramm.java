package imPCoption;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.Scanner;

public class Downloadprogramm
{
public static void main(String[] args) {
    System.out.println("DOWNLOAD MANAGER:");
    Scanner sc=new Scanner(System.in);
    System.out.println("FileURL: ");
    String url=sc.nextLine();
    System.out.println("downloading...");
    try
    {
        int fnsi=url.lastIndexOf('/');
        int end=url.length();
        String fname=url.substring(fnsi+1,end);
        URL ws=new URL(url);
        ReadableByteChannel rbc;
        rbc=Channels.newChannel(ws.openStream());
        FileOutputStream fos;
        fos=new FileOutputStream(fname);
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        fos.close();
        rbc.close();
        System.out.println("Download Completed");
    }
    catch(IOException e)
    {
        e.printStackTrace();
    }
}
}

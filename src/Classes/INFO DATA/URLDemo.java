package imPCoption;

import java.net.*;

public class URLDemo
{
public static void main(String[] args)throws Exception {
    URL ob=new URL("https://www.google.de/");
    System.out.println(" Protocol : "+ob.getProtocol());
    System.out.println(" Host : "+ob.getHost());
    System.out.println(" File : "+ob.getFile());
    System.out.println(" Port : "+ob.getPort());
    System.out.println(" Path : "+ob.getPath());
    System.out.println(" URL : "+ob.toString());
}
}

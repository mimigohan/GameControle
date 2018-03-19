package imPCoption;

import java.io.IOException;
import java.net.InetAddress;

public class DisplayIPaddress
{
public static void main(String[] args) throws IOException{
    System.out.println(InetAddress.getLocalHost());
    System.out.println(InetAddress.getLocalHost().getHostAddress());
    System.out.println(InetAddress.getLocalHost().getHostName());
}
}

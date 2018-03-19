package imPCoption;

import java.io.IOException;

public class CloseProgramm
{
public static void main(String[] args) {
     Runtime myRuntime=Runtime.getRuntime();
    System.out.println(myRuntime);
for(int i=0;i<=2;i++)
{
    if(i<2)
    try
    {
        myRuntime.exec("notepad");
    }
    catch(IOException e)
    {
        System.out.println(e);
    }
    else
  // myRuntime.exit(0);
   //myRuntime.exit(1);
   
    System.out.println(myRuntime);
}
}
}

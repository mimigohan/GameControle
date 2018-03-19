package imPCoption;

public class CountDown
{
public static void main(String[] args) throws Exception{
    int i=9;
    while(i!=0)
    {
        System.out.print("\b"+i);
        i--;
        Thread.sleep(1000);
    }
    System.out.println("\b***************");
    System.out.println(" HAPPY BIRTHDAY ");
    System.out.println("*****************");
}
}

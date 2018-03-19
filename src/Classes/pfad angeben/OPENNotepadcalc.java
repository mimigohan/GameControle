package imPCoption;

import java.io.IOException;
import java.util.Scanner;

public class OPENNotepadcalc
{
public static void main(String[] args) throws IOException {
    ProcessBuilder np,calc;
    np=new ProcessBuilder("notepad.exe");
    calc=new ProcessBuilder("calc.exe");
    String menu="OPEN:\n";
    menu+="Press 1 NOTEPAD\n";
    menu+="Press 2 CALC\n";
    menu+="------------\n";
    menu+="Enter Choice: ";
    System.out.print(menu);
    Scanner sc=new Scanner(System.in);
    int ch=sc.nextInt();
    if(ch==1)
    {
        np.start();
        System.out.println("NOTEPAD OPENED");
    }
    else if(ch==2)
    {
        calc.start();
        System.out.println("CALC OPENED");
    }
    else
    {
        System.out.println("INVALID CHOICE");
    }
}
}

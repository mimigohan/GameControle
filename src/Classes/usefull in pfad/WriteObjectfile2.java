package imPCoption;

import java.io.Serializable;

public class WriteObjectfile2 implements Serializable
{
String name;
int age;
WriteObjectfile2(String n,int a)
{
    name=n;
    age=a;
}
void display() {
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
}
}

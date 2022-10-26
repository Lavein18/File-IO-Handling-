import java.io.*;
class linenum
{
public static void main(String[] args)throws IOException
{
FileInputStream fil;
LineNumberInputStream line;
int i;
try
{
fil=new FileInputStream(args[0]);
line=new LineNumberInputStream(fil);
}
catch(FileNotFoundException e)
{
System.out.println("No such file found");
return;
}
do
{
i=line.read();
if(i=='n')
{
System.out.println();
System.out.print(line.getLineNumber()+" ");
}
else
System.out.print((char)i);
}while(i!=-1);
fil.close();
line.close();
}
}

INPUT 
Demo.java
class Demo
 {
public static void main(java Demo beta gamma delta)
 {
 int n = 1 ;
 System.out.println(“The word is ” + args[ n ] );
 }
 }

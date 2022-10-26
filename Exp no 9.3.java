ByteStreams

import java.io.*;   
public class ByteStreamExample
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;
  
        try 
        {
            sourceStream = new FileInputStream("source.txt");
            targetStream = new FileOutputStream ("destination.txt");
            int temp;
            while ((temp = sourceStream.read()) != -1)
                targetStream.write((byte)temp);            
        }
        finally 
        {
            if (sourceStream != null){
                sourceStream.close();   
            }
            if (targetStream != null){           
                targetStream.close(); 
            }
        }
    }
}

CharacterStreams

import java.io.*;
public class CharacterStreamExample {

   public static void main(String args[]) throws IOException {
      FileReader in = null;
      FileWriter out = null;
            try {
         in = new FileReader("source.txt");
         out = new FileWriter("destination.txt");
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }
       finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}



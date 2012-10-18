package app;

import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * Example class for direct print
 * @author atila
 */
public class Main {

   public static void main(String[] args) {
      try {
         FileOutputStream fos = new FileOutputStream("/dev/usb/lp0");
         PrintWriter printer = new PrintWriter(fos);
         
         // print some text
         printer.println("Hello world.");
         printer.flush();
         
         printer.println("I love MAD3 Linux.");
         printer.flush();
         
         // close and free the device
         printer.close();
         fos.close();
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}

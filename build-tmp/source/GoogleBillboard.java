import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class GoogleBillboard extends PApplet {

public int begin, end;
public final static String e = "2.718281828459045235360287471352662497757247093699959574966967627724076630353547594571382178525166427427466391932003059";  
public void setup()  
{            
     noLoop();  
     System.out.println(answer());
}  
public void draw()  
{   
  
}  
public double answer()
{
  double theNum=0;
  for(begin=0; end<e.length(); begin++)
  {
    end=begin+10;
    String digits = e.substring(begin, end);
    double num = Double.parseDouble(digits);
    if(isPrime(num) == true)
    {
      theNum=num;
    }
  }
  return theNum;
}
public boolean isPrime(double dNum)  
{   
  if(dNum<2)
  {
    return false;
  }
    for(int i = 2; i<=Math.sqrt(dNum); i++)
    {
      if(dNum % i == 0)
      {
        return false;
      }
    } 
    return true;  
} 
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "GoogleBillboard" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}

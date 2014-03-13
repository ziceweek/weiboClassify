package FuzzyCluster;


import java.io.*;
import java.util.Scanner;
import   java.lang.Math.*   ;

class Point {

    public double a;
    public double b;
    public double distance;
    public char kind ;

    
     public void SetPoint (double A,double B,double dis,char k){
        a = A;
        b = B;
        distance = dis;
        kind = k;
    }

}

/**
 *
 * @author Administrator
 */
public class knn{

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args)  {

        Point[]  point;
        point = new Point[4];
        
        point[0].SetPoint(1.0, 1.1,0 ,'A');
        point[1].SetPoint(1.0, 1.0,0 ,'A');
        point[2].SetPoint(0.0, 0.0,0 ,'B');
        point[3].SetPoint(0.0, 0.1,0 ,'B');
        
      double  B;
      double  A;
     
      System.out.println("input a num plea" );

      Scanner input = new Scanner(System.in);
      A = input.nextInt();
      System.out.println(A);
      
      System.out.println("input a num againplea" );
      input = new Scanner(System.in);
      B = input.nextInt();
      System.out.println(B);

      Point  pointN = new Point ();
      pointN.SetPoint(A ,B,0,'F');
      
      double[] s = new double[4];
      double sum =0;
      double aa;
      double bb;
  
      for(int i=0;i<4;i++){
      aa = pointN.a - point[i].a;
      aa = aa * aa;
      
      bb = pointN.b - point[i].a;
      bb = bb * bb;
      
      sum = aa + bb;
      point[i].distance = Math.sqrt(sum);
      }
      
      Point  a ;
      a = new Point(); 
      
      for(int j=0; j<4;j++){
      
          for(int i=0;i<4;i++){
             
            if( point[i].distance > point[i+1].distance)
            {
                a = point[i+1];
                point[i+1] = point[i];
                point[i]  = a;
            }
          }
      }
     
      
      int k=1;
      pointN.kind = point[k-1].kind;
      
      System.out.println(pointN.kind);
      
      
    
     
    }
}

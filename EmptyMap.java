import sun.tools.tree.DoubleExpression;

import java.io.File;
import java.util.Scanner;

public class EmptyMap {
     public EmptyMap(){

     }

     public void draw(String fileName) throws Exception{
         File inputFile = new File("input/" + fileName);
         Scanner inputObject = new Scanner(inputFile);
         inputObject.nextLine();
         inputObject.nextLine();
         double regions = Double.parseDouble(inputObject.nextLine());
         inputObject.nextLine();
         inputObject.nextLine();
         inputObject.nextLine();
         inputObject.nextLine();
         inputObject.nextLine();




         while(inputObject.hasNextLine()){
             for(int i = 0;i<)
             inputObject.next();
             double x = Double.parseDouble(inputObject.next());
             double y = Double.parseDouble(inputObject.next());
             StdDraw.point(x,y);
         }
         StdDraw.show();
     }

    public static void main(String[] args) throws Exception {
        EmptyMap a = new EmptyMap();
        a.draw("VA2000.txt");
    }
}

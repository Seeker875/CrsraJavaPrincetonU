public class WorldMap
{
 public static void main(String[] args)
 {
        int  width =  StdIn.readInt();
	int height = StdIn.readInt();
	StdDraw.setCanvasSize(width,height);
	StdDraw.setXscale(0.0, width);
	StdDraw.setYscale(0.0, height);
        while (!StdIn.isEmpty())
 	{
	    // String spaced =StdIn.readString();
	    String city =StdIn.readString();
	    
	    int vertices = StdIn.readInt();
	    double[] x = new  double[vertices];
	    double[] y = new  double[vertices];
	    for(int i =0; i<vertices;i++){
		x[i] = StdIn.readDouble();
		y[i] = StdIn.readDouble();
	 

	    }
	    StdDraw.polygon(x, y);
	      
	     
 	}
 }
} 

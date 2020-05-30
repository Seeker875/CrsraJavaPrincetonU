

public class Checkerboard
{
 public static void main(String[] args)
 {

	 double n = Double.parseDouble(args[0]);
     StdDraw.setScale(0, n);
	 double rem=0.0;
	 //int myC=1;
	 for (double i=0.5; i <n; i++ )
	 {   
	     for (double j= 0.5; j <n; j++ )
	 	{	
		 	 
		 	 rem=(i+j)%2.0;
		 	 // first set pen color
		 	if(rem ==1.0){
		     	StdDraw.setPenColor(StdDraw.BLUE);
	         }else{
		     	StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
		     	
		     	
	     	}
	     	StdDraw.filledSquare(i,j,0.5);
	     }
	
    }	 
		 
 }
}

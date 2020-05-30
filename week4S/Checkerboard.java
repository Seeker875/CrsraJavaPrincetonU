

public class Checkerboard
{
 public static void main(String[] args)
 {

	 double n = Double.parseDouble(args[0]);
     StdDraw.setScale(0, n);
	 double rem=0;
	 for (double i=0; i <=n; i++ )
	     {   
	     for (double j= 0; j <=n; j++ )
	 	{	
		 	 rem=(i+j)%2.0;
	         System.out.println(rem);
		 	if(rem ==0.0){
		     	StdDraw.filledSquare(i,j,1.0);
		      	StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
	         }else{
		     	StdDraw.filledSquare(i,j,1.0);   
		     	StdDraw.setPenColor(StdDraw.BLUE);
	     	}
	     }
	
         }
		 
		 
 }
}

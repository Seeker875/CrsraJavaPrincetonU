

public class ShannonEntropy
{
 	public static void main(String[] args)
 	{

 	int m = Integer.parseInt(args[0]);
 	int n = 0;
        double[] a = new double[m+1];
        double sEnt =0;
        
        while (!StdIn.isEmpty())
 		{
 			int x = StdIn.readInt();
 			a[x]++;
 			n++;
 		} 
        
        for (int i=1; i <=m ; i++ )
        {	
        	// handling log 0
        	if(a[i]!=0){
        		sEnt += - 1 * (a[i]/n)*(Math.log(a[i]/n)/Math.log(2));
        	}

            
           
        }
 		
		
 		StdOut.println(sEnt);
 	}
}
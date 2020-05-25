


public class Birthday {

    public static void main(String[] args) {
        
        
        int n = Integer.parseInt(args[0]);
        int trails = Integer.parseInt(args[1]);
        int[] outer = new int[n];


        for (int i=0; i < trails; i++ ) {
        	int bDay =0;
        	int counter = 0;
        	boolean[] found = new boolean[n]; 

        	for (int j=0; j < n; j++ )
        	{
           // bday betweeen 0 and n -1 
           		bDay = (int) (Math.random() * n);
           		counter=j;
           		if (found[bDay]==true){
           			break;
           	
           		}else{
           			found[bDay] = true;
           		}
        	}
        	outer[counter] = outer[counter] + 1 ;
        }
        //cummmulative sum
        double cumSum = 0;
        double prop = 0;
       
        for (int i=0; i < n; i++ )
        {
        	cumSum += outer[i];
            prop = cumSum/trails;

          
        	System.out.println(i +1 + "\t" +outer[i]+ "\t" + prop);
        	if (prop >= 0.50) {
        		break;
        	}

           
        }
        
    }

}

        



public class Minesweeper {

    public static void main(String[] args) {

    	int m = Integer.parseInt(args[0]);
    	int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);
        
        // +2 rows and columns to count edge cases
        boolean[][] mineM = new boolean[m+2][n+2];

        /* // prob for placing mines
        double propThresh = (double) k/(m*n);
        //System.out.println(propThresh);
        for (int i=1; i < m+1; i++ ) {
        	for (int j=1; j < n+1; j++ ) {
        		if (propThresh > Math.random()){
        			mineM[i][j] = true;
        		}

        	}

        }
        */

        int counter = k; 
        while(counter>0){
        	// random integer between i and n-1
            int r1 = (int) (Math.random() * m);
            int r2 = (int) (Math.random() * n);
            /*
            //System.out.println(r +"\t"+ ((r / m)+1) +"\t"+ ((r % n)+1));
            if(mineM[(r / m)+1][(r % n)+1] == false){
            	mineM[(r / m)+1][(r % n)+1] = true;
            	counter -= 1;
            }
            */
            if(mineM[r1 + 1][r2 + 1] == false){
            	mineM[r1 + 1][r2 + 1] = true;
            	counter -= 1;
            }
            
        	
        }
        /*
        for (int i=1; i < m+1; i++ ) {
        	for (int j=1; j < n+1; j++ ) {
        		System.out.print(mineM[i][j]);
        		System.out.print("  ");
        	}
        	System.out.println();

        }
		*/
        // mineCounts to return mine in a function
        // int[][] mineCounts = new int[m][n];

        
        // outer nested loops for mine count
        for (int i=0; i < m; i++ ) {
        	
        	for (int j=0; j < n; j++ ) {
        		int tempCount = 0;
        		// if starting element is false
        		 if (mineM[i+1][j+1] == false ) {
        		 	//2 loops to check 9 immediate neighors
        		 	for(int x=-1; x<2;x++){
        		 		for(int y=-1; y<2;y++){
        		 			if (mineM[i+1+x][j+1+y]){
        		 				tempCount+=1;
        		 			}
        		 		}
        		 	}
        		 	//mineCounts[i][j]=tempCount
        		 	System.out.print(tempCount + "  ");

        		 }else{
        		 	System.out.print("*" + "  ");
        		 	//mineCounts[i][j]=-9
        		 }	
        		 	
        	}
        	System.out.println();

        }
        

    }
}
    	
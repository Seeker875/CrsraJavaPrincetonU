
//ThueMorse



public class ThueMorse {

    public static void main(String[] args) {
        
        
        int n = Integer.parseInt(args[0]);
        int[] tM = new int[n*n];
        
        for (int i=1; i < n*n; i++ )
        {
           if( i%2 == 0 ){
            tM[i] =  tM[i/2];

           }else{
            tM[i] =  1 - tM[i -1];

           }
           
        }

        for (int i=0; i < n; i++ )
        {
           for (int j=0; j < n; j++ )
            {
                if (tM[i]==tM[j]){
                    System.out.print("+  ");
                }else{
                    System.out.print("-  ");
                }
                
           
            }
            System.out.println("");
           
        }

       

    }

}
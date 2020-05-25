



public class  DiscreteDistribution {

    public static void main(String[] args) {
        
        
        int m = Integer.parseInt(args[0]);

        int[] a = new int[args.length-1];
        int[] s = new int[args.length-1];
        for (int i=1; i < args.length ; i++ )
        // get cummulative  
        {
           a[i-1] = Integer.parseInt(args[i]);
           if (i==1) s[i-1] =  a[i-1];
           else s[i-1] = s[i-2]+ a[i-1];
           
        }
        
        /*
        for (int i=0; i < a.length; i++ )
        {
           System.out.println(a[i]);
           
        }

        for (int i=0; i < a.length; i++ )
        {
           System.out.println(s[i]);
        }
        // random integer between i and n-1
        */

        int idx= s.length-1;
        for (int i=0; i < m; i++ ){

            int r = (int) (Math.random() * s[idx]);
            //System.out.println(idx + " randomNum: "+r);
            for(int j=0; j < s.length; j++ ){
                if (r < s[j]){
                    System.out.print((j+1) + " ");
                    break;
                }
            }

        }
              
        

    }

}
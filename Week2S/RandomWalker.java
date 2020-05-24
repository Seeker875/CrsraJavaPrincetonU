/*
        
       */

public class RandomWalker{

    public static void main(String[] args) {
        
        
        int d = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        double r1 = 0;
        int steps =0;

        
        System.out.println("("+x+","+y+")");

        while (Math.abs(x) + Math.abs(y) != d)
        {
           r1 = Math.random();
           
               
               // random for xor y
            if (r1 < 0.25) x = x -1;
            else if ( r1 < 0.5 ) x = x +1;
            else if ( r1 < 0.75 ) y = y -1;
            else  y = y+ 1;
            

            steps+=1;
            System.out.println( "("+ x + "," + y +")" );
            
        }

        System.out.println("steps = " + steps);
        

    }

}

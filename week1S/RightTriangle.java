//RightTriangle


public class RightTriangle {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean isRightTriangle;
        boolean isPositive;
        boolean checkSum;

        //are integers
        isPositive = (a > 0 && b> 0 && c>0);
/*
        int myMax= Math.max(a,b);
        myMax= Math.max(myMax,c);

        if (c==myMax){
        	// check Sum
        	checkSum = ((a*a + b*b) == (c*c));

        }else if (b==myMax){
        	checkSum = ((a*a + c*c) == (b*b));
        }else {
        	checkSum = ((b*b + c*c) == (a*a));
        }        
*/

        checkSum= ((a*a+b*b==c*c) || (a*a+c*c==b*b)  || (c*c+b*b==a*a));

        isRightTriangle = isPositive &&  checkSum;

        System.out.println(isRightTriangle);

    }

}



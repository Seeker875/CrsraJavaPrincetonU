


public class ActivationFunction {

    // Returns the Heaviside function of x.
    public static double heaviside(double x){
    	if(Double.isNaN(x)) return Double.NaN;
    	if(x<0) return 0;
    	
    	if(x==0) return 0.5;
    	
    	return 1;
    }

    // Returns the sigmoid function of x.
    public static double sigmoid(double x){
    	  if(Double.isNaN(x)) return Double.NaN;
    	  return 1.0/(1.0+Math.exp(-1.0*x));
    }

    // Returns the hyperbolic tangent of x.
    public static double tanh(double x){
    	if(Double.isNaN(x)) return Double.NaN;
    	return  (Math.exp(1.0*x) - Math.exp(-1.0*x))/(Math.exp(1.0*x)+Math.exp(-1.0*x));
    }

    // Returns the softsign function of x.
    public static double softsign(double x){
    	if(Double.isNaN(x)) return Double.NaN;
    	return x/(1.0+Math.abs(x));
    }

    // Returns the square nonlinearity function of x.
    public static double sqnl(double x){
    	if(Double.isNaN(x)) return Double.NaN;
    	if(x<=-2) return -1;
    	if(x>=2) return 1;
    	if(x<0) return x+(x*x/4.0);
    	return x-(x*x/4.0);
    }

    // Takes a double command-line argument x and prints each activation
    // function, evaluated, in the format (and order) given below.
    public static void main(String[] args){
    	double m = Double.parseDouble(args[0]);
    	System.out.println("heaviside("+m+") = " + heaviside(m));
    	System.out.println("sigmoid("+m+") = " + sigmoid(m));
    	System.out.println("tanh("+m+") = " + tanh(m));
    	System.out.println("softsign("+m+") = " + softsign(m));
    	System.out.println("sqnl("+m+") = " + sqnl(m));

    }
}
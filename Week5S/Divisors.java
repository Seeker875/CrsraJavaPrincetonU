
public class Divisors {

    // Returns the greatest common divisor of a and b.
    public static int gcd(int a, int b){
    	a=Math.abs(a);
    	b=Math.abs(b);


		if(a<b){
			int temp =a;
			a=b;
			b=temp;
		}

    	if(a==0 && b==0){
    		return 0;
    	}
    	int temp=0;
    	while(b!=0){
    		
    		temp=a;
    		a = b;
    		b = temp%b;
    	}
    
    	return a;
    }

    // Returns the least common multiple of a and b.
    public static int lcm(int a, int b){
    	if(gcd(a,b)==0) return 0;

    	a=Math.abs(a);
    	b=Math.abs(b);

    	return (a*b)/gcd(a,b);

    }

    // Returns true if a and b are relatively prime; false otherwise.
    public static boolean areRelativelyPrime(int a, int b){
    	if(gcd(a,b)==1){
    		return true;
    	}
    	return false;

    }

    // Returns the number of integers between 1 and n that are
    // relatively prime with n.
    public static int totient(int n){
    	int myCntr = 0;
    	for(int i=1;i<=n;i++){
    		if(areRelativelyPrime(n,i)){
    			myCntr++;
    		}
    	}
    	return myCntr;
    }

    // Takes two integer command-line arguments a and b and prints
    // each function, evaluated in the format (and order) given below.
    public static void main(String[] args){
    	int m = Integer.parseInt(args[0]);
    	int n = Integer.parseInt(args[1]);
    	System.out.println("gcd("+m +", "+ n+") = "+gcd(m,n));
    	System.out.println("lcm("+m +", "+ n+") = "+lcm(m,n));
		System.out.println("areRelativelyPrime("+m +", "+ n+") = "+areRelativelyPrime(m,n));
		System.out.println("totient("+m+") = "+totient(m));
		System.out.println("totient("+n+") = "+totient(n));
	


    }
}
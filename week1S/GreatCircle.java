
// Haversine

public class GreatCircle {

    public static void main(String[] args) {
    	
    	double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));
        double r = 6371.0;

        double a = Math.sin((x2-x1)/2);
        double b = Math.sin((y2-y1)/2);

        double result = 2*r*Math.asin(Math.sqrt((a*a)+(Math.cos(x1)*Math.cos(x2)*b*b)));
        System.out.println(result +" kilometers");

    }

}


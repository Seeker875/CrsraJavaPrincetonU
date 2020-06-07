public class AudioCollage {

    // Returns a new array that rescales a[] by a multiplicative factor of alpha.
    public static double[] amplify(double[] a, double alpha){

        double[] myAmp = new double[a.length];

        for(int i=0;i<a.length;i++){
            myAmp[i]=a[i]*alpha;
        }
        return myAmp;

    }

    // Returns a new array that is the reverse of a[].
    public static double[] reverse(double[] a){
        double[] myRev = new double[a.length];
        for(int i=0;i<myRev.length;i++){
            myRev[i]=a[a.length-i-1];
        }
        return myRev;

    }

    // Returns a new array that is the concatenation of a[] and b[].
    public static double[] merge(double[] a, double[] b){
        double[] myMrg = new double[a.length+b.length];
        for(int i=0;i<a.length;i++){
            myMrg[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            myMrg[i+a.length]=b[i];
        }
        return myMrg;

    }

    // Returns a new array that is the sum of a[] and b[],
    // padding the shorter arrays with trailing 0s if necessary.

    public static double[] mix(double[] a, double[] b){

        double[] myMix = new double[a.length];

        if(a.length>b.length){
            //double[] myMix = new double[a.length];
            for(int i =0; i<myMix.length;i++){

                if(i>=b.length){
                    myMix[i]=a[i]+0;
                }else{
                    myMix[i]=a[i]+b[i];
                }
            }
            //return myMix;
        }
        else
        {
            double[] myMix1 = new double[b.length];
            for(int i =0; i<myMix1.length;i++){

                if(i>=a.length){
                    myMix1[i]=b[i]+0;
                }else{
                    myMix1[i]=b[i]+a[i];
                }
            }
            return myMix1;
        }

        return myMix;

    }

    // Returns a new array that changes the speed by the given factor.
    /*
    public static double[] changeSpeed(double[] a, double alpha){


    }
    */

    // Creates an audio collage and plays it on standard audio.
    // See below for the requirements.
    public static void main(String[] args){
        double[] samples = StdAudio.read(args[0]);

         for(int i=0;i<samples.length;i++){
            if(samples[i]>1){
                samples[i]=1;
            }
            if(samples[i]<-1){
                samples[i]=-1;
            }
            
        } 
        StdAudio.play(amplify(samples,1.5)); 
        StdAudio.play(reverse(samples));    




    }
}
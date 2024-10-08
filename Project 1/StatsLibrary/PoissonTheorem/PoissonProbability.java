
public class PoissonProbability {
        //finds the poisson Probability 
    public static double findPoissonProbability(double variance, long X){
        double p;
        p = (Math.pow(variance, X) * Math.pow(Math.E, -1 * variance));
        p = p / Factorials.RecursiveFactorial(X);
        return p;

    }   
}

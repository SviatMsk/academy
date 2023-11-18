package by.academy.HomeWork;

public class Colculator {
    public static double sum(double x, double y) {
        double result = x + y;
        return result;
    }
    public static double min(double x, double y){
        double result1 = x - y;
        return result1;}
    public static double pod(double x, double y){
        double result2 = x / y;
        return result2;
    }
    public static double ymn(double x, double y){
        double result3 = x * y;
    return result3;
}
        public static void main(String[] args) {
        double result = sum(5.0, 5.0);
        double result1 = min(5.0, 5.0);
        double result2 = pod(5.0, 5.0);
        double result3 = ymn(5.0, 5.0);
        System.out.println(result + " " + result1 + " " + result2 + " " + result3);
    }

}
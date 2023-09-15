package seventh.math;

public class MathFunc implements MathCalculable{
    @Override
    public double pow(double x, int n) {

        while (n>1){
            n--;
            x*=x;
        }
        return x;
    }

    @Override
    public double absComplex(ComplexNumber complexNumber) {
        return Math.sqrt(complexNumber.getA()*complexNumber.getA() + complexNumber.getB()*complexNumber.getB());
    }

    public double getCircleSquare(double r){
        return pow(r, 2)*MathCalculable.PI;
    }

    public double getRectangleSquare(double a, double b){
        return a*b;
    }
}

package calculator;

public class ComplexNumbers {
    private final double numRe;
    private final double numIm;

    public ComplexNumbers() {
        this.numRe = 0.0;
        this.numIm = 0.0;
    }

    public ComplexNumbers(double numRe) {
        this.numRe = numRe;
        this.numIm = 0.0;
    }

    public ComplexNumbers(double numRe, double numIm) {
        this.numRe = numRe;
        this.numIm = numIm;
    }

    public double getNumRe() {
        return numRe;
    }

    public double getNumIm() {
        return numIm;
    }
    public ComplexNumbers addition(ComplexNumbers b){
        return new ComplexNumbers(this.numRe + b.numRe,this.numIm + b.numIm);
    }
    public ComplexNumbers multiplication(ComplexNumbers b){
        double multRe = this.numRe * b.numRe - this.numIm * b.numIm;
        double multIm = this.numRe * b.numIm + this.numIm * b.numRe;
        return new ComplexNumbers(multRe,multIm);
    }
    public ComplexNumbers division(ComplexNumbers b){
        double denominator = b.numRe * b.numRe + b.numIm * b.numIm;
        double divRe =(this.numRe * b.numRe + this.numIm * b.numIm)/denominator;
        double divIm =(this.numIm * b.numRe - this.numRe * b.numIm)/denominator;
        return new ComplexNumbers(divRe, divIm);
    }
    public ComplexNumbers subtraction(ComplexNumbers b){
        return new ComplexNumbers(this.numRe - b.numRe,this.numIm - b.numIm);
    }

    @Override
    public String toString() {
        if (this.numIm == 0) return this.numRe + "";
        if (this.numRe == 0) return this.numIm + "i";
        if (this.numIm < 0) return this.numRe + " - " + (-this.numIm) + "i";
        return this.numRe + " + " + this.numIm + "i";
    }
}
package com.OOPSinJava.coreJava;

public class FractionClass {
    public static Fraction add(Fraction f1, Fraction f2){
        int numerator = f1.neum*f2.deno + f2.neum*f1.deno;
        int denom = f1.deno+ f2.deno;
        Fraction f3 = new Fraction(numerator,denom);
        return f3;
    }
    public static Fraction mul(Fraction f1, Fraction f2){
        int numerator = f1.neum*f2.neum;
        int denom = f1.deno*f2.deno;
        Fraction f3 = new Fraction(numerator,denom);
        return f3;
    }
    public static Fraction sub(Fraction f1, Fraction f2){
        int numerator = f1.neum*f2.deno - f2.neum*f1.deno;
        int denom = f1.deno * f2.deno;
        Fraction f3 = new Fraction(numerator,denom);
        return f3;
    }
    public static int gcd(int neum, int deno){
        int mini = Math.min(neum,deno);
        for (int i = mini; i >= 1; i--) {
            if (neum%i == 0 && deno%i == 0) return i;
        }
        return mini;
    }
    public static class Fraction{
        int neum;
        int deno;
        public Fraction(int neum, int deno){
            this.neum = neum;
            this.deno = deno;
            int ans = this.neum /deno;
            simplify();
        }
        public void simplify() {
            int hcf = gcd(neum,deno);
            neum /= hcf;
            deno /= hcf;
        }
    }
    public static void main(String[] args) {
        Fraction f1 = new Fraction(14,21);
        System.out.println(f1.neum+"/"+f1.deno);
        Fraction f2 = new Fraction(1,2);
        System.out.println(f2.neum+"/"+f2.deno);
//        f1.simplify();
        Fraction f3 = sub(f1,f2);
        System.out.println(f3.neum+"/"+f3.deno);
    }
}

package ru.SemperAnte.Univer.ChislMethod.Functions;

public class Integral
{
	 public double Gaus(double[] t, double[] A, int n, double a, double b)
	 {
			double ba2 = (b+a)/2;
			double bma2 = (b-a)/2;
			double result = 0;
			for(int i =1; i <=n; ++i)
			{
				 double x = ba2+bma2*t[i-1];
				 result += A[i-1]*GausFunction(x);
			}
		return bma2*result;
	 }

	 private double GausFunction(double x)
	 {
		  return (x*x*x*x+12)/(x*x*x*x*x*x+1);
	 }
}

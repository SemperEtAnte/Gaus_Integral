package ru.SemperAnte.Univer.ChislMethod;

import ru.SemperAnte.Univer.ChislMethod.Functions.Integral;

public class MainClass
{
	 public static void main(String[] args)
	 {
		  double A[] = { 0.171324, 0.3601762, 0.467914, 0.467914, 0.3601762, 0.171324 };
		  double t[] = { -0.932469, -0.661209, -0.238619, 0.238619, 0.661209, 0.932469 };
		  System.out.println("Integral = " + new Integral().Gaus(t, A, 6, 0, 1));
	 }
}

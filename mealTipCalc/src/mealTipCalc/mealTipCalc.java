/**
 * 
 */
package mealTipCalc;

import java.util.Scanner;
/**
 * @author corey
 *
 */
public class mealTipCalc {

	/**
	 * @param args
	 * @return 
	 */
	public double tipRate = 0;
	public static double calculateTipRate(double serviceLevel) {
	
		if (serviceLevel == 1.0) {
			double tipRate = 0.075;
			return tipRate;
		}
		else {
			if (serviceLevel == 2.0) {
			double tipRate = 0.1;
			return tipRate;
		}
		else {
			if (serviceLevel == 3.0) {
			double tipRate = 0.125;
			return tipRate;
		}			
		else {
			if (serviceLevel == 4.0) {
			double tipRate = 0.15;
			return tipRate;
		}
		else {
			if (serviceLevel == 5.0) {
			double tipRate = 0.175;
			return tipRate;
		}
		else {
			if (serviceLevel == 6.0) {
			double tipRate = 0.20;
			return tipRate;
		}
		else {
			if (serviceLevel == 7.0) {
			double tipRate = 0.225;
			return tipRate;
		}
		else {
			if (serviceLevel == 8.0) {
			double tipRate = 0.25;
			return tipRate;
		}
		else {
			if (serviceLevel == 9.0) {
			double tipRate = 0.275;
		}
		else {
			if (serviceLevel == 10.0) {
			double tipRate = 0.30;
		}
	return tripRate;
	}
	
	public static double calculateTip(double listedMealPrice, double tipRate) {
		double tip = listedMealPrice * tipRate;
		return tip;
	}
	
	public static double calculateTax(double listedMealPrice, double taxRate) {
		double tax = listedMealPrice * taxRate;
		return tax;

	}
	public static double calculateTotalMealPrice(double listedMealPrice, 
			   									double tip, 
			   									double tax) {
		double totalMealPrice = listedMealPrice + tip + tax;
		return totalMealPrice;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		
		System.out.println("please input the listed Meal Price");
		double listedMealPrice = input.nextDouble();
		
		System.out.println("please input the service level");
		System.out.println("{1-10} 10 = best");
		double serviceLevel = input.nextDouble(); 
		
		double tipRate = calculateTipRate(serviceLevel);
		double tip = calculateTip(listedMealPrice, tipRate);
			
		double taxRate = 0.05;
		double tax = calculateTax(listedMealPrice, taxRate);
		
		
		System.out.println("please input number of guest");
		double guest = input.nextDouble();
		
			
		double groupTotalMealPrice = calculateTotalMealPrice(listedMealPrice, tip, tax);
		System.out.println("group total meal price = $" + groupTotalMealPrice);
		
		double individualMealPrice = groupTotalMealPrice / guest;
		System.out.println("individual meal price = $" + individualMealPrice);
		
		

	
	}

}

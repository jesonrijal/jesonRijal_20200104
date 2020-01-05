package main.java.juniordeveloper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FuelRequirement {
	
	public int totalFuelRequired(int num) {
		int fuelReq = 0;
		fuelReq = (num / 3) - 2;
		return fuelReq;
	}

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\lukur\\Documents\\alamoninc\\juniordeveloper\\InputData.txt"); 
		String mass;
		int sum = 0;		
		try {
			BufferedReader br = null;
			br = new BufferedReader(new FileReader(file));
			System.out.println("The fuel required for each inputed data are:");			
			while ((mass = br.readLine()) != null) {				
			int num = Integer.parseInt(mass);
			FuelRequirement fuel = new FuelRequirement();
			System.out.println(fuel.totalFuelRequired(num));
			sum = sum + fuel.totalFuelRequired(num);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("The sum of the fuel requirements for all of the modules on our spacecraft is: "+ sum);
	}
	
}

package week1.day2;

import java.util.Arrays;

public class Arraysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxMinPrint();
		DuplicatePrint();

	}

	public static void MaxMinPrint() {
		//Classroom Assignment 2 A: Find the max and min values of the int array
		int[] nums = {22, 3981, -19, 82, 0, 45, 37};
		//System.out.println(nums.length);
		Arrays.sort(nums);
		/*for (int i=0;i<nums.length;i++)
				{
					System.out.println(nums[i]);
				}*/
		System.out.println("max"+nums[nums.length-1]);
		System.out.println("min"+nums[0]);
		System.out.println("----------------------");

	}
	public static void DuplicatePrint() {
		//Classroom Assignment 2 B: Find the duplicate values in the given array
		int[] nums = {12, 25, 12, 56, 89, 25};
		Arrays.sort(nums);
		for (int i=0;i<nums.length-1;i++) {
			if (nums[i]==nums[i+1])	
			{System.out.println("duplicate"+nums[i]);}

		}
		/*for (int i=0;i<nums.length;i++) {
			for (int j=i+1;j<nums.length;j++)
			if (nums[i]==nums[j])	
			{System.out.println("duplicate"+nums[i]);}
			break;
			}
		 */



	}
}

package com.kondo.kondoproject;

import java.math.BigInteger;

public class KondoKadai001 {
	public static void main(String[] args) {
		KondoKadai001 kadai001 = new KondoKadai001();
		String[] array = { "999999999999", "1" };
		//String[] array = {};
		System.out.println(kadai001.sum(array));
	}

	public String sum(String[] nums) throws IllegalArgumentException {
		int sumNums = 0;
		if (nums == null) {
			throw new IllegalArgumentException("引数がNULLです");
		}

		int changeNum = 0;//
		try {
			for (int i = 0; i < nums.length; i++) {
				try {
					changeNum = Integer.parseInt(nums[i]);
				} catch (Exception e) {
					try {
						new BigInteger(nums[i]);
					} catch (Exception e1) {
						throw e;
					}
					throw new ArithmeticException("Integer overflow");
				}
				sumNums += changeNum;
			}
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("引数の内容に数字以外が含まれています");
		}
		return String.valueOf(sumNums);
	}
}
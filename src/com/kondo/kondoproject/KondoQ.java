package com.kondo.kondoproject;

class KondoQ {
	public static int sum;
	static final int TRIAL = 5;

	public static int getSum() {
		sum = 0;
		System.err.println(sum);
		for (int i = 0; i < TRIAL; i++) {
			sum += 3;
		}
		return sum;

	}

}

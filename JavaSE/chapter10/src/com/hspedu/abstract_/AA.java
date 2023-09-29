package com.hspedu.abstract_;

public class AA extends Template {
	@Override
	public void job() {
		long num = 0;
		for (int i = 0; i <= 8000000; i++) {
			num += i;
		}
	}
}

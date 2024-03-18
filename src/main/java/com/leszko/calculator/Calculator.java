package com.leszko.calculator;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/** Calculator logic */
@Service
public class Calculator {
	@Cacheable("sum")
	public int sum(int a, int b) {
		int result = a + b;
		System.out.println("WYNIK: "+ result); // wyświetlanie wyniku
		return result;
	}
}

package com.techtalk.debu.service.impl;

import org.springframework.stereotype.Service;

import com.techtalk.debu.service.SumService;

@Service
public class SumServiceImpl implements SumService {

	@Override
	public int sum(int a, int b, int c) {

		int result = a + b + c;

		return result;
	}

}

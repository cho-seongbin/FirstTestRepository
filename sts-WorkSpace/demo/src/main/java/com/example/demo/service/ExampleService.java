package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ExampleService {
	@SuppressWarnings({"unchecked","rawtypes"})
	public List getExample() {
		List result = new ArrayList();
		
		result.add("Example1");
		result.add("Example2");
		result.add("Example3");
		result.add("Example4");
		
		return result;
	}
}

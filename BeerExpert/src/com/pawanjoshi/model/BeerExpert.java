package com.pawanjoshi.model;

import java.util.*;

public class BeerExpert {
	 public List<String> getBrands(String color) {
		List<String> brands = new ArrayList<String>();
		if (color.equals("amber")) {
			brands.add("Jack Amber");
			brands.add("Red Moose");
		}
		else {
			brands.add("Pale Ale");
			brands.add("Gout Stout");
		}
		return (brands);
	}
}

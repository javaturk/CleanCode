package org.javaturk.cc.ch02.cohesion.address;

import java.util.List;

public class City {
	
	protected String name;

	protected List<Neighborhood> neighborhoods;
	protected List<Street> streets;
	protected List<PostalCode> postalCodes;
}

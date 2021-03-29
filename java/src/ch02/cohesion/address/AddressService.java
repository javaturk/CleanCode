package org.javaturk.cc.ch02.cohesion.address;

import java.util.List;

public interface AddressService {
	
	public boolean isPostalCodeInGivenCity(City city);
	
	public List<PostalCode> getAllPostalCodesInGivenCity(City city);
	
	public boolean arePostalCodesNeighbor(PostalCode postalCode1, PostalCode postalCode2);
	
	public List<Neighborhood> getAllNeighborhoodsInGivenCity(City city);
	
	public List<Neighborhood> getAllNeighborhoodsInGivenPostalCode(PostalCode postalCode);
	
	public List<Street> getAllStreetsInGivenCity(City city);
	
	public List<Street> getAllStreetsInGivenPostalCode(PostalCode postalCode);
	
	public List<Street> getAllStreetsInGivenNeighborhood(Neighborhood neighborhood);
}

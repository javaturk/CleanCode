package org.javaturk.cc.ch02.cohesion.temperature.functional;

public class Temperature {
	private double degree;
	private TemperatureType type;
	
	public Temperature(double degree, TemperatureType type) {
		this.degree = degree;
		this.type = type;
	}

	public double getDegree() {
		return degree;
	}

	public void setDegree(double degree) {
		this.degree = degree;
	}

	public TemperatureType getType() {
		return type;
	}

	public void setType(TemperatureType type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(degree);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Temperature other = (Temperature) obj;
		if (Double.doubleToLongBits(degree) != Double.doubleToLongBits(other.degree))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Temperature [degree=" + degree + ", type=" + type + "]";
	}
}

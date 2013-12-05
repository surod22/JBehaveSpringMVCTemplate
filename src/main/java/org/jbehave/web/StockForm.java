package org.jbehave.web;

public class StockForm {

	private String name;
	private double threshold;
	private double tradeAt;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getThreshold() {
		return threshold;
	}

	public double getTradeAt() {
		return tradeAt;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		StockForm other = (StockForm) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}

package javabigbrother.examples.duplicate;


public class Fruit {
	
	private final String  name;
	private final String  family;
	private final String  colour;
	private final Integer energy;

	public Fruit(String name, String family, String colour, Integer energy) {
		super();
		this.name = name;
		this.family = family;
		this.colour = colour;
		this.energy = energy;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((colour == null) ? 0 : colour.hashCode());
		result = prime * result + ((energy == null) ? 0 : energy.hashCode());
		result = prime * result + ((family == null) ? 0 : family.hashCode());
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
		Fruit other = (Fruit) obj;
		if (colour == null) {
			if (other.colour != null)
				return false;
		} else if (!colour.equals(other.colour))
			return false;
		if (energy == null) {
			if (other.energy != null)
				return false;
		} else if (!energy.equals(other.energy))
			return false;
		if (family == null) {
			if (other.family != null)
				return false;
		} else if (!family.equals(other.family))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", family=" + family + ", colour="
				+ colour + ", energy=" + energy + "]";
	}
	

}

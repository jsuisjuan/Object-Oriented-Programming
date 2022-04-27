
import java.util.Objects;

public class Quadrado {
	private double alt;
	private double larg;
	public double getAlt() {
		return alt;
	}
	public void setAlt(double alt) {
		this.alt = alt;
	}
	public double getLarg() {
		return larg;
	}
	public void setLarg(double larg) {
		this.larg = larg;
	}
	
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Quadrado other = (Quadrado) obj;
		
		if (Objects.equals(larg, other.larg)) {
			if (Objects.equals(alt, other.alt)) {
				return true;
			}
		}
		return false;
	}
}

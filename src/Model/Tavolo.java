package Model;

public class Tavolo {
	
	private int tipoTavolo;

	public Tavolo(int tipoTavolo) {
		super();
		this.tipoTavolo = tipoTavolo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + tipoTavolo;
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
		Tavolo other = (Tavolo) obj;
		if (tipoTavolo != other.tipoTavolo)
			return false;
		return true;
	}

	public int getTipoTavolo() {
		return tipoTavolo;
	}

	public void setTipoTavolo(int tipoTavolo) {
		this.tipoTavolo = tipoTavolo;
	}
	
	

}

package Model;

import java.time.LocalDateTime;

public class Evento implements Comparable<Evento>{
	
	public enum TipoEvento{
		CLIENTE_ARRIVA,
		CLIENTE_ESCE,
	}
	
	private TipoEvento tipo;
	private int numeroPersone;
	private LocalDateTime oraArrivo;
	private LocalDateTime oraUscita;
	private double tolleranza;

	public Evento(TipoEvento tipo, int numeroPersone, LocalDateTime oraArrivo, LocalDateTime oraUscita,
			double tolleranza) {
		super();
		this.tipo = tipo;
		this.numeroPersone = numeroPersone;
		this.oraArrivo = oraArrivo;
		this.oraUscita = oraUscita;
		this.tolleranza = tolleranza;
	}

	@Override
	public int compareTo(Evento arg0) {
		return this.oraArrivo.compareTo(arg0.oraArrivo);
	}

	public int getNumeroPersone() {
		return numeroPersone;
	}

	public LocalDateTime getOraArrivo() {
		return oraArrivo;
	}

	public LocalDateTime getOraUscita() {
		return oraUscita;
	}

	public double getTolleranza() {
		return tolleranza;
	}

	public TipoEvento getTipo() {
		return tipo;
	}
	
	
	
	
	
}

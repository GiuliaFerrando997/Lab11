package Model;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;

public class Simulatore {
	
	//Modello --> Stato del sistema
	
	// tii di evento
	private PriorityQueue<Evento> queue;
	
	//Valori della simulazione
	private Map<Tavolo, Integer> tavoli;
	
	//Valori in output
	private int totaleClienti;
	private int clientiSoddisfatti;
	private int clientiInsoddisfatti;
	
	//Variabili interne
	private Random rand = new Random();
	
	//Parametri di simulazione
	private List<Duration> durata;
	private List<Integer> numeroPersone;
	private List<Duration> arrivo;
	private List<Double> tolleranza;
	
	public Simulatore() {
		this.tavoli=new HashMap<>();
		Tavolo t = new Tavolo(10);
		tavoli.put(t, 2);
		Tavolo t1 = new Tavolo(8);
		tavoli.put(t, 4);
		Tavolo t2 = new Tavolo(6);
		tavoli.put(t, 4);
		Tavolo t3 = new Tavolo(4);
		tavoli.put(t, 5);
		this.durata=new ArrayList<>();
		for(int i =60; i<121; i++) {
			durata.add(Duration.ofMinutes(i));
		}
		this.numeroPersone=new ArrayList<>();
		for(int i =1; i<11; i++) {
			numeroPersone.add(i);
		}
		this.arrivo=new ArrayList<>();
		for(int i =1; i<11; i++) {
			arrivo.add(Duration.ofMinutes(i));
		}
		this.tolleranza=new ArrayList<>();
		for(double i =0.0; i<1.0; i++) {
			tolleranza.add(i);
		}
		
	}
	
	public void init() {
		this.clientiInsoddisfatti=0;
		this.clientiSoddisfatti=0;
		this.totaleClienti=0;
		
		
		this.queue=new PriorityQueue<Evento>();
		for(int i =1; i<2000; i++) {
			this.queue.add(new Evento(CLIENTE_ARRIVA, ))
		}
		
	}
	
	public void run() {
		
	}

}

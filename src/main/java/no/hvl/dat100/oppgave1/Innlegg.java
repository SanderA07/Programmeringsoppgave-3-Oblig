package no.hvl.dat100.oppgave1;

import no.hvl.dat100.common.TODO;

public abstract class Innlegg {
	
	// TODO - deklarering av objektvariable

	private int id;
	private String bruker;
	private String dato;
	private int likes;
	private String Bruker;

	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {

		// TODO
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = 0;
		throw new UnsupportedOperationException(TODO.constructor("Innlegg"));
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		// TODO - START
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
		
		throw new UnsupportedOperationException(TODO.constructor("Innlegg"));
	}
	
	public String getBruker() {
		throw new UnsupportedOperationException(TODO.method());
	}

	public String setBruker(String bruker) {
		return Bruker;
	}

	public String getDato() {
		return dato;
		
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public int getId() {
		return id;

	}

	public void setId(int Id) {
		this.id = id;

	}
	
	public void doLike () {
		likes++;
	}
	
	public boolean erLik(Innlegg innlegg) {
		throw new UnsupportedOperationException(TODO.method());

	}
	
	@Override
	public String toString() {

		return id + "\n" +
				bruker + "\n" +
				dato + "\n" +
				likes + "\n";
				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}

package imd.model;

public class Escola{
	
	private Evento evento;
	
	public Evento getEvento() {
		return evento;
	}
	
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	
	public String mostrarEvento() {
		return "Evento: " + evento.getNome() + "\nData: " + evento.getData();
	}
}
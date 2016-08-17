package pe.edu.upc.entity;

public class Mermelada extends Fruta{
	private int duracionDias;
	private String tipoEnvase;
	
	
	
	public Mermelada(String nombre, String color, String sabor,int duracionDias, String tipoEnvase) {
		super(nombre, color, sabor);
		// TODO Auto-generated constructor stub
		this.duracionDias =duracionDias;
		this.tipoEnvase= tipoEnvase;
		
		
	}

	public String prepararMermelada(){
		return ("Preparar mermelada con alegria:"+this.getNombre());
	}
		
}

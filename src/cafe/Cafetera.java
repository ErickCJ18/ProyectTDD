package cafe;

public class Cafetera
{
	private int cantidadCafe;
	private String marca;
	private String modelo;
	
	public Cafetera(int cantidadCafe) 
	{
		this.cantidadCafe = cantidadCafe;
		this.marca = "Desconocida";
		this.modelo = "Desconocido";
	}
	
	public Cafetera(int cantidadCafe, String marca, String modelo) 
	{
		this.cantidadCafe = cantidadCafe;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	void setCantidadDeCafe(int param1) 
	{
		this.cantidadCafe = param1;
	}
	
	public int getCantidadDeCafe() 
	{
		return this.cantidadCafe;
	}
	
	public void setMarca(String marca)
	{
		this.marca = marca;
	}
	
	public String getMarca()
	{
		return this.marca;
	}
	
	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}
	
	public String getModelo()
	{
		return this.modelo;
	}
	
	public boolean hasCafe(int checkCafe) 
	{
		return this.cantidadCafe >= checkCafe;
	}
	
	public void giveCafe(int cantidad) 
	{
		cantidadCafe -= cantidad;
	}
	
	// SETTERS
	// GETTERS
}

package cafe;

public class Cafetera
{
	private int cantidadCafe;
	
	public Cafetera(int cantidadCafe) 
	{
		this.cantidadCafe = cantidadCafe;
	}
	
	void setCantidadDeCafe(int param1) 
	{
		this.cantidadCafe = param1;
	}
	
	public int getCantidadDeCafe() 
	{
		return this.cantidadCafe;
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

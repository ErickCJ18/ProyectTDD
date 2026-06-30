package cafe;

public class Azucarero
{
	private int cantidadDeAzucar;
	
	public Azucarero(int cantidadDeAzucar) 
	{
		this.cantidadDeAzucar = cantidadDeAzucar;
	}
	
	public void setCantidadDeAzucar(int param1) 
	{
		this.cantidadDeAzucar = param1;
	}
	
	public int getCantidadDeAzucar() 
	{
		return this.cantidadDeAzucar;
	}
	
	public boolean hasAzucar(int cantidad) 
	{
		return cantidadDeAzucar >= cantidad;
	}
	
	public void giveAzucar(int cantidad) 
	{
		cantidadDeAzucar -= cantidad;
	}
}

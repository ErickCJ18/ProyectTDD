package cafe;

public class Vaso 
{
	private int cantidadVasos;
	private int contenido;
	
	public Vaso(int vasosAmount, int content) 
	{
		this.cantidadVasos = vasosAmount;
		this.contenido = content;
	}
	
	public void setCantidadVasos(int param1) 
	{
		this.cantidadVasos = param1;
	}
	
	public int getCantidadVasos() 
	{
		return this.cantidadVasos;
	}
	
	public void setContenido(int param1) 
	{
		this.contenido = param1;
	}
	
	public int getContenido() 
	{
		return this.contenido;
	}
	
	public boolean hasVasos(int checkVasos) 
	{
		return this.cantidadVasos >= checkVasos;
	}
	
	public void giveVasos(int amountVasos) 
	{
		this.cantidadVasos -= amountVasos;
	}
}

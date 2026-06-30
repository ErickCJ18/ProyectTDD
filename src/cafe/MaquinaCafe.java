package cafe;

public class MaquinaCafe
{
	private Cafetera cafe;
    public Vaso vasosPequeno;
    public Vaso vasosMediano;
    public Vaso vasosGrande;
    private Azucarero azucar;
    
    public void setCafetera(Cafetera cafe) {
        this.cafe = cafe;
    }

    public Cafetera getCafetera() {
        return cafe;
    }

    public void setVasosPequeno(Vaso vaso) {
        this.vasosPequeno = vaso;
    }

    public Vaso getVasosPequeno() {
        return vasosPequeno;
    }

    public void setVasosMediano(Vaso vaso) {
        this.vasosMediano = vaso;
    }

    public Vaso getVasosMediano() {
        return vasosMediano;
    }

    public void setVasosGrande(Vaso vaso) {
        this.vasosGrande = vaso;
    }

    public Vaso getVasosGrande() {
        return vasosGrande;
    }

    public void setAzucarero(Azucarero azucarero) {
        this.azucar = azucarero;
    }

    public Azucarero getAzucarero() {
        return azucar;
    }

    public Vaso getTipoDeVaso(String tipo) {
        if (tipo.equals("pequeno")) return vasosPequeno;
        if (tipo.equals("mediano")) return vasosMediano;
        if (tipo.equals("grande"))  return vasosGrande;
        return null;
    }

    public String getVasoDeCafe(Vaso vaso, int cantidadVasos, int cantidadDeAzucar) {
        if (!vaso.hasVasos(cantidadVasos)) {
            return "No hay Vasos";
        }
        if (!cafe.hasCafe(vaso.getContenido())) {
            return "No hay Cafe";
        }
        if (!azucar.hasAzucar(cantidadDeAzucar)) {
            return "No hay Azucar";
        }

        vaso.giveVasos(cantidadVasos);
        cafe.giveCafe(vaso.getContenido());
        azucar.giveAzucar(cantidadDeAzucar);

        return "Felicitaciones";
    }
}

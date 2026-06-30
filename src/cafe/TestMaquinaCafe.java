// Erick Castillo John • 2024-2448

package cafe;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestMaquinaCafe {
    Cafetera cafetera;
    Vaso vasosPequeno;
    Vaso vasosMediano;
    Vaso vasosGrande;
    Azucarero azucarero;
    MaquinaCafe MaquinaCafe;

    @Before
    public void setUp() {
        cafetera      = new Cafetera(50);
        vasosPequeno  = new Vaso(5, 10);
        vasosMediano  = new Vaso(5, 20);
        vasosGrande   = new Vaso(5, 30);
        azucarero     = new Azucarero(20);

        MaquinaCafe = new MaquinaCafe();
        MaquinaCafe.setCafetera(cafetera);
        MaquinaCafe.setVasosPequeno(vasosPequeno);
        MaquinaCafe.setVasosMediano(vasosMediano);
        MaquinaCafe.setVasosGrande(vasosGrande);
        MaquinaCafe.setAzucarero(azucarero);
    }

    @Test
    public void deberiaDevolverUnVasoPequeno() {
        Vaso vaso = MaquinaCafe.getTipoDeVaso("pequeno");
        assertEquals(MaquinaCafe.vasosPequeno, vaso);
    }

    @Test
    public void deberiaDevolverUnVasoMediano() {
        Vaso vaso = MaquinaCafe.getTipoDeVaso("mediano");
        assertEquals(MaquinaCafe.vasosMediano, vaso);
    }

    @Test
    public void deberiaDevolverUnVasoGrande() {
        Vaso vaso = MaquinaCafe.getTipoDeVaso("grande");
        assertEquals(MaquinaCafe.vasosGrande, vaso);
    }

    @Test
    public void deberiaDevolverNoHayVasos() {
        MaquinaCafe mdc = new MaquinaCafe();
        mdc.setCafetera(cafetera);
        mdc.setVasosPequeno(new Vaso(0, 10));
        mdc.setAzucarero(azucarero);
        Vaso vaso = mdc.getTipoDeVaso("pequeno");
        String resultado = mdc.getVasoDeCafe(vaso, 10, 2);
        assertEquals("No hay Vasos", resultado);
    }

    @Test
    public void deberiaDevolverNoHayCafe() {
        cafetera = new Cafetera(5);
        MaquinaCafe.setCafetera(cafetera);
        Vaso vaso = MaquinaCafe.getTipoDeVaso("pequeno");
        String resultado = MaquinaCafe.getVasoDeCafe(vaso, 1, 2);
        assertEquals("No hay Cafe", resultado);
    }

    @Test
    public void deberiaDevolverNoHayAzucar() {
        azucarero = new Azucarero(2);
        MaquinaCafe.setAzucarero(azucarero);
        Vaso vaso = MaquinaCafe.getTipoDeVaso("pequeno");
        String resultado = MaquinaCafe.getVasoDeCafe(vaso, 1, 3);
        assertEquals("No hay Azucar", resultado);
    }

    @Test
    public void deberiaDevolverFelicitaciones() {
        Vaso vaso = MaquinaCafe.getTipoDeVaso("pequeno");
        String resultado = MaquinaCafe.getVasoDeCafe(vaso, 1, 3);
        assertEquals("Felicitaciones", resultado);
    }

    @Test
    public void deberiaRestarCafe() {
        Vaso vaso = MaquinaCafe.getTipoDeVaso("pequeno");
        MaquinaCafe.getVasoDeCafe(vaso, 1, 3);
        int resultado = MaquinaCafe.getCafetera().getCantidadDeCafe();
        assertEquals(40, resultado);
    }

    @Test
    public void deberiaRestarVaso() {
        Vaso vaso = MaquinaCafe.getTipoDeVaso("pequeno");
        MaquinaCafe.getVasoDeCafe(vaso, 1, 3);
        int resultado = MaquinaCafe.getVasosPequeno().getCantidadVasos();
        assertEquals(4, resultado);
    }

    @Test
    public void deberiaRestarAzucar() {
        Vaso vaso = MaquinaCafe.getTipoDeVaso("pequeno");
        MaquinaCafe.getVasoDeCafe(vaso, 1, 3);
        int resultado = MaquinaCafe.getAzucarero().getCantidadDeAzucar();
        assertEquals(17, resultado);
    }
}
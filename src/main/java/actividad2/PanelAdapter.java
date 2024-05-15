package actividad2;

import java.awt.*;

public class PanelAdapter implements Panel{
    private Graphics2D graphics2D;

    public PanelAdapter(Graphics2D graphics2D) {
        this.graphics2D = graphics2D;
    }
    @Override
    public void dibujarTexto(Coordenada coordenada, String texto) {
        graphics2D.drawString(texto, coordenada.x(), coordenada.y());
    }

    @Override
    public void dibujarLinea(Coordenada coordenada, int longitud) {
        graphics2D.drawLine(coordenada.x(), coordenada.y(), coordenada.x() + longitud, coordenada.y());
    }

    @Override
    public void dibujarCirculo(Coordenada coordenada, int radio) {
        graphics2D.drawOval(coordenada.x() - radio,
                coordenada.y() - radio,
                radio * 2,
                radio * 2);
    }
}

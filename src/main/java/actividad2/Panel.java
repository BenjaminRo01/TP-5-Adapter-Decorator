package actividad2;

public interface Panel {
    void dibujarTexto(Coordenada coordenada, String texto);
    void dibujarLinea(Coordenada coordenada, int longitud);
    void dibujarCirculo(Coordenada coordenada, int radio);
}

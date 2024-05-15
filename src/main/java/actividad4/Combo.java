package actividad4;

abstract class Combo implements IPedido{
    protected IPedido pedido;
    protected double precio;
    public Combo(IPedido pedido, double precio) {
        this.pedido = pedido;
        this.precio = precio;
    }
    public abstract String descripcion();
    public abstract double precio();
}

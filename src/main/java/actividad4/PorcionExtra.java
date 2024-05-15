package actividad4;

abstract class PorcionExtra extends Combo{
    public PorcionExtra(IPedido pedido, double precio) {
        super(pedido, precio);
    }
    public abstract String descripcion();

    public abstract double precio();
}

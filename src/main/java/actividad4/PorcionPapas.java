package actividad4;

public class PorcionPapas extends PorcionExtra{
    public PorcionPapas(IPedido pedido, double precio) {
        super(pedido, precio);
    }

    @Override
    public String descripcion() {
        return this.pedido.descripcion() + "\nPorcion adicional: Papas";
    }

    @Override
    public double precio() {
        return this.pedido.precio() + this.precio;
    }
}

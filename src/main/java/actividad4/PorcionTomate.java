package actividad4;

public class PorcionTomate extends PorcionExtra{
    public PorcionTomate(IPedido pedido, double precio) {
        super(pedido, precio);
    }
    @Override
    public String descripcion() {
        return this.pedido.descripcion() + "\nPorcion adicional: Tomate";
    }

    @Override
    public double precio() {
        return this.pedido.precio() + this.precio;
    }
}

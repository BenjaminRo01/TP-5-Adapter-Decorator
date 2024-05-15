package actividad4;

public class PorcionQueso extends PorcionExtra{
    public PorcionQueso(IPedido pedido, double precio) {
        super(pedido, precio);
    }

    @Override
    public String descripcion() {
        return this.pedido.descripcion() + "\nPorcion adicional: Queso";
    }

    @Override
    public double precio() {
        return this.pedido.precio() + this.precio;
    }
}

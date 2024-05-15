package actividad4;

public class PorcionCarne extends PorcionExtra{
    public PorcionCarne(IPedido pedido, double precio) {
        super(pedido, precio);
    }

    @Override
    public String descripcion() {
        return this.pedido.descripcion() + "\nPorcion adicional: Carne";
    }

    @Override
    public double precio() {
        return this.pedido.precio() + this.precio;
    }
}

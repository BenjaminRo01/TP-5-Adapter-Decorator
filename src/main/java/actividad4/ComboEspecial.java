package actividad4;

public class ComboEspecial extends Combo{
    public ComboEspecial(IPedido pedido, double precio) {
        super(pedido, precio);
    }
    @Override
    public String descripcion() {
        return this.pedido.descripcion()
                + "\nCombo especial: Papas grandes + Hamburguesa doble + Coca cola";
    }

    @Override
    public double precio() {
        return this.pedido.precio() + this.precio;
    }
}

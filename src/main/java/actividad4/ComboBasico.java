package actividad4;

public class ComboBasico extends Combo{
    public ComboBasico(IPedido pedido, double precio) {
        super(pedido, precio);
    }
    @Override
    public String descripcion() {
        return this.pedido.descripcion()
                + "\nCombo simple: Papas medianas + Hamburguesa simple";
    }

    @Override
    public double precio() {
        return this.pedido.precio() + this.precio;
    }
}

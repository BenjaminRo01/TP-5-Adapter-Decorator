package actividad4;

public class ComboFamiliar extends Combo{
    public ComboFamiliar(IPedido pedido, double precio) {
        super(pedido, precio);
    }
    @Override
    public String descripcion() {
        return this.pedido.descripcion()
                + "\nCombo familiar: Papas chicas (x3) + Hamburguesa simple (x3) + Coca cola (x3)";
    }
    @Override
    public double precio() {
        return this.pedido.precio() + this.precio;
    }
}

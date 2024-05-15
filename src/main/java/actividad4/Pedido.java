package actividad4;

public class Pedido implements IPedido{
    @Override
    public String descripcion() {
        return "Descripcion del pedido:";
    }

    @Override
    public double precio() {
        return 0;
    }
}

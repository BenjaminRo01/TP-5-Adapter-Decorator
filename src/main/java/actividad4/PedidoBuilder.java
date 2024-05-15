package actividad4;

public class PedidoBuilder {
    private Pedido pedido;
    private IPedido pedidoFinal;

    public PedidoBuilder(Pedido pedido) {
        this.pedido = pedido;
        this.pedidoFinal = pedido;
    }
    public PedidoBuilder conComboEspecial(double precio){
        this.pedidoFinal = new ComboEspecial(this.pedidoFinal, precio);
        return this;
    }
    public PedidoBuilder conComboFamiliar(double precio){
        this.pedidoFinal = new ComboFamiliar(this.pedidoFinal, precio);
        return this;
    }
    public PedidoBuilder conComboBasico(double precio){
        this.pedidoFinal = new ComboBasico(this.pedidoFinal, precio);
        return this;
    }
    public PedidoBuilder conPorcionTomate(double precio){
        this.pedidoFinal = new PorcionTomate(this.pedidoFinal, precio);
        return this;
    }
    public PedidoBuilder conPorcionQueso(double precio){
        this.pedidoFinal = new PorcionQueso(this.pedidoFinal, precio);
        return this;
    }
    public PedidoBuilder conPorcionPapas(double precio){
        this.pedidoFinal = new PorcionPapas(this.pedidoFinal, precio);
        return this;
    }
    public PedidoBuilder conPorcionCarne(double precio){
        this.pedidoFinal = new PorcionCarne(this.pedidoFinal, precio);
        return this;
    }
    public IPedido build(){
        return this.pedidoFinal;
    }
}

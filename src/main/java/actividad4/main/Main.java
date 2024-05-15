package actividad4.main;

import actividad4.*;

public class Main {
    public static void main(String[] args) {
        //USANDO DECORATOR
//        var pedido1 = new ComboEspecial(
//                new PorcionPapas(
//                        new PorcionCarne(
//                                new Pedido()
//                                ,7)
//                        ,5)
//                ,15);
//        var pedido2 = new ComboFamiliar(
//                new PorcionCarne(
//                        new PorcionQueso(
//                                new Pedido()
//                                ,3)
//                        ,7)
//                ,25);
//        System.out.println("Pedido 1:");
//        System.out.println(pedido1.descripcion());
//        System.out.println("Precio: " + pedido1.precio());
//        System.out.println();
//        System.out.println("Pedido 2:");
//        System.out.println(pedido2.descripcion());
//        System.out.println("Precio: " + pedido2.precio());

        //USANDO BUILDER
        System.out.println("Pedido 1:");
        var builder1 = new PedidoBuilder(new Pedido());
        builder1.conComboEspecial(15).conPorcionPapas(5).conPorcionCarne(7);
        System.out.println(builder1.build().descripcion());
        System.out.println(builder1.build().precio());
        System.out.println();
        System.out.println("Pedido 2:");
        var builder2 = new PedidoBuilder(new Pedido());
        builder2.conComboFamiliar(25).conPorcionCarne(7).conPorcionQueso(3);
        System.out.println(builder2.build().descripcion());
        System.out.println(builder2.build().precio());
        System.out.println();
    }
}

package actividad1;

public class MotorEconomico implements Motor{
    @Override
    public void arrancar() {
        System.out.println("Acción: arrancar motor económico");
    }

    @Override
    public void acelerar() {
        System.out.println("Acción: acelerar motor económico");
    }

    @Override
    public void apagar() {
        System.out.println("Acción: apagar motor económico");
    }
}

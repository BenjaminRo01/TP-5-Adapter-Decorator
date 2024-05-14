package actividad1;

public class MotorComun implements Motor{

    @Override
    public void arrancar() {
        System.out.println("Acción: arrancar motor");
    }

    @Override
    public void acelerar() {
        System.out.println("Acción: acelerar motor");
    }

    @Override
    public void apagar() {
        System.out.println("Acción: apagar motor");
    }
}

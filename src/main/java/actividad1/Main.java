package actividad1;


public class Main {
    public static void main(String[] args) {
        var motorElectrico = new MotorElectricoAdapter(new MotorElectrico());
        var motorComun = new MotorComun();
        var motorEco = new MotorEconomico();

        motorElectrico.arrancar();
        motorElectrico.acelerar();
        motorElectrico.apagar();
        System.out.println("");

        motorComun.arrancar();
        motorComun.acelerar();
        motorComun.apagar();
        System.out.println("");

        motorEco.arrancar();
        motorEco.acelerar();
        motorEco.apagar();
        System.out.println("");
    }
}

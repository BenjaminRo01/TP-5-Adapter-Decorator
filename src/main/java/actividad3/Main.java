package actividad3;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        var file = new File("C:/Registros/Reportes.txt");
        IReport reporte = new ReportSobreescrito(new Report("Reporte: TP5-Decorator"));
        reporte.export(file);
    }
}

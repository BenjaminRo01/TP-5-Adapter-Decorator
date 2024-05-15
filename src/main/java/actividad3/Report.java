package actividad3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Report implements IReport{
    private String reporte;
    public Report(String reporte) {
        this.reporte = reporte;
    }
    public void export(File file) {
        if (file == null) {
            throw new IllegalArgumentException(
                    "File es NULL; no puedo exportar..."
            );
        }
        // Exportar el reporte a un archivo.
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(reporte);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

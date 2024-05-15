package actividad3;

import java.io.File;

public class ReportNoSobreescrito implements IReport{
    private IReport report;

    public ReportNoSobreescrito(IReport report) {
        this.report = report;
    }

    @Override
    public void export(File file) {
        if (file.exists()) {
            throw new IllegalArgumentException(
                    "El archivo ya existe..."
            );
        }
        this.report.export(file);
    }
}

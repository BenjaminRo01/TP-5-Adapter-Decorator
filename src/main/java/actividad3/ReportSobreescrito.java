package actividad3;

import java.io.File;

public class ReportSobreescrito implements IReport{
    private IReport report;
    public ReportSobreescrito(IReport report) {
        this.report = report;
    }
    public void export(File file){
        this.report.export(file);
    }
}

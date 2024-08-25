package OCP.Example3.BetterCode;

public class PDFReportGenerator implements ReportGenerator{
    @Override
    public void generateReport() {
        System.out.println("generated report in pdf format");
    }
}

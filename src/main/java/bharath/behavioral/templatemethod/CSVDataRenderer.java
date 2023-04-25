package bharath.behavioral.templatemethod;

public class CSVDataRenderer extends DataRenderer {
    @Override
    public String readData() {
        return "CSV data";
    }

    @Override
    public String processData(String data) {
        return "Processed " + data;
    }
}

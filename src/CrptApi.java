
import java.net.http.HttpClient;
import java.util.concurrent.TimeUnit;

public class CrptApi {

    private final TimeUnit timeUnit;
    private final int requestLimit;

    public CrptApi(TimeUnit timeUnit, int requestLimit) {
        this.timeUnit = timeUnit;
        this.requestLimit = requestLimit;
    }

    public void createDocument(Document document, String signature) {
        HttpClient httpClient;
    }

    class Document {
        private DocumentFormat format;
        private String productDocument;
        private String productGroup;
    }

    enum DocumentFormat {
        MANUAL,
        XML,
        CSV
    }
}
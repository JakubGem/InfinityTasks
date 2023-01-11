package Task3;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDateTime;

public class Document implements Serializable {

    private static final long serialVersionUID = 3L;

    protected final String IssuerOfTheDocument;
    protected final String RecipientOfTheDocument;
    protected final LocalDateTime DocumentDate;
    protected final int DocumentNumber;

    public Document(String issuerOfTheDocument, String recipientOfTheDocument, LocalDateTime documentDate, int documentNumber) {
        IssuerOfTheDocument = issuerOfTheDocument;
        RecipientOfTheDocument = recipientOfTheDocument;
        DocumentDate = documentDate;
        DocumentNumber = documentNumber;
    }

    public String getIssuerOfTheDocument() {

        return IssuerOfTheDocument;
    }

    public String getRecipientOfTheDocument() {
        return RecipientOfTheDocument;
    }

    public LocalDateTime getDocumentDate() {
        return DocumentDate;
    }

    public int getDocumentNumber() {
        return DocumentNumber;
    }

    public String getRabat(){
        return "0%";
    }

    @Override
    public String toString() {
        return "IssuerOfTheDocument='" + IssuerOfTheDocument + '\'' +
                ", RecipientOfTheDocument='" + RecipientOfTheDocument + '\'' +
                ", DocumentDate=" + DocumentDate +
                ", DocumentNumber=" + DocumentNumber;
    }

    public void writeToFile(Object object, String fileName){
        try {
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream objectStream = new ObjectOutputStream(file);
            objectStream.writeObject(object.toString());
            objectStream.close();

        } catch (Exception ex) {
            System.out.println(
                    "Error in '"
                            + fileName + "'");
        }
    }
}

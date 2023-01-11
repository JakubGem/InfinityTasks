package Task3;

import java.time.LocalDateTime;

public class Invoice extends Document {
    private final String InvoiceType;
    private static final long serialVersionUID = 1L;

    public Invoice(String issuerOfTheDocument, String recipientOfTheDocument, LocalDateTime documentDate, int documentNumber, String invoiceType) {
        super(issuerOfTheDocument, recipientOfTheDocument, documentDate, documentNumber);
        InvoiceType = invoiceType;
    }

    public String getInvoiceType() {
        return InvoiceType;
    }

    public String getRabat(){
        if(getDocumentNumber() > 15 && InvoiceType.equals("VAT")){
            return "15%";
        }else if(getDocumentNumber() < 15 && InvoiceType.equals("VAT RR")){
            return "44%";
        }else{
            return "0%";
        }
    }

    @Override
    public String toString() {
        return
                "IssuerOfTheDocument='" + IssuerOfTheDocument + '\'' +
                ", RecipientOfTheDocument='" + RecipientOfTheDocument + '\'' +
                ", DocumentDate=" + DocumentDate +
                ", DocumentNumber=" + DocumentNumber +
                ", InvoiceType='" + InvoiceType + '\'';
    }
}

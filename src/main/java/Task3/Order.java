package Task3;

import java.time.LocalDateTime;

public class Order extends Document {
    private final LocalDateTime RealizationDate;
    private static final long serialVersionUID = 2L;

    public Order(LocalDateTime realizationDate, String issuerOfTheDocument, String recipientOfTheDocument, LocalDateTime documentDate, int documentNumber) {
        super(issuerOfTheDocument, recipientOfTheDocument, documentDate, documentNumber);
        RealizationDate = realizationDate;
    }

    public LocalDateTime getRealizationDate() {
        return RealizationDate;
    }

    public String getRabat(){
        if(getRecipientOfTheDocument().length() > 10){
            return "10%";
        }else if(getRecipientOfTheDocument().equals("Kazik sp.zo.o")){
            return "100%";
        }else{
            return "5%";
        }
    }

    @Override
    public String toString() {
        return
                "IssuerOfTheDocument='" + IssuerOfTheDocument + '\'' +
                ", RecipientOfTheDocument='" + RecipientOfTheDocument + '\'' +
                ", DocumentDate=" + DocumentDate +
                ", DocumentNumber=" + DocumentNumber +
                ", RealizationDate=" + RealizationDate;
    }
}

package Task4;

import Task3.Invoice;

public interface InvoiceRepository {
    Invoice find(String invoiceNumber);
}

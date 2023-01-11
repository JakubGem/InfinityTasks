package Task4;


import Task3.Invoice;

public class InvoiceService {
    private InvoiceRepository repository;

    public InvoiceService(InvoiceRepository repository) {
        this.repository = repository;
    }

    public Invoice getInvoice(String invoiceNumber) {
        return repository.find(invoiceNumber);
    }
}

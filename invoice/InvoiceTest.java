public class InvoiceTest {
	public static void main(String[] args) {
		Invoice i = new Invoice("I001", "Lápis", 10, 1.5);
		Invoice i2 = new Invoice("I002", "Borracha", 5, 1.2);
		
		System.out.printf("Número: %s, Descrição: %s, Qtd: %d, Preço unit: %.2f\n", i.getNumber(), 
			i.getDescription(), i.getQuantity(), i.getPrice());
		System.out.printf("Total: %.2f\n", i.getInvoiceAmount());
		System.out.printf("Número: %s, Descrição: %s, Qtd: %d, Preço unit: %.2f\n", i2.getNumber(), 
			i2.getDescription(), i2.getQuantity(), i2.getPrice());
		System.out.printf("Total: %.2f\n", i2.getInvoiceAmount());
		
		i.setPrice(-1);
		System.out.printf("Número: %s, Descrição: %s, Qtd: %d, Preço unit: %.2f\n", i.getNumber(), 
			i.getDescription(), i.getQuantity(), i.getPrice());
			
		i2.setQuantity(-10);
		System.out.printf("Número: %s, Descrição: %s, Qtd: %d, Preço unit: %.2f\n", i2.getNumber(), 
			i2.getDescription(), i2.getQuantity(), i2.getPrice());
			
	}
}
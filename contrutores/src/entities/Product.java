/*Incluindo Contruto*/


package entities;

//Atributos
public class Product {
	public String name;
	public double price;
	public int quantity;

/*Contrutor Padra	
	public Product() {  // se queiser usar o Contrutor padr�o basta apenas declar manualmente e chamalo no programa
		
	} */
	
/*Construtores(coloca sempre depois do atributos antes dos metados)*/
	public Product(String name, double price, int quantity) { // dentro dos parentes vai a declara�ao, pode ser o mesmo do atibutos ou n�o, mas por padra sim
		this.name  = name;
		this.price = price;
		this.quantity = quantity;
	}
/*Criando segundo contrutor (Sobre carga)*/	
	public Product(String name, double prece) { //
		this.name = name;
		this.price = price;
		
		/*n�o precisa colocar quantidade, pois o mesmo inicia com valor zero.*/
		
	}
	
	
//Metodo
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " 
				+ String.format("%.2f", price) 
				+ ", " + quantity 
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
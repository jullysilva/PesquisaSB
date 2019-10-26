import java.util.Scanner;

public class Supermercado {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int code;
		
		ListaProdutos lista = new ListaProdutos();
		Produto produto;
		
		produto = new Produto(5, "Batata", 1.50);
		lista.inserir(produto);
		produto = new Produto(1, "Mandioca", 4.50);
		lista.inserir(produto);
		produto = new Produto(7, "jil�", 3.50);
		lista.inserir(produto);
		produto = new Produto(4, "Jabuticaba", 8.50);
		lista.inserir(produto);
		produto = new Produto(3, "Caj�", 8.50);
		lista.inserir(produto);
		produto = new Produto(2, "Jabuti", 8.50);
		lista.inserir(produto);
		produto = new Produto(6, "Jaca", 8.50);
		lista.inserir(produto);

		lista.imprimir();
		
		System.out.print("\nDigite o c�digo do produto: ");
		code = entrada.nextInt();
		produto = lista.localizar(code, 0, lista.quant);
		if(produto != null)
			System.out.print("C�digo: " + produto.getId() + "; Produto: " + produto.getNome() + "; Pre�o: " + produto.getPre�o_uni() + " Total de compara��es: " + lista.cont);
		else
			System.out.print("N�o encontado ou n�o existe!");
		
		
	}
	
}

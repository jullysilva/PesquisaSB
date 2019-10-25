
public class ListaProdutos {

	public static final int TAM_MAX = 10;
	private Produto[] listaProduto = new Produto[TAM_MAX];
	public static int i;
	public int cont = 0;
	public static int quant = 0;

	public void inserir(Produto produto) {
		for(i = 0; i < TAM_MAX; i++) {
			if(listaProduto[i] == null) {
				listaProduto[i] = produto;
				break;
			}
		}
		quant++;
	}
	 
	public Produto localizar(int id, int inicio, int fim) {
		int meio = (inicio + fim)/2;
		if(inicio > fim)
			return null;
		if(id == listaProduto[meio].getId()) {
			cont++;	
			return listaProduto[meio];
		}
		else
			cont++;
		if(id > listaProduto[meio].getId())
			return localizar(id, meio+1, fim);
		if(id < listaProduto[meio].getId())
			return localizar(id, inicio, meio-1);
		return null;
	}
	
	public void ordenar() {
		Produto aux;
		
		for(i=0;i<quant;i++) {
			if(listaProduto[i].getId() > listaProduto[i+1].getId()) {
				aux = listaj    Produto[i+1];
				listaProduto[i+1] = listaProduto[i];
				listaProduto[i] = aux;
			}
		}
	}
	
	public void imprimir() {
		
		for(i = 0; i < TAM_MAX; i++) {
			System.out.print("Produto: " + listaProduto[i].getNome() + "; Preço: " + listaProduto[i].getPreço_uni() + "\n");
			if(listaProduto[i+1] == null)
				break;
		}
		System.out.print(listaProduto.length);
	}
}






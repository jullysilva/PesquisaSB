
public class Produto {
	
	private int id;
	private String nome;
	private double pre�o_uni;
	
	public Produto() {
		this.id = 0;
		this.nome = " ";
		this.pre�o_uni = 0.0;
	}
	
	public Produto(int id, String nome, double preco) {
		this.id = id;
		this.nome = nome;
		this.pre�o_uni = preco;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPre�o_uni() {
		return pre�o_uni;
	}
	public void setPre�o_uni(double pre�o_uni) {
		this.pre�o_uni = pre�o_uni;
	}
	
	
	
}

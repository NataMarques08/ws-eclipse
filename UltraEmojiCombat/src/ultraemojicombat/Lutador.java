package ultraemojicombat;



public class Lutador {
	// Atributos
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	// Métodos públicos
	public void apresentar() {
		System.out.println("-------------------------------------------------------------");
		System.out.println("CHEGOU A HORA! Apresentamos o lutador "+this.getNome());
		System.out.println("Diretamente de "+this.getNacionalidade());
		System.out.println("Com "+this.getIdade()+" de idade e "+this.getAltura()+" de altura");
		System.out.println("Pesando "+this.getPeso()+" KG");
		System.out.println(this.getVitorias()+" Vitorias "+this.getDerrotas()+" Derrotas"+" e "+this.getEmpates()+" empates");
	}
	public void status() {
		System.out.println(this.getNome()+" e um peso "+this.getCategoriaString());
		System.out.println("Ganhou "+this.getVitorias()+" vezes");
		System.out.println("Perdeu "+this.getDerrotas()+" vezes");
		System.out.println("Empatou "+this.getEmpates()+" vezes");
	}
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	public void empatarLuta() {
		this.setEmpates(this.getDerrotas() + 1);
	}
	// Métodos especiais
	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias,int derrotas, int empates) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoriaString();
	}
	public String getCategoriaString() {
		return categoria;
	}
	public void setCategoriaString() {
		if(this.peso < 52.2) {
			this.categoria = "Invalido";
		}else if(this.peso <= 72.3) {
			this.categoria = "Leve";
		}else if(this.peso <= 83.9) {
			this.categoria = "Medio";
		}else if(this.peso <= 120.2) {
			this.categoria = "Pesado";
		}else {
			this.categoria = "Invalido";
		}
		
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
}

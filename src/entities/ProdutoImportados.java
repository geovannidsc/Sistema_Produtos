package entities;

public final class ProdutoImportados extends Produto {

	private double taxaAlfandega;
	
	
	public ProdutoImportados() {
		
	}


	public ProdutoImportados(String nome, double preco, double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}



	public double getTaxaAlfandega() {
		return taxaAlfandega;
	}


	public void setTaxaAlfandega(double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}


	@Override
	public void etiquetar() {
		
		System.out.println(this.getNome()+" R$"+precoTotal()+ "(Taxa de Importação: "+taxaAlfandega);
		
	}
	
	public double precoTotal() {
		
		this.setPreco(this.getPreco()+this.taxaAlfandega);
		
		return this.getPreco();
	}
	
	
	
	
	
}

package entities;

import java.util.Date;

public final class ProdutoUsado extends Produto{

	private Date dataDeFabricacao;
	
	
	public ProdutoUsado() {
		
	}


	public ProdutoUsado(String nome, double preco, Date dataDeFabricacao) {
		super(nome, preco);
		this.dataDeFabricacao = dataDeFabricacao;
	}


	public Date getDataDeFabricacao() {
		return dataDeFabricacao;
	}


	public void setDataDeFabricacao(Date dataDeFabricacao) {
		this.dataDeFabricacao = dataDeFabricacao;
	}


	@Override
	public void etiquetar() {
		
		System.out.println(this.getNome()+" (used)"+ " R$"+this.getPreco()+ " (Fabricação: "+dataDeFabricacao);
		
	}
	
	
	
	
	
	
}

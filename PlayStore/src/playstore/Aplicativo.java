package playstore;

public class Aplicativo {
	static int cod_apk;
	static String nome_apk;
	static String categoria;
	
	public int getCod_apk() {
		return cod_apk;
	}
	public void setCod_apk(int cod_apk) {
		Aplicativo.cod_apk = cod_apk;
	}
	public String getNome_apk() {
		return nome_apk;
	}
	public void setNome_apk(String nome_apk) {
		this.settersOfApp(nome_apk);
		Aplicativo.nome_apk = nome_apk;
	}
	private void settersOfApp(String nome_apk2) {
		//estabelece o código e categoria à partir do nome
		this.setCategoria("ENTRETENIMENTO");
		this.setCod_apk(22222);
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		Aplicativo.categoria = categoria;
	}
}

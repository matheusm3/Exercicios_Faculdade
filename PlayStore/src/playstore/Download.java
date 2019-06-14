package playstore;

public class Download {
	
	Usuario usuario = new Usuario();
	Aplicativo aplicativo = new Aplicativo();
	
	int cod_apk = aplicativo.getCod_apk();
	int cod_usuario = usuario.getCod_usuario();
	
	public void apkJaBaixado(String nome_apk, boolean possui) {
		// busca na memória do dispositivo e atribui um booleano ao atributo possui
		this.executaDownload(nome_apk, possui);
	}
	
	public void executaDownload(String nome, boolean possui) {
		if (possui == false) {
			System.out.println("Fazendo download de ...");
		} else {
			System.out.println("Você já possui esse aplicativo.");
		}
	}
}

package playstore;

public class Download {
	
	Usuario usuario = new Usuario();
	Aplicativo aplicativo = new Aplicativo();
	
	int cod_apk = aplicativo.getCod_apk();
	int cod_usuario = usuario.getCod_usuario();
	boolean possui = false;
	
	public boolean apkJaBaixado(int cod_usuario, int cod_apk, boolean possui) {
		
		return possui;
	}
	public void executaDownload(boolean possui) {
		//baixa arquivo ou não
	}
}

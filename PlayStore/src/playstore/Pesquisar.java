package playstore;
import java.util.Scanner;

public class Pesquisar {
	Aplicativo app = new Aplicativo();
	static Scanner scan = new Scanner(System.in);
	FeedPagina fp = new FeedPagina();
		
	// input do nome do app
	public void pesquisaApp() {
		System.out.println("Digite o nome do aplicativo");
		String nome_app = scan.nextLine();
		app.setNome_apk(nome_app);
		FeedPagina.listarApk(nome_app);
	}

}

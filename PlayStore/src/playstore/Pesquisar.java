package playstore;
import java.util.Scanner;

public class Pesquisar {
	Aplicativo app = new Aplicativo();
	static Scanner scan = new Scanner(System.in);
	FeedPagina fp = new FeedPagina();
		
	public void pesquisaApp() {
		System.out.println("Digite o nome do aplicativo");
		String nome_app = scan.nextLine();
		FeedPagina.listarApk(nome_app);
	}

}

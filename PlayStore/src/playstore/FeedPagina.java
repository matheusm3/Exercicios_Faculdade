package playstore;
import java.util.Scanner;

public class FeedPagina extends Aplicativo {
	static Scanner scan = new Scanner(System.in);
	static Pesquisar pesquisar = new Pesquisar();
	static Download download = new Download();
		
	public static void pesquisa() {
		pesquisar.pesquisaApp();
	}
	
	public static void listarApk(String nome_apk) {
		System.out.println("Lista de aplicativos:");
		System.out.println(" ");
		System.out.println(nome_apk);
		System.out.println(" ");
		System.out.println("Deseja baixar? (1 - sim, 2 - não)");
		int escolha = scan.nextInt();
		boolean possui = true;
		
		switch(escolha) {
		case 1:
			download.apkJaBaixado(nome_apk, possui);
		case 2:
			System.out.println("Processo finalizado.");
		}		
	}
	
	public static void separarCategoria(String categoria_apk) {
		// segmenta os aplicativos de acordo com sua respectiva categoria
	}
}

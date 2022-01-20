package br.com.dio.java.io.IOCharacter;

import java.io.*;

public class Exercicio3IOCaracter {

	public static void copiarArquivo() throws IOException {
		File f = new File("/home/ozeias/Documents/recomendacoes.txt");
		String nomeArquivo = f.getName();

//		Reader r = new FileReader(nomeArquivo);
//		BufferedReader br = new BufferedReader(r);

		BufferedReader br = new BufferedReader(new FileReader(nomeArquivo));
		String line = br.readLine();

		String nomeArquivoCopia = nomeArquivo.substring(0, nomeArquivo.indexOf(".")).concat("-copy.txt");

		File arquivocopy = new File(nomeArquivoCopia);

		BufferedWriter bw = new BufferedWriter(new FileWriter(arquivocopy.getName()));

		do {
			bw.write(line);
			bw.newLine();
			bw.flush();
			line = br.readLine();
		} while (!(line == null));

		PrintWriter pw = new PrintWriter(System.out);

		pw.printf("Arquivo \"%s\" copiado com sucesso! Tamanho do arquivo ' %d' bytes.\n", f.getName(), f.length());
		pw.printf("Arquivo \"%s\" criado com sucesso ! Tamanho do arquivo ' %d' bytes.\n", arquivocopy.getName(),
				arquivocopy.length());

		pw.println("Recomende 3 livros");
		pw.flush();

		adicionarInfoNoArquivo(arquivocopy.getName());

		pw.printf("Ok! Tudo certo. Tamanho do arquivo %d bytes", arquivocopy.length());

		br.close();
		bw.close();
		pw.close();
	}

	public static void adicionarInfoNoArquivo(String arquivo) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();

		BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true));

		do {
			bw.write(line);
			bw.newLine();
			line = br.readLine();
		} while (!line.equalsIgnoreCase("fim"));

		br.close();
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		copiarArquivo();
	}
}

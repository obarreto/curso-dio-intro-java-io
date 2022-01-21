package br.com.dio.java.io.IOCharacter;

import java.io.*;
import java.util.Scanner;

public class Exercicio2IOCaracter {

	public static void lerTecladoEscreverDocumento() throws IOException {

		PrintWriter pw = new PrintWriter(System.out);
		pw.println("Digite 3 recomendações de filmes: ");
		pw.flush();

		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();

		File f = new File("/home/ozeias/Documents/recomendacoes.txt");

		BufferedWriter bw = new BufferedWriter(new FileWriter(f.getPath()));

		do {
			bw.write(line);
			bw.newLine();
			line = scan.nextLine();
		} while (!line.equalsIgnoreCase("fim"));

		pw.printf("Arquivo \"%s\" foid criado com sucesso! ", f.getPath());
		pw.flush();
		scan.close();
		bw.close();

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		lerTecladoEscreverDocumento();
	}

}

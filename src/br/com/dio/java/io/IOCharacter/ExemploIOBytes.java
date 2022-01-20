package br.com.dio.java.io.IOCharacter;

import java.io.*;

public class ExemploIOBytes {
	public static void copiarArquivo() throws IOException {
		File f = new File("/home/ozeias/Documents/recomendacoes.txt");
		String nomeArquivo = f.getName();

		InputStream is = new FileInputStream(f.getName());
		BufferedInputStream bis = new BufferedInputStream(is);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

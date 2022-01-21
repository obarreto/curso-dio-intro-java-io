package br.com.dio.java.io.IOCharacter;

import java.io.*;

public class ExemploIOBytes {
	public static void copiarArquivo() throws IOException {
		File f = new File("/home/ozeias/Documents/recomendacoes.txt");
		String nomeArquivo = f.getName();

		InputStream is = new FileInputStream(f.getName());
		BufferedInputStream bis = new BufferedInputStream(is);
		
		String nomeArquivoCopia = nomeArquivo.substring(0, nomeArquivo.indexOf("-")).concat(".copy2.txt");
		File arqCopia = new File(nomeArquivoCopia);
		
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(nomeArquivoCopia));
		
		int line = 0;
		while((line = bis.read()) != -1) {
			bos.write((char) line);
			bos.flush();
		}
		
		bis.close();
		bos.close();
		
		PrintStream ps = new PrintStream(System.out);
		ps.printf("Arquivo \"%s\" copiado com sucesso! Tamanho do arquivo ' %d' bytes. No diretorio ' %s'\n", f.getName(), f.length(), f.getPath());
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		copiarArquivo();

	}

}

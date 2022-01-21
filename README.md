# Stream Caracteres

* A plataforma Java armazena caractere segundo padrão UNICODE

* Unicode é uma codificação para caracteres textuais capaz de representar caracteres de muitos idiomas diferentes de todo o mundo
* Cada caractere é representado por um ponto de código UNICODE (code points)

* As classes mães READER e WRITER (classe abstratas) representam um fluxo de caracteres. Como são classes abstratas, precisam das classes filhas (classes concretas) para ler e gravar dados.

____



# Fluxos Predefinos

- Entrada de dados através do teclado: System.in / Scanner
- Saída de dados através do console: System.out/PrintWriter



Classe System (java.lang.System) encapsula vários aspectos do ambiente de tempo de execução e tem três atributos **public**, **final** e **static** que são associados aos arquivos padrão de um sistema operacional: 

* **System.in**: objeto InputStream para a entrada padrão (teclado)
* **System.out**: objeto PrintStream para a saída padrão (console)
* **System.err**: objeto PrinStream para saída padrão de erros (console)

____



# java.io.File

* File é classe responsável por representar arquivos diretórios do seu sistema de arquivos.

* Esta classe pode fornecer informações ítei addim como criar umnovo arquivo, tamanho do arquivo, caminho absoluto, espaço livre em disco ou ainda excluí-lo.

  

```java
public class ExemploFile{
    public static void main(String[] args){
        File f = new File("dica-para-ler-e-escrever-arquivo-java-IO.txt");
        System.out.println("Nome do arquivo: " + f.getName());
        System.out.println("Caminho: " + f.getPath());
        System.out.println("Caminho Absoluto: " + f.getAbsolutePath());
        System.out.println("Diretorio par: " + f.getParent());
        System.out.println(f.exists() ? "existe" : "não exite" );
        System.out.println(f.canWrite() ? "pode ser gravado" : "não pode ser gravado");
        System.out.println(f.canRead() ? "pode ser lido" : "não pode ser lido");
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date data = new Date(f.lastModified());
        System.out.println("Ultima modificação do arquivo: " + df.format(data));
        System.out.println("Tamanho do arquvi" + f.length() + "bytes");
    }
}
```



# Byte Stream

* Os programas usam fluxos de bytes para realizar a entrada e a saída de bytes de 8 bits.
* Usando este stream, você pode ler e armazenar máscaras, vídeos, áudios, imagens, objetos compilados etc.
* Todas as classes de fluxo de bytes descendem de ImputStram e OutPutStream.


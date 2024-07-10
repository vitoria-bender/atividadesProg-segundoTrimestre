package aula22.exemploArquivos;

import java.io.*;

public class Lendo {
        public static void main(String[] args) {
            File caminho = new File("C:\\Users\\vitor\\OneDrive\\area\\prog");
            Pessoa p1;
            File arquivo = new File(caminho, "dadosPessoa.db");
            try {
                ObjectInputStream objLeitura = new ObjectInputStream(new FileInputStream(arquivo.getAbsolutePath()));
                p1 = (Pessoa) objLeitura.readObject();
                System.out.println(p1);
            }
            catch(FileNotFoundException a){
                System.out.println("arquivo não existe!");
            }
            catch(IOException b){
                System.out.println("erro ao ler o arquivo!");
            }
            catch (ClassNotFoundException c){
                System.out.println("classe não encontrada!");
            }
    }
}

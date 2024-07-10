package aula22.exemploArquivos;

import javax.imageio.IIOException;
import java.io.*;

public class Escrevendo {
    public static void main(String[] args) {
        File caminho = new File("C:\\Users\\vitor\\OneDrive\\area\\prog");
        if(caminho.exists()){
            System.out.println("o caminho existe");
        }
        else{
            System.out.println("o caminho não existe, tentando criar");
            caminho.mkdirs();
        }
        Pessoa p1 = new Pessoa();
        p1.setNome("Jonas");
        p1.setSobrenome("Silva");
        File arquivo = new File(caminho, "dadosPessoa.db");
        try{
            ObjectOutputStream objEscrita = new ObjectOutputStream(new FileOutputStream(arquivo.getAbsolutePath()));
            objEscrita.writeObject(p1);
            objEscrita.close();
        }
        catch (FileNotFoundException a){
            System.out.println("Erro ao ler o arquivo!");
        }
        catch (IOException b){
            System.out.println("Erro ao gravar as informações!");
        }
    }
}

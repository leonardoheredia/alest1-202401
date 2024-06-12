package aula27_abp_atividadepratica;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedHashMap;

public class AppFrutas {
    public static void main(String[] args) {
        String localDoArquivo = "C:\\TEMP\\frutas.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(localDoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + localDoArquivo);
        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}

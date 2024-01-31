import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArquivoLeituraDemo {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("exemplo.txt"));
            String linha;

            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException ex) {
                System.out.println("Erro ao fechar o arquivo: " + ex.getMessage());
            }
        }
    }
}

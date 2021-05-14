
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class EntradaSaidaCPF {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linha = br.readLine();
        for (int i = 0; i <= linha.length() - 1; i++) {
            if ((linha.substring(i, i+1).contains(".")) || (linha.substring(i, i+1).contains("-"))) {
                System.out.println("");
            } else {
                System.out.print(linha.substring(i, i + 1));
            }
        }
    }
}
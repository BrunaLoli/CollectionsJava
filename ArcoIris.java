import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArcoIris {
    public static void main(String[] args){
      
        Set<String> cores = new HashSet<>();
        cores.add("Violeta");
        cores.add("Anil");
        cores.add("Azul");
        cores.add("Verde");
        cores.add("Amarelo");
        cores.add("Laranja");
        cores.add("Vermelho");

        System.out.println(cores);

        for(String CoresArcoIris : cores){
            System.out.println("Cores Arco Iris: " + CoresArcoIris);
             }

        System.out.println("Quantidade de cores: " + cores.size());

        
        Set<String> coresOrdem = new TreeSet<>(cores);
        System.out.println("Ordem alfabética: " +coresOrdem);

        System.out.println("Exiba as cores na ordem inversa da que foi informada ");
        List<String> coresInverso = new ArrayList<>(cores);
        Collections.reverse(coresInverso);
        System.out.println(coresInverso);

        System.out.println("Limpe o conjunto: ");
        cores.clear();

        System.out.println("Confira se o conjunto está vazio: " + cores.isEmpty());
        
        }
        
         }


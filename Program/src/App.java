import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        
        List <String>list = new ArrayList<>();

        list.add("Maria");
        list.add("Matheus");
        list.add("Marlom");
        list.add("Marina");
        list.add("Malu");

        list.add(2,"Maco");

        System.out.println("Index of Matheus: "+ list.indexOf("Matheus"));
        

        for (String x: list){
            System.out.println(x);
        }
        System.out.println("-----------------------");

        list.remove("Marina");
        list.removeIf(x-> x.charAt(2)== 'r'); // ISSO E UMA FUNÇÃO LAMBDA

        System.out.println("-----------------------");
        System.out.println("Tirando todos aquelas que o index 2 é R");
        for (String x: list){
            System.out.println(x);
        }
        System.out.println("-----------------------");
        System.out.println("Index of Jorge: "+ list.indexOf("Jorge")); // quando nao encontra o index retorna -1

        System.out.println("-----------------------");
        List<String> result = list.stream().filter(x-> x.charAt(2) == 't').collect(Collectors.toList());
        for (String x: result){
            System.out.println(x);
        }
        System.out.println("-----------------------");
        String name = list.stream().filter(x-> x.charAt(2) == 't').findFirst().orElse(null);
        System.out.println(name);
    }
}

package testeJUnit;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class ListaPessoasJunitTest {

    @Test
    public void imprimeMulheres() {
        List<Map<String, String>> pessoas = Arrays.asList(
                Map.of("nome", "Ana", "genero", "Feminino"),
                Map.of("nome", "Maria", "genero", "Feminino"),
                Map.of("nome", "Carlos", "genero", "Masculino"),
                Map.of("nome", "Carol", "genero", "Feminino")
        );

        List<Map<String, String>> mulheresList = pessoas.stream()
                .filter(p -> p.get("genero").equalsIgnoreCase("Feminino"))
                .collect(Collectors.toList());

        Assert.assertEquals(3, mulheresList.size());
        Assert.assertEquals("Ana", mulheresList.get(0).get("nome"));
        Assert.assertEquals("Maria", mulheresList.get(1).get("nome"));
        Assert.assertEquals("Carol", mulheresList.get(2).get("nome"));
    }
}
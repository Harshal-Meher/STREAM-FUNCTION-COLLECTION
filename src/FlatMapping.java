import java.lang.reflect.Array;import java.util.Arrays;import java.util.List;import java.util.stream.Collectors;public class FlatMapping {    public static void main(String[] args) {        List<List<String>> names = Arrays.asList(          Arrays.asList("Harshal","Roshan","Jay"),          Arrays.asList("Om","Jay","Akkki")        );     List<String> res = names.stream().collect(Collectors.flatMapping(List::stream , Collectors.toList()));     System.out.println("FlatMapping : "+res);    }}
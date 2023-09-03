public class App {
    public static void main(String[] args) throws Exception {
        int nota = 9;

        String resultado = nota >= 7 ? "Aprovado" : nota < 7 && nota > 5 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}

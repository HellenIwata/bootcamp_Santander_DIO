public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println ("Olá, Mundo!"); // Saída: Olá, Mundo!

        String primeiroNome = "Hellen";
        String segundoNome = "Iwata";
        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}

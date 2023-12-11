public class OperadoresAritmeticos {

    public static void main(String[] args) {
        int minhaIdade = 21;
        int suaIdade = 27;

        // Adição
        int totalIdades = minhaIdade + suaIdade + 100;
        System.out.println("Soma das iades: " + totalIdades);

        // Subtração
        int diferencaIdades = minhaIdade - suaIdade;
        System.out.println("Diferença das idades: " + diferencaIdades);

        // Multiplicação
        int dobroDaIdade = 2 * minhaIdade;
        System.out.println("Dobro da sua idade: " + dobroDaIdade);

        // Divisão
        int metadeDaIdade = minhaIdade / 2;
        System.out.println("Metade da sua idade: " + metadeDaIdade);

        // Módulo
        int restoDaDivisao = 7 % 2;
        System.out.println("Resto da divisão (módulo): " + restoDaDivisao);
    }
    
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022; // variável sempre começa com letra minúscula mas as próximas são maisuculas - camelCase, classe é com maiúscula
        System.out.println("Ano de lançamento:" + anoDeLancamento); // Concatenação
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";
        double media = (9.8 + 6.3 + 8.0) / 3;

        if ( anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os cliente est]ao curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if ( incluidoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }



        System.out.println(media);
        String sinopse;
        sinopse = """
        Filme de aventura com galã dos anos 80
        Muito bom!
        Ano de lançamento
        """ + anoDeLancamento;
        System.out.println(sinopse);


        int classificacao = (int) (media / 2);
        System.out.println(classificacao);
        
    }
}
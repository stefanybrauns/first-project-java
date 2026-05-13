public class Temperatura {
    public static void main(String[] args) {
        double temperaturaCelsius = 36;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
        System.out.println(temperaturaFahrenheit);
        String mensagem = String.format("A temperatura em fahrenheit é de %f, sendo de Celsius equivalente a %f", temperaturaFahrenheit, temperaturaCelsius);
        System.out.println(mensagem);

        System.out.println("A temperatura em fahrenheit é de " + temperaturaFahrenheit + "e em Celsius é " + temperaturaCelsius);

        int novaTemperatura =  (int) (temperaturaFahrenheit);
        String mensagemNovaTemperatura = """
                A temperatura em fahrenheit é de %d,
                e de Celsius era de %f
                """.formatted(novaTemperatura, temperaturaCelsius);
        System.out.println(mensagemNovaTemperatura);
    }
}

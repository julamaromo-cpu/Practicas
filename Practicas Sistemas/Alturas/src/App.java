public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Calculo de la altura en pulgadas y pies");
        double centimetros = 100;
        double pulgadas = centimetros / 2.54;
        double pies = pulgadas / 12;
        System.out.println("La aluta en pulgadas es: " + pulgadas);
        System.out.println("La aluta en pies es: " + pies);
    }
}

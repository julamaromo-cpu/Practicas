public class App {
    public static void main(String[] args) throws Exception {
        System.err.println("Es para calcular el interes total");
        float importe = 1000f;
        System.err.println("El deposito tiene un valor de" + importe);
        int años = 20;
        System.err.println("Los años tienen un valor de " + años);
        float interes = 20f;
        System.err.println("Los intereses tiene un valor de " + interes);
        System.err.println("Calcular el interes de un deposito bancario");
        float total = (importe * años * interes) / 100;
        System.err.println("El total del Deposito es" + total);

}
}

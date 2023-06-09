public class Main {
    public static void main(String[] args) {
        Serie serie = new Serie();

        for (int i = 0; i <= 12; i++) { //i <= *Posicion*
            long fibonacci = serie.getFibonacci(i);
            System.out.println("Fibonacci(" + i + "): " + fibonacci);
        }

        System.out.println("\nValores almacenados en el HashMap:\n" + serie.getValorList());
    }
}
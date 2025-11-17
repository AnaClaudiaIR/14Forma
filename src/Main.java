public class Main{
    public static void main(String[] args){
        Circulo circulo = new Circulo(4.67);
        System.out.println(circulo.mostrarDescripcion());

        System.out.println("------------------");

        Rectangulo rectangulo = new Rectangulo(3,2.67);
        System.out.println(rectangulo.mostrarDescripcion());
    }
}

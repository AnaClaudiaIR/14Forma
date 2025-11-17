public class Rectangulo extends Forma{
    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calcularArea(){
        double area = lado1 * lado2;
        return area;
    }

    @Override
    public String mostrarDescripcion(){
        return "El área del rectángulo con lados " + this.lado1 + " y " + this.lado2 + " es: " + calcularArea();
    }
}

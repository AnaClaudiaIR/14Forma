public class Circulo extends Forma{
    private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    public double calcularArea(){
        double area = Math.PI * Math.pow(radio,2);
            return area;
    }

    @Override
    public String mostrarDescripcion(){
       return "El área del círculo con radio " + this.radio + " es: " + calcularArea();
    }
}

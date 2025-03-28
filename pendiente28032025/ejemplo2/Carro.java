package ejemplo2;

public class Carro {
    private String marca;
    private String modelo;
    private int anio;


    public Carro(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }


    public String mostrarDetalles() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Año: " + anio;
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        System.out.println(carro1.mostrarDetalles());

        carro1.setAnio(2022); // Modificar el año usando el setter
        System.out.println("Año actualizado: " + carro1.getAnio());
    }
}

package Lista1;


    public class Exer1 {

    // Atributos privados
    private double altura;
    private double largura;

    // Construtor
    public Exer1(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    // Getters e Setters
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            throw new IllegalArgumentException("Altura inválida!");
        }
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura > 0) {
            this.largura = largura;
        } else {
            throw new IllegalArgumentException("Largura inválida!");
        }
    }

    // Método área
    public double calcularArea() {
        return altura * largura;
    }

    // Método perímetro
    public double calcularPerimetro() {
        return 2 * (altura + largura);
    }

    // toString
    @Override
    public String toString() {
        return "Altura: " + altura +
               ", Largura: " + largura +
               ", Área: " + calcularArea() +
               ", Perímetro: " + calcularPerimetro();
    }
}


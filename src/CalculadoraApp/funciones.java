package CalculadoraApp;
public class funciones {
    float n1;
    float n2;

    public funciones() {
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }
    public void setN2(float n2) {
        this.n2 = n2;
    }

    public float sumar() {
        return this.n1 + this.n2;
    }
    public float restar() {
        return this.n1 - this.n2;
    }
    public float multiplicar() {
        return this.n1 * this.n2;
    }
    public float dividir() {
        return this.n1 / this.n2;
    }


}

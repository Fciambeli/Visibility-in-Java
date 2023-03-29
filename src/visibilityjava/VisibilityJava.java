package visibilityjava;
public class VisibilityJava {
    public static void main(String[] args) {
        Canetac c1 = new Canetac();
        c1.modelo = "BIC cristal";
        c1.cor = "Azul";
        // c1.ponta = 0.5f this attribute is private, but you can change
        c1.carga = 80;
        /* c1.tampada = false; this attribute is private, but you can change
            the methods tampar() and destampar() in the class Canetac (both them are public)
        */
        c1.destampar();
        c1.status();
        c1.rabiscar();
    }
}

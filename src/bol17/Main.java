package bol17;

public class Main {

    public static void main(String[] args) {
        Avestruz avestruz = new Avestruz();
        avestruz.podeCaminar();
        Gato gato = new Gato();
        gato.podeCaminar();
        gato.podeNadar();
        Morcego morcego = new Morcego();
        morcego.podeCaminar();
        morcego.podeVoar();
        Papagaio papagaio = new Papagaio();
        papagaio.podeCaminar();
        papagaio.podeVoar();
        Tigre tigre = new Tigre();
        tigre.podeCaminar();
        tigre.podeNadar();
    }
}

package bol17;

public class Felino extends Mamifero implements IPodeNadar {

    @Override
    public void podeCaminar() {
        System.out.println("Os felinos poden camiñar");
    }
    @Override
    public void podeNadar() {
        System.out.println("Os felinos poden nadar");
    }
}

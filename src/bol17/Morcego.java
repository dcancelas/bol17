package bol17;

public class Morcego extends Mamifero implements IPodeVoar {

    @Override
    public void podeCaminar() {
        System.out.println("Os morcegos poden camiñar");
    }
    @Override
    public void podeVoar() {
        System.out.println("Os morcegos poden voar");
    }
}

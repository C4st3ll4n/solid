package LSP;

public class Quadrado extends Retangulo {

    @Override
    public void setAltura(Double altura) {
        super.setAltura(altura);
        super.setLargura(altura);
    }

    @Override
    public void setLargura(Double largura) {
        super.setLargura(largura);
        super.setAltura(largura);
    }
}

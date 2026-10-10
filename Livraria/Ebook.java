package Livraria;

public class Ebook extends Livro implements Promocional{
    //atributos e metodos omitidos

    private String watermark;

    public Ebook (Autor autor) {
        super(autor);
    }
    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.15) {
            return false;
        }

        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        return true;
    }
    public String getWatermark() {
        return watermark;
    }
    public void setWatermark(String watermark) {
        this.watermark = watermark;
    }
}

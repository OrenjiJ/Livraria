package Livraria;

public class RegrasDeDesconto {
    public static void main(String[] args) {
        Autor primeiroAutor = new Autor();
        primeiroAutor.setNome("Lucas Meira");

        Livro livro = new Livro(primeiroAutor);
        livro.setValor(59.90);

        System.out.println("Valor atual:" + livro.getValor());

        if (!livro.aplicaDescontodDe(0.1)){
            System.out.println("Desconto não pode ser maior do que 30%");
        }else {
            System.out.println("Valor do desdconto: " + livro.getValor());
        }
    }
}

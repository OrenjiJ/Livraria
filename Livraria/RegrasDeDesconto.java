package Livraria;

public class RegrasDeDesconto {
    public static void main(String[] args) {
        Autor primeiroAutor = new Autor();
        primeiroAutor.setNome("Lucas Meira");

        Livro livro = new LivroFisico(primeiroAutor);
        livro.setValor(59.90);

        System.out.println("Valor atual:" + livro.getValor());

        if (!livro.aplicaDescontoDe(0.1)) {
            System.out.println("Desconto não pode ser maior do que 30%");
        } else {
            System.out.println("Valor do desconto: " + livro.getValor());
        }
        Ebook ebook = new Ebook(primeiroAutor);
        ebook.setValor(29.90);

        if (!ebook.aplicaDescontoDe(0.3)){
            System.out.println("Desconto no ebook não pode ser maior que 15%");
        }else {
            System.out.println("Valor do ebook com desconto: " + ebook.getValor());
        }
    }
}

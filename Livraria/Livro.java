package Livraria;

public class Livro {
    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;

    void  mostrarDetalhes() {
        String mensagem = "Mostrandp detalhes do livro";
        System.out.println(mensagem);
        System.out.println(nome);
        System.out.println(valor);
        System.out.println(isbn);
        autor.mostrarDetalhes();
        System.out.println("---");
    }
    public void aplicaDescontoDe(Double porcentagem){
        this.valor -=this.valor * porcentagem;
    }
    boolean temAutor(){
        return this.autor !=null;
    }
}

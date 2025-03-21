public class Produto {
    private String preco;
    private String tamanho;
    private String marca;
    private String largura;
    private String nome;

    public Produto(){};

    public Produto(String nome, String preco, String marca, String tamanho, String largura) {

        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
        this.tamanho = tamanho;
        this.largura = largura;

    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLargura() {
        return largura;
    }

    public void setLargura(String largura) {
        this.largura = largura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    

}
public class Livro {

        private String titulo;
        private String autor;
        private int AnoPublicacao;
        private float preco;


        //Métodos gets and sets
        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor (String autor) {
            this.autor = autor;
        }

        public int getAnoPublicacao(){
            return AnoPublicacao;
        }

        public void setAnoPublicacao(int AnoPublicacao){
            this.AnoPublicacao = AnoPublicacao;
        }

        public float getPreco(){
            return preco;
        }

        public void setPreco(float preco){
            this.preco = preco;
        }


        //Método Imprimir

        public void imprimir(){
            System.out.println("Titulo = " + titulo);
            System.out.println("Autor = " + autor);
            System.out.println("Ano da Publicacao = " + AnoPublicacao);
            System.out.println("Preço = " + preco);
        }


}

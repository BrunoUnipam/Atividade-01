public class Principal {
    public static void main(String[] args) {
        ListaDupla<Produto> listaProdutos = new ListaDupla<>("Lista de Produtos");
        
        Produto produto1 = new Produto("Notebook Gamer", 2500.99);
        listaProdutos.addInicio(produto1);
        
     
        Produto produto2 = new Produto("Mouse Wireless", 89.90);
        listaProdutos.addFinal(produto2);
      


        Produto produto3 = new Produto("Teclado Mecânico", 299.50);
        listaProdutos.addIndice(1, produto3);
         listaProdutos.removeIndice(1);
          Produto produto4 = new Produto("Headset", 199.50);
         listaProdutos.addInicio(produto4);
         Produto produto5 = new Produto("Pendrive", 99.50);
         listaProdutos.addFinal(produto5);
        listaProdutos.imprimeLista();
      
    }
}
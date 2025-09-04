public class Main2 {
    public static void main(String[] args) {
        Fila<String> fila = new Fila<String>("Alunos");

        fila.addFinal("Bruno");
         fila.addFinal("Rafael");
          fila.addFinal("Maelle");
          fila.removerInicio();

          fila.addFinal("Marilucia");
          fila.addFinal("Rogerio");
 fila.removerInicio();
           fila.imprimeFila();
   }
    
}

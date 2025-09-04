public class Main {
    public static void main(String[] args) {
        Pilha<String> pilha = new Pilha<String>("Linguagens de programação");

        pilha.push(" Java ");
          pilha.push(" Python ");
            pilha.push(" Java Script ");
                pilha.pop();
            pilha.push(" React ");
          pilha.push(" C# ");
            

    pilha.imprimePilha();
        
 
    }
    
}
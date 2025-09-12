public class Main {
    public static void main(String[] args) {
        Pilha<String> pilha = new Pilha<String>("Linguagens de programação");

        pilha.push(" Java ");
          pilha.push(" Python ");
            pilha.push(" Java Script ");
            pilha.pop();
            pilha.push(" C# ");
            pilha.push(" ReactNav ");
             
            

    pilha.imprimePilha();
        
 
    }
    
}
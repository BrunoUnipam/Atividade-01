public class Pilha<T> {
    private No<T> topo;
    private String nomePilha;

    // Esses comentarios são meus mesmo kkkkk estou deixando registrado meus passos para entender oque estou fazendo //

//--------------------------------------------------------------------------------------------------------------------//
     public Pilha(){
       this("Pilha"); 
    }
//--------------------------------------------------------------------------------------------------------------------//
    public Pilha( String nomePilha){
        this.nomePilha = nomePilha;
        this.topo= null;
    }
//---------------------------------------------------------------------------------------------------------------------//
    public T peek(){
        if (topo==null) {
            System.out.println(" Lista Vazia "); 
            return null;
        }
        return topo.getDado();
    }
// Retorna o valor da lista 
//--------------------------------------------------------------------------------------------------------------------//
 public void push(T dado){
        No<T> novoNo = new No<T>(dado); 
            novoNo.setNextNo(topo);
            topo = novoNo;
        }
 // Cria um novo No, o nextNo do novoNo aponta pra o valor do topo em seguida o topo passa a ser o novoNo.
//--------------------------------------------------------------------------------------------------------------------//
 public T pop(){
    if(topo == null){
        System.out.println("Pilha vazia");
        return null;
    }
     T dadoTemp = topo.getDado();

            topo = topo.getNextNo();

            return dadoTemp;
 }
//--------------------------------------------------------------------------------------------------------------------//
public void imprimePilha(){
    if(topo == null){
        System.out.println("Pilha Vazia");
   }

   else{
    No<T> aux = topo; // auxiliar = o topo

    while (aux !=null) { // enquanto aux for diferente de null
            System.out.print(aux.toString()+" "); // printa o valor do aux
            aux = aux.getNextNo(); // aux passa a ser o valor do seu nextNo.
            System.out.println(); // coloquei apenas para quebrar uma linha 
        }
    }
   }
//--------------------------------------------------------------------------------------------------------------------//
}

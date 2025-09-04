
public class Fila<T> {
    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private String nomeFila;
//---------------------------------------------------------------------------------------------------------------//
public Fila(){
    this("Fila");
}
 public Fila(String nomeFila){
        this.nomeFila = nomeFila;
        this.primeiroNo =null;
        this.ultimoNo =null; 
    }

//----------------------------------------------------------------------------------------------------------//
public void addFinal(T dado){
    No<T> novoNo = new No<T>(dado);
    if (primeiroNo==null) {
        primeiroNo = ultimoNo = novoNo;
    }
    else{
        ultimoNo.setNextNo(novoNo);
        ultimoNo = novoNo;
    }
}
//----------------------------------------------------------------------------------------------------//
    public void imprimeLista(){

            if(primeiroNo==null){
        System.out.println("Lista Vazia");
        } 
        
        else {
          No<T> aux = primeiroNo;    

        while (aux !=null) {
            System.out.print(aux.toString()+" ");
            aux = aux.getNextNo();
            System.out.println();
        }

         }
          }

//----------------------------------------------------------------------------------------------------//

public void removerInicio(){

    if(primeiroNo==null){
        System.out.println("lista vazia");
    }

    else{
        System.out.println(primeiroNo.getDado() + "removido");

        if (primeiroNo==ultimoNo) {
            primeiroNo =primeiroNo.getNextNo();
            ultimoNo= ultimoNo.getNextNo();
        }

        else{
        primeiroNo = primeiroNo.getNextNo();}
    }
}

//----------------------------------------------------------------------------------------------------//


}

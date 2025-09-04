
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
        ultimoNo.setNextNo(novoNo); // ultimoNo vai apontar para o valor do novoNo
        ultimoNo = novoNo; // o ultimoNo passa a ser o novoNo
    }
}
//----------------------------------------------------------------------------------------------------//
    public void imprimeFila(){

            if(primeiroNo==null){
        System.out.println("Lista Vazia");
        } 
        
        else {
          No<T> aux = primeiroNo;    

        while (aux !=null) {
            System.out.print(aux.toString()+" ");
            aux = aux.getNextNo();
        }

         }
          }

//----------------------------------------------------------------------------------------------------//

public void removerInicio(){

    if(primeiroNo==null){
        System.out.println("lista vazia");
    }

    else{}
        if (primeiroNo==ultimoNo) {
            primeiroNo =primeiroNo.getNextNo();// primeiroNo passa a ser o seu nextNo, no caso Null
            ultimoNo= ultimoNo.getNextNo();
        }

        else{
        primeiroNo = primeiroNo.getNextNo(); //primeiro no passa a ser seu nextNo
    }
    }
}


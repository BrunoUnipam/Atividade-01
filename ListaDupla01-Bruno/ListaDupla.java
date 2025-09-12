public class ListaDupla<T> {
    private String nomeLista;
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamanho;

public ListaDupla(){
    this("Lista Dupla");
}
public ListaDupla(String nomeLista){
    this.nomeLista = nomeLista;
    this.primeiroNo =null;
    this.ultimoNo =null;
    this.tamanho = 0;
}

public void addInicio(T dado){
    NoDuplo<T> novoNo = new NoDuplo<T>(dado,0);
    if ( primeiroNo == null){
        primeiroNo= ultimoNo = novoNo;
    }
    else{
        novoNo.setProximoNo(primeiroNo);
        primeiroNo.setAnteriorNo(novoNo);
        primeiroNo = novoNo;
    }
    atualizaIndice();
    tamanho++;
}
public void atualizaIndice(){
    NoDuplo<T> atual = primeiroNo;
    int indice = 0;
    while(atual != null){
        atual.setIndice(indice);
        atual = atual.getProximoNo();
        indice++;

    }

}
public void addFinal(T dado){
    NoDuplo<T> novoNo = new NoDuplo<T>(dado,0);
    if ( ultimoNo == null){
        primeiroNo= ultimoNo = novoNo;
    }
    else{
        novoNo.setAnteriorNo(ultimoNo);
        ultimoNo.setProximoNo(novoNo);
        ultimoNo = novoNo;
    }
    atualizaIndice();
    tamanho++;
}
public void imprimeLista(){

        if(primeiroNo == null){
        System.out.println("Lista Vazia");
        } else {
          NoDuplo<T> aux = primeiroNo;   
          System.out.print("Dado: ");    

        while (aux !=null) {
            System.out.print(aux.toString()+" ");
            aux = aux.getProximoNo();
            System.out.println();
        }
         }
        }

        public void addIndice(int indice, T dado) {
    if (indice < 0 || indice > tamanho) {
        System.out.println("Índice inválido");
        return;
    }
    
    if (indice == 0) {
        addInicio(dado);
        return;
    }
    
    if (indice == tamanho) {
        addFinal(dado);
        return;
    }
    
    NoDuplo<T> novoNo = new NoDuplo<T>(dado, 0);
    NoDuplo<T> atual = primeiroNo;
    
    for (int i = 0; i < indice; i++) {
        atual = atual.getProximoNo();
    }
    
    novoNo.setProximoNo(atual);
    novoNo.setAnteriorNo(atual.getAnteriorNo());
    atual.getAnteriorNo().setProximoNo(novoNo);
    atual.setAnteriorNo(novoNo);
    
    atualizaIndice();
    tamanho++;
}
public T removeIndice(int indice) {
    if (indice < 0 || indice >= tamanho) {
        return null;
    }
    NoDuplo<T> noRemover = primeiroNo;
    for (int i = 0; i < indice; i++) {
        noRemover = noRemover.getProximoNo();
    }
    T dadoRemovido = noRemover.getDado();
    if (tamanho == 1) {
        primeiroNo = ultimoNo = null;
    }
    else if (indice == 0) {
        primeiroNo = noRemover.getProximoNo();
        primeiroNo.setAnteriorNo(null);
    }
    else if (indice == tamanho - 1) {
        ultimoNo = noRemover.getAnteriorNo();
        ultimoNo.setProximoNo(null);
    }
    else {
        noRemover.getAnteriorNo().setProximoNo(noRemover.getProximoNo());
        noRemover.getProximoNo().setAnteriorNo(noRemover.getAnteriorNo());
    }
    tamanho--;
    atualizaIndice();
    
    return dadoRemovido;
}


}

package ordenacao_pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
private List <Pessoa> pessoaList;

public OrdenacaoPessoa(){
    this.pessoaList=new ArrayList<>();
}

public void adicionarPessoa(String nome, int idade, double altura){
    pessoaList.add(new Pessoa(nome, idade, altura));
}
public List<Pessoa> ordenarPorIdade(){
List<Pessoa> pessoaIdadeList= new ArrayList<>(pessoaList);
Collections.sort(pessoaIdadeList);
return pessoaIdadeList;
}
public List<Pessoa> ordenarPorAltura(){
List <Pessoa> pessoaAltura = new ArrayList<>(pessoaList);
Collections.sort(pessoaAltura,new ComparatorAltura());
return pessoaAltura;

}
public static void main(String[] args) {
    OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
    ordenacaoPessoa.adicionarPessoa("Pessoa1", 23, 1.84);
    ordenacaoPessoa.adicionarPessoa("Pessoa2", 28, 1.64);
    ordenacaoPessoa.adicionarPessoa("Pessoa3", 33, 1.74);
    ordenacaoPessoa.adicionarPessoa("Pessoa4", 13, 1.54);
    System.out.println(ordenacaoPessoa.ordenarPorIdade());
    System.out.println(ordenacaoPessoa.ordenarPorAltura());
}
}

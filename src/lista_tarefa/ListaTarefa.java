package lista_tarefa;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

  private List<Tarefa> listaTarefa;

  public ListaTarefa() {
    this.listaTarefa = new ArrayList<>();
  }

  public void adicionarTarefa(String descricao) {
    listaTarefa.add(new Tarefa(descricao));
  }

  public void removerTarefa(String descricao) {
    List<Tarefa> tarefasRemover = new ArrayList<Tarefa>();
    for (Tarefa tarefa : listaTarefa) {
      if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
        tarefasRemover.add(tarefa);
      }
    }
    listaTarefa.removeAll(tarefasRemover);
  }

  public int obterNumeroTotalTarefas() {
    return listaTarefa.size();
  }

  public void obterDescricaoTarefa() {
    System.out.println(listaTarefa);
  }

  public static void main(String[] args) {
    ListaTarefa listaTarefas = new ListaTarefa();
    System.out.println(listaTarefas.obterNumeroTotalTarefas());
    listaTarefas.adicionarTarefa("tarefa 1");
    System.out.println(listaTarefas.obterNumeroTotalTarefas());
    listaTarefas.adicionarTarefa("tarefa teste");
    listaTarefas.obterDescricaoTarefa();

  }
}

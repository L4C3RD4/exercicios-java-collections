package lista_tarefa;

public class Tarefa {

   private String descricao;

   public Tarefa(String descricao) {
      this.descricao = descricao;

   }

   public String getDescricao() {
      return descricao;
   }

   @Override
   public String toString() {
      return "Tarefa{" + " descricao " + descricao + " }";
   }
}

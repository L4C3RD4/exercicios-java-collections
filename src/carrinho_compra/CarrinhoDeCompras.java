package carrinho_compra;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinho = new ArrayList<Item>();

    public void adicionarItem(String nome, double preco, int quantidade) {

        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> removerCarrinho = new ArrayList<Item>();

        for (Item item : carrinho) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                removerCarrinho.add(item);
            }

        }
        carrinho.removeAll(removerCarrinho);
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;
        for (Item item : carrinho) {
            valorTotal += item.getPreco() * item.getQtd();

        }
        return valorTotal;
    }

    public void exibirItens() {
        System.out.println(carrinho);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho_atual = new CarrinhoDeCompras();
        carrinho_atual.adicionarItem("shampoo", 10.0, 2);
        carrinho_atual.adicionarItem("condicionador", 15.0, 2);
        carrinho_atual.adicionarItem("sabonete", 3.5, 4);
        carrinho_atual.exibirItens();
        carrinho_atual.removerItem("shampoo");
        carrinho_atual.exibirItens();
        System.out.println(carrinho_atual.calcularValorTotal());
    }
}

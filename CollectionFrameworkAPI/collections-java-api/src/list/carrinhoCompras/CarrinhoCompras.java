package list.carrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> carrinho;

    public CarrinhoCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarTarefa(String nome, Double preco, Integer quantidade) {
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List itensParaRemover = new ArrayList<>();

        for (Item item : carrinho) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(item);
            }
        }
        carrinho.removeAll(itensParaRemover);
    }

    public Double calcularValorTotal() {
        Double valorTotal = 0.0;

        for (Item item : carrinho) {
            valorTotal += (item.getPreco() * item.getQuantidade());
        }

        return valorTotal;
    }

    public void exibirItens() {
        System.out.println(carrinho);
    }

    public Integer obterQuantidadeTotal() {
        return carrinho.size();
    }

    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();

        System.out.println("Numero total de elementos: " + carrinho.obterQuantidadeTotal());

        carrinho.adicionarTarefa("Nescau", 8.90, 1);
        carrinho.adicionarTarefa("Chocolatinho", 3.90, 3);
        System.out.println("Valor total no carrinho: " + carrinho.calcularValorTotal());

        carrinho.removerItem("Chocolatinho");
        carrinho.exibirItens();
        System.out.println("Valor total no carrinho: " + carrinho.calcularValorTotal());

    }

}

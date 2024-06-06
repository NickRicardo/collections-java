package main.java.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {


    private List<Item> carrinhoList;

    public CarrinhoDeCompras() {
        this.carrinhoList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinhoList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemParaRemover = new ArrayList<>();

        for (Item i : carrinhoList) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itemParaRemover.add(i);
            }
        }

        carrinhoList.removeAll(itemParaRemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0.00;
        if (!carrinhoList.isEmpty()) {
            for (Item item : carrinhoList) {
                double valorItem = item.getValor() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A Lista está vazia!");
        }
    }


    public void exibirItens() {
        System.out.println(carrinhoList);
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "carrinhoList=" + carrinhoList +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Volante Fiat", 254.00, 1);
        carrinhoDeCompras.adicionarItem("Limpador de Para-Brisa", 70.00, 1);
        carrinhoDeCompras.adicionarItem("Pneus", 450.00, 4);
        carrinhoDeCompras.exibirItens();

        System.out.println("O valor total da sua compra é = " + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("Pneus");
        System.out.println("O valor total da sua compra é = " + carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.exibirItens();

    }
}

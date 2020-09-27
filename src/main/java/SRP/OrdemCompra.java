package SRP;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrdemCompra {
    private List<Produto> produtos = new ArrayList<Produto>();

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public BigDecimal calcularTotal(){
        return produtos.stream().map(Produto::getValor)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}

class OrdemCompraRepository {
    public List<OrdemCompra> buscarOrdemCompra() {
        return new ArrayList();
    }

    public void salvarOrdemCompra(OrdemCompra ordemCompra) {

    }

    public void alterarOrdemCompra(OrdemCompra ordemCompra) {

    }
}

class OrdemCompraMail {
    public void enviarEMail(String email) {
    }
}

class OrdemCompraPrint {
    public void imprimir(OrdemCompra ordemCompra) {
    }
}
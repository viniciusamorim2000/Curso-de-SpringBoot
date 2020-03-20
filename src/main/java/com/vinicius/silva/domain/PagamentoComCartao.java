package com.vinicius.silva.domain;

import com.vinicius.silva.domain.enums.EstadoPagamento;

import javax.persistence.Entity;

@Entity
public class PagamentoComCartao extends Pagamento{
    private static final long serialVersionUID= 1L;


    private Integer numeroDeParcealas;

    public PagamentoComCartao(){

    }

    public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcealas) {
        super(id, estado, pedido);
        this.numeroDeParcealas = numeroDeParcealas;
    }

    public Integer getNumeroDeParcealas() {
        return numeroDeParcealas;
    }

    public void setNumeroDeParcealas(Integer numeroDeParcealas) {
        this.numeroDeParcealas = numeroDeParcealas;
    }
}

package com.barbapizza.barbapizza.pizza;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PiizzaDTO {
  private Long id;
  private String nome;
  private double price;
  private boolean disponivel;
  private Tamanho tamanho;
  private Sabor sabor;
}

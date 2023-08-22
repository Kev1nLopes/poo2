package br.csi.avaliadordeprojetos.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String complemento;

    private String bairro;
    private String cep;
    private String numero;
    private String cidade;
    private String uf;
}

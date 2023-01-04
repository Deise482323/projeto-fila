package br.com.aplicacao2.entity;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_PESSOA")
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class PessoaEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    private String nome;
    private Integer idade;
    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    private Endereco endereco;

}

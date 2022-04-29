package br.trimestral.senai.trimestral.Avtrimestral;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity(name = "fornecedor")
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id")
    @Size(max = 100)
    @NotNull
    private String nome;
    @Size(max = 150)
    private String email;
    @Size(max = 100)
    private String telefone;
    @Size(max = 60)

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Fornecedor" +
                "nome:" + nome +
                "email:" + email +
                "telefone:" + telefone;
    }
}

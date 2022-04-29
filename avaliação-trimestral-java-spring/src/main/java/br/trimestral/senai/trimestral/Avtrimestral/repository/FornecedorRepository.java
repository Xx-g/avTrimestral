package br.trimestral.senai.trimestral.Avtrimestral.repository;


import br.trimestral.senai.trimestral.Avtrimestral.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {

        public Fornecedor findbyNome(String nome);
        public Fornecedor findByEmail(String email);
        public Fornecedor findByTelefone(String telefone);
 }


package com.example.projetospringbootcommysql.repository;

import com.example.projetospringbootcommysql.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

// Nessa interface, eu vou importar os meus métodos que representam comandos SQL
// Tenho que especificar a classe que eu vou usar como Exemplo de tabela
// E também especificar o tipo de dado do meu ID da classe extends
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Integer> {
    // todos os métodos que executam códigos SQL
}

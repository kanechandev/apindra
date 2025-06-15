package com.kanechan.apindra.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.kanechan.apindra.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}

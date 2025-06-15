package com.kanechan.apindra.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.kanechan.apindra.model.Usuario;
import com.kanechan.apindra.repository.UsuarioRepository;

@Service
public class UsuarioService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UsuarioService.class);

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public Usuario salvar(Usuario usuario) {
        LOGGER.info("Salvando novo usuário: {}", usuario.getEmail());
        return repository.save(usuario);
    }

    public List<Usuario> listarTodos() {
        LOGGER.info("Listando todos os usuários");
        return repository.findAll();
    }

    public Optional<Usuario> buscarPorId(Long id) {
        LOGGER.info("Buscando usuário por ID: {}", id);
        return repository.findById(id);
    }

    public Optional<Usuario> atualizar(Long id, Usuario usuarioAtualizado) {
        LOGGER.info("Atualizando usuário ID: {}", id);
        return repository.findById(id).map(usuario -> {
            usuario.setNome(usuarioAtualizado.getNome());
            usuario.setEmail(usuarioAtualizado.getEmail());
            Usuario atualizado = repository.save(usuario);
            LOGGER.debug("Usuário atualizado: {}", atualizado.getEmail());
            return atualizado;
        });
    }

    public boolean deletar(Long id) {
        LOGGER.warn("Tentando deletar usuário ID: {}", id);
        return repository.findById(id).map(usuario -> {
            repository.delete(usuario);
            LOGGER.info("Usuário ID {} deletado com sucesso", id);
            return true;
        }).orElseGet(() -> {
            LOGGER.warn("Usuário ID {} não encontrado para deleção", id);
            return false;
        });
    }
}

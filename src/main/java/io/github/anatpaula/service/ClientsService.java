package io.github.anatpaula.service;

import io.github.anatpaula.model.Cliente;
import io.github.anatpaula.repository.ClientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientsService {

    private ClientsRepository repository;

    public ClientsService(ClientsRepository repository){
        this.repository = repository;

    }

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.repository.salvar(cliente);

    }

    public void validarCliente(Cliente cliente){}
    // Aplica as validações
}

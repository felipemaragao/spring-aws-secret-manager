package br.com.qualify.controller;

import br.com.qualify.domain.Cliente;
import br.com.qualify.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/clientes")
    public List<Cliente> buscaCliente(){
        return clienteRepository.findAll();
    }
}

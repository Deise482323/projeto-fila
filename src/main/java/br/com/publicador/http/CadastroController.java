package br.com.cadastro.http;

import br.com.cadastro.domain.Pessoa;
import br.com.cadastro.service.PublicarEmFilaSalvar;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping(path = "/api/v1/cadastro")
@CrossOrigin
public class CadastroController {

    @Autowired
    private PublicarEmFilaSalvar service;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void execute(@RequestBody Pessoa pessoa) {
        service.execute(pessoa);
    }
}

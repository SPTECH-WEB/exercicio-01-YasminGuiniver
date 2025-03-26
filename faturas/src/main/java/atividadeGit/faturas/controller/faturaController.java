package atividadeGit.faturas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import atividadeGit.faturas.model.faturaModel;
import atividadeGit.faturas.service.faturaService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/faturas")
public class faturaController {
    private final faturaService faturaService;
    public faturaController(faturaService faturaService) {
        this.faturaService = faturaService;
    }

    @GetMapping
    public List<faturaModel> listarFaturas(){
        return faturaService.listartodos();
    }

    @PostMapping
    public ResponseEntity<faturaModel>criarFatura(@Valid @RequestBody faturaModel fatura) {
        faturaModel novaFatura = faturaService.salvar(fatura);
        return ResponseEntity.ok(novaFatura);
    }
}

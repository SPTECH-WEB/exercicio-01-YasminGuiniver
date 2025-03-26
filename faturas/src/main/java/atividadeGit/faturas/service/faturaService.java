package atividadeGit.faturas.service;

import org.springframework.stereotype.Service;
import atividadeGit.faturas.model.faturaModel;
import atividadeGit.faturas.repository.faturaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class faturaService {
    private final faturaRepository faturaRepository;
    public faturaService(faturaRepository faturaRepository) {
        this.faturaRepository = faturaRepository;
    }

    public List<faturaModel>listartodos() {
        return faturaRepository.findAll();
    }

    public faturaModel salvar(faturaModel fatura) {
        return faturaRepository.save(fatura);
    }
}

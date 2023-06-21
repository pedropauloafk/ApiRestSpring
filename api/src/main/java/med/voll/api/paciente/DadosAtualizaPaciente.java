package med.voll.api.paciente;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEndereco;
public record DadosAtualizaPaciente(

        @NotNull
        Long id,
        String nome,
        String cpf,
        String telefone,
        DadosEndereco endereco

){

}


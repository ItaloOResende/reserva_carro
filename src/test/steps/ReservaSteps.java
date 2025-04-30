package steps;

import io.cucumber.java.en.*;
import reserva.reserva_carroo.ReservaService;
import static org.junit.jupiter.api.Assertions.*;

public class ReservaSteps {

    String cidade;
    String endereco;
    String resultado;

    ReservaService service = new ReservaService();

    @Given("que o passageiro está em {string}")
    public void que_o_passageiro_está_em(String cidade) {
        this.cidade = cidade;
    }

    @When("ele solicita um carro para o endereço {string}")
    public void ele_solicita_um_carro_para_o_endereço(String endereco) {
        this.endereco = endereco;
        resultado = service.reservar(cidade, endereco);
    }

    @Then("o sistema deve retornar {string}")
    public void o_sistema_deve_retornar(String mensagemEsperada) {
        assertEquals(mensagemEsperada, resultado);
    }
}

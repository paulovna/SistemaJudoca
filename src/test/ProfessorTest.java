import org.fpij.jitakyoei.model.beans.Filiado;
import org.fpij.jitakyoei.model.beans.Professor;
import org.fpij.jitakyoei.model.beans.Rg;
import org.fpij.jitakyoei.model.beans.Endereco;

import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProfessorTest{
    @Test
    public void criacaoProfessor(){
        Professor professor = new Professor();
        Filiado filiado = new Filiado();
        professor.setFiliado(filiado);
        assertEquals(professor.getFiliado().getId(),null);
        assertEquals(professor.getFiliado().getNome(),null);
        assertEquals(professor.getFiliado().getRegistroCbj(),null);
        assertEquals(professor.getFiliado().getDataNascimento(),null);
        assertEquals(professor.getFiliado().getDataCadastro(),null);
        assertEquals(professor.getFiliado().getTelefone1(),null);
        assertEquals(professor.getFiliado().getTelefone2(),null);
        assertEquals(professor.getFiliado().getEmail(),null);
        assertEquals(professor.getFiliado().getCpf(),null);
        assertEquals(professor.getFiliado().getObservacoes(),null);
    }

    @Test
    public void inicializacaoCamposStringProfessor(){
        Professor professor = new Professor();
        Filiado filiado = new Filiado();
        professor.setFiliado(filiado);
        professor.getFiliado().setNome("Paulo Vinicius Nunes de Aguiar");
        professor.getFiliado().setRegistroCbj("teste");
        professor.getFiliado().setTelefone1("1199999999");
        professor.getFiliado().setTelefone2("1199999999");
        professor.getFiliado().setEmail("teste@email.com");
        professor.getFiliado().setObservacoes("teste");
        
        assertEquals(professor.getFiliado().getId(),null);
        assertEquals(professor.getFiliado().getNome(),"Paulo Vinicius Nunes de Aguiar");
        assertEquals(professor.getFiliado().getRegistroCbj(),"teste");
        assertEquals(professor.getFiliado().getDataNascimento(),null);
        assertEquals(professor.getFiliado().getDataCadastro(),null);
        assertEquals(professor.getFiliado().getTelefone1(),"1199999999");
        assertEquals(professor.getFiliado().getTelefone2(),"1199999999");
        assertEquals(professor.getFiliado().getEmail(),"teste@email.com");
        assertEquals(professor.getFiliado().getObservacoes(),"teste");
    }

    @Test
    public void inicializacaoCpfProfessor(){
        
        Professor professor = new Professor();
        Filiado filiado = new Filiado();
        professor.setFiliado(filiado);
        professor.getFiliado().setCpf("11111111111");
        assertThat(professor.getFiliado().getCpf()).matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}");
    }
    @Test
    public void inicializacaoCpfProfessor2() {
        Professor professor = new Professor();
        Filiado filiado = new Filiado();
        professor.setFiliado(filiado);
        professor.getFiliado().setCpf("a");
        assertThat(professor.getFiliado().getCpf()).matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}");
    }

    @Test
    public void inicializacaoCpfProfessor3() {
        Professor professor = new Professor();
        Filiado filiado = new Filiado();
        professor.setFiliado(filiado);
        professor.getFiliado().setCpf("dhas87d2177");
        assertThat(professor.getFiliado().getCpf()).matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}");
    }

    @Test
    public void inicializacaoCpfProfessorWRIGHT() {
        Professor professor = new Professor();
        Filiado filiado = new Filiado();
        professor.setFiliado(filiado);
        professor.getFiliado().setCpf("111.111.111-11");
        assertThat(professor.getFiliado().getCpf()).matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}");
    }


    @Test
    public void inicializacaoNomeProfessor1() {
        Professor professor = new Professor();
        Filiado filiado = new Filiado();
        professor.setFiliado(filiado);
        professor.getFiliado().setNome("11111111111");
        assertThat(professor.getFiliado().getNome()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(professor.getFiliado().getNome()).matches("([A-Z][a-z]+\\s[A-Z][a-z]+)+");
    }

    @Test
    public void inicializacaoNomeProfessor2() {
        Professor professor = new Professor();
        Filiado filiado = new Filiado();
        professor.setFiliado(filiado);
        professor.getFiliado().setNome("paulo vinicius");
        assertThat(professor.getFiliado().getNome()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(professor.getFiliado().getNome()).matches("([A-Z][a-z]+\\s[A-Z][a-z]+)+");
    }

    @Test
    public void inicializacaoNomeProfessor3() {
        Professor professor = new Professor();
        Filiado filiado = new Filiado();
        professor.setFiliado(filiado);
        professor.getFiliado().setNome("Paulo vinicius");
        assertThat(professor.getFiliado().getNome()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(professor.getFiliado().getNome()).matches("([A-Z][a-z]+\\s[A-Z][a-z]+)+");
    }

    @Test
    public void inicializacaoNomeProfessor4() {
        Professor professor = new Professor();
        Filiado filiado = new Filiado();
        professor.setFiliado(filiado);
        professor.getFiliado().setNome("Paulo");
        assertThat(professor.getFiliado().getNome()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(professor.getFiliado().getNome()).matches("([A-Z][a-z]+\\s[A-Z][a-z]+)+");
    }

    @Test
    public void inicializacaoNomeProfessorWRIGHT() {
        Professor professor = new Professor();
        Filiado filiado = new Filiado();
        professor.setFiliado(filiado);
        professor.getFiliado().setNome("Paulo Vinicius");
        assertThat(professor.getFiliado().getNome()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(professor.getFiliado().getNome()).matches("([A-Z][a-z]+\\s[A-Z][a-z]+)+");
    }

    

    @Test
    public void inicializacaoTelefoneProfessor(){
        Professor professor = new Professor();
        Filiado filiado = new Filiado();
        professor.setFiliado(filiado);
        professor.getFiliado().setTelefone1("01142244224");
        assertThat(professor.getFiliado().getTelefone1()).matches("[0-9]{3}-[0-9]{4}-[0-9]{4}|[0-9]{3}-[0-9]{5}-[0-9]{4}");
        professor.getFiliado().setTelefone2("011988887777");
        assertThat(professor.getFiliado().getTelefone2()).matches("[0-9]{3}-[0-9]{4}-[0-9]{4}|[0-9]{3}-[0-9]{5}-[0-9]{4}");
    }
    @Test
    public void inicializacaoTelefoneProfessor2() {
        Professor professor = new Professor();
        Filiado filiado = new Filiado();
        professor.setFiliado(filiado);
        professor.getFiliado().setTelefone1("a");
        assertThat(professor.getFiliado().getTelefone1()).matches("[0-9]{3}-[0-9]{4}-[0-9]{4}|[0-9]{3}-[0-9]{5}-[0-9]{4}");
        professor.getFiliado().setTelefone2("a");
        assertThat(professor.getFiliado().getTelefone2()).matches("[0-9]{3}-[0-9]{4}-[0-9]{4}|[0-9]{3}-[0-9]{5}-[0-9]{4}");
    }

    @Test
    public void inicializacaoTelefoneProfessor3() {
        Professor professor = new Professor();
        Filiado filiado = new Filiado();
        professor.setFiliado(filiado);
        professor.getFiliado().setTelefone1("dhas87d2177");
        assertThat(professor.getFiliado().getTelefone1()).matches("[0-9]{3}-[0-9]{4}-[0-9]{4}|[0-9]{3}-[0-9]{5}-[0-9]{4}");
        professor.getFiliado().setTelefone2("dhas87d2177");
        assertThat(professor.getFiliado().getTelefone2()).matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}");
    }

    @Test
    public void inicializacaoTelefoneProfessorWRIGHT() {
        Professor professor = new Professor();
        Filiado filiado = new Filiado();
        professor.setFiliado(filiado);
        professor.getFiliado().setTelefone1("011-99995-4555");
        assertThat(professor.getFiliado().getTelefone1()).matches("[0-9]{3}-[0-9]{4}-[0-9]{4}|[0-9]{3}-[0-9]{5}-[0-9]{4}");
        professor.getFiliado().setTelefone2("011-4995-4555");
        assertThat(professor.getFiliado().getTelefone2()).matches("[0-9]{3}-[0-9]{4}-[0-9]{4}|[0-9]{3}-[0-9]{5}-[0-9]{4}");
    }

    @Test
    public void inicializacaoEmailProfessor(){
        Professor professor = new Professor();
        Filiado filiado = new Filiado();
        professor.setFiliado(filiado);
        professor.getFiliado().setEmail("11111111111");
        assertThat(professor.getFiliado().getEmail()).matches("[a-z]+@[a-z]+.com|[a-z]+@[a-z]+.com.br");
    }
    @Test
    public void inicializacaoEmailProfessor2() {
        Professor professor = new Professor();
        Filiado filiado = new Filiado();
        professor.setFiliado(filiado);
        professor.getFiliado().setEmail("a");
        assertThat(professor.getFiliado().getEmail()).matches("[a-z]+@[a-z]+.com|[a-z]+@[a-z]+.com.br");
    }

    @Test
    public void inicializacaoEmailProfessor3() {
        Professor professor = new Professor();
        Filiado filiado = new Filiado();
        professor.setFiliado(filiado);
        professor.getFiliado().setEmail("dhas87d2177");
        assertThat(professor.getFiliado().getEmail()).matches("[a-z]+@[a-z]+.com|[a-z]+@[a-z]+.com.br");
    }

    @Test
    public void inicializacaoEmailProfessor4() {
        Professor professor = new Professor();
        Filiado filiado = new Filiado();
        professor.setFiliado(filiado);
        professor.getFiliado().setEmail("dhas87d2@177");
        assertThat(professor.getFiliado().getEmail()).matches("[a-z]+@[a-z]+.com|[a-z]+@[a-z]+.com.br");
    }

    @Test
    public void inicializacaoEmailProfessorWRIGHT() {
        Professor professor = new Professor();
        Filiado filiado = new Filiado();
        professor.setFiliado(filiado);
        professor.getFiliado().setEmail("dhas87d2@gmail.com");
        assertThat(professor.getFiliado().getEmail()).matches("([a-z]*[0-9]*)*@[a-z]+.com|([a-z]*[0-9]*)*@[a-z]+.com.br");
    }

    @Test
    public void inicializacaoEmailProfessorWRIGHT2() {
        Professor professor = new Professor();
        Filiado filiado = new Filiado();
        professor.setFiliado(filiado);
        professor.getFiliado().setEmail("dhas87d2@gmail.com.br");
        assertThat(professor.getFiliado().getEmail()).matches("([a-z]*[0-9]*)*@[a-z]+.com|([a-z]*[0-9]*)*@[a-z]+.com.br");
    }

    @Test
    public void inicializacaoRGProfessor(){
        Professor professor = new Professor();
        Filiado filiado = new Filiado();
        professor.setFiliado(filiado);
        Rg rg = new Rg();
        rg.setNumero("aaa");
        professor.getFiliado().setRg(rg);
        assertThat(professor.getFiliado().getRg().getNumero()).matches("[0-9]{2}.[0-9]{3}.[0-9]{3}-[0-9]{1}");
    }
    @Test
    public void inicializacaoRGProfessor2() {
        Professor professor = new Professor();
        Filiado filiado = new Filiado();
        professor.setFiliado(filiado);
        Rg rg = new Rg();
        rg.setNumero("111111111");
        professor.getFiliado().setRg(rg);
        assertThat(professor.getFiliado().getRg().getNumero()).matches("[0-9]{2}.[0-9]{3}.[0-9]{3}-[0-9]{1}");
    }

    @Test
    public void inicializacaoRGProfessor3() {
        Professor professor = new Professor();
        Filiado filiado = new Filiado();
        professor.setFiliado(filiado);
        Rg rg = new Rg();
        rg.setNumero("aaa111111");
        professor.getFiliado().setRg(rg);
        assertThat(professor.getFiliado().getRg().getNumero()).matches("[0-9]{2}.[0-9]{3}.[0-9]{3}-[0-9]{1}");
    }

    @Test
    public void inicializacaoRGProfessorWRIGHT() {
        Professor professor = new Professor();
        Filiado filiado = new Filiado();
        professor.setFiliado(filiado);
        Rg rg = new Rg();
        rg.setNumero("11.111.111-1");
        professor.getFiliado().setRg(rg);
        assertThat(professor.getFiliado().getRg().getNumero()).matches("[0-9]{2}.[0-9]{3}.[0-9]{3}-[0-9]{1}");
    }
    @Test
    public void inicializacaoEnderecoRua() {
        Filiado filiado = new Filiado();
        Professor professor = new Professor();
        professor.setFiliado(filiado);
        Endereco endereco = new Endereco();
        endereco.setRua("aaa111111");
        filiado.setEndereco(endereco);professor.getFiliado().setEndereco(endereco);
        assertEquals(professor.getFiliado().getEndereco().getRua(), "aaa111111");
    }

    @Test
    public void inicializacaoEnderecoNumero() {
        Filiado filiado = new Filiado();
        Professor professor = new Professor();
        professor.setFiliado(filiado);
        Endereco endereco = new Endereco();
        endereco.setNumero("aa11111");
        filiado.setEndereco(endereco);professor.getFiliado().setEndereco(endereco);
        assertThat(professor.getFiliado().getEndereco().getNumero()).matches("[0-9]");
    }

    @Test
    public void inicializacaoEnderecoNumero2() {
        Filiado filiado = new Filiado();
        Professor professor = new Professor();
        professor.setFiliado(filiado);
        Endereco endereco = new Endereco();
        endereco.setNumero("aa");
        filiado.setEndereco(endereco);professor.getFiliado().setEndereco(endereco);
        assertThat(professor.getFiliado().getEndereco().getNumero()).matches("[0-9]");
    }

    @Test
    public void inicializacaoEnderecoNumeroWRIGHT() {
        Filiado filiado = new Filiado();
        Professor professor = new Professor();
        professor.setFiliado(filiado);
        Endereco endereco = new Endereco();
        endereco.setNumero("1111");
        filiado.setEndereco(endereco);professor.getFiliado().setEndereco(endereco);
        assertThat(professor.getFiliado().getEndereco().getNumero()).matches("[0-9]+");
    }

    @Test
    public void inicializacaoEnderecoCampos() {
        Filiado filiado = new Filiado();
        Professor professor = new Professor();
        professor.setFiliado(filiado);
        Endereco endereco = new Endereco();
        endereco.setBairro("aa11111");
        endereco.setCidade("aa11111");
        endereco.setEstado("aa11111");
        filiado.setEndereco(endereco);professor.getFiliado().setEndereco(endereco);

        assertThat(professor.getFiliado().getEndereco().getBairro()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(professor.getFiliado().getEndereco().getEstado()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(professor.getFiliado().getEndereco().getCidade()).matches("([A-Z][a-z]+\\s*)+");
    }

    @Test
    public void inicializacaoEnderecoCampos2() {
        Filiado filiado = new Filiado();
        Professor professor = new Professor();
        professor.setFiliado(filiado);
        Endereco endereco = new Endereco();
        endereco.setBairro("aa");
        endereco.setCidade("aa");
        endereco.setEstado("aa");
        filiado.setEndereco(endereco);professor.getFiliado().setEndereco(endereco);

        assertThat(professor.getFiliado().getEndereco().getBairro()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(professor.getFiliado().getEndereco().getEstado()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(professor.getFiliado().getEndereco().getCidade()).matches("([A-Z][a-z]+\\s*)+");
    }

    @Test
    public void inicializacaoEnderecoCampos3() {
        Filiado filiado = new Filiado();
        Professor professor = new Professor();
        professor.setFiliado(filiado);
        Endereco endereco = new Endereco();
        endereco.setBairro("11");
        endereco.setCidade("11");
        endereco.setEstado("11");
        filiado.setEndereco(endereco);professor.getFiliado().setEndereco(endereco);

        assertThat(professor.getFiliado().getEndereco().getBairro()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(professor.getFiliado().getEndereco().getEstado()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(professor.getFiliado().getEndereco().getCidade()).matches("([A-Z][a-z]+\\s*)+");
    }

    @Test
    public void inicializacaoEnderecoCamposWRIGHT() {
        Filiado filiado = new Filiado();
        Professor professor = new Professor();
        professor.setFiliado(filiado);
        Endereco endereco = new Endereco();
        endereco.setBairro("Penha");
        endereco.setCidade("Sao Paulo");
        endereco.setEstado("Sao Paulo");
        filiado.setEndereco(endereco);professor.getFiliado().setEndereco(endereco);

        assertThat(professor.getFiliado().getEndereco().getBairro()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(professor.getFiliado().getEndereco().getEstado()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(professor.getFiliado().getEndereco().getCidade()).matches("([A-Z][a-z]+\\s*)+");
    }
    
    @Test
    public void inicializacaoCEPFiliado() {
        Filiado filiado = new Filiado();
        Professor professor = new Professor();
        professor.setFiliado(filiado);
        Endereco endereco = new Endereco();
        endereco.setCep("aaa");
        filiado.setEndereco(endereco);professor.getFiliado().setEndereco(endereco);
        assertThat(professor.getFiliado().getEndereco().getCep()).matches("[0-9]{5}-[0-9]{3}");
    }
    @Test
    public void inicializacaoCEPFiliado2() {
        Filiado filiado = new Filiado();
        Professor professor = new Professor();
        professor.setFiliado(filiado);
        Endereco endereco = new Endereco();
        endereco.setCep("111");
        filiado.setEndereco(endereco);professor.getFiliado().setEndereco(endereco);
        assertThat(professor.getFiliado().getEndereco().getCep()).matches("[0-9]{5}-[0-9]{3}");
        }

    @Test
    public void inicializacaoCEPFiliado3() {
        Filiado filiado = new Filiado();
        Professor professor = new Professor();
        professor.setFiliado(filiado);
        Endereco endereco = new Endereco();
        endereco.setCep("aaa111");
        filiado.setEndereco(endereco);professor.getFiliado().setEndereco(endereco);
        assertThat(professor.getFiliado().getEndereco().getCep()).matches("[0-9]{5}-[0-9]{3}");
    }

    @Test
    public void inicializacaoCEPFiliadoWRIGHT() {
        Filiado filiado = new Filiado();
        Professor professor = new Professor();
        professor.setFiliado(filiado);
        Endereco endereco = new Endereco();
        endereco.setCep("09875-000");
        filiado.setEndereco(endereco);professor.getFiliado().setEndereco(endereco);
        assertThat(professor.getFiliado().getEndereco().getCep()).matches("[0-9]{5}-[0-9]{3}");
    }


}


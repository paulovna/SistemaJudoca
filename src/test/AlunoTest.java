import org.fpij.jitakyoei.model.beans.Filiado;
import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.model.beans.Rg;
import org.fpij.jitakyoei.model.beans.Endereco;

import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlunoTest{
    @Test
    public void criacaoAluno(){
        Aluno aluno = new Aluno();
        Filiado filiado = new Filiado();
        aluno.setFiliado(filiado);
        assertEquals(aluno.getFiliado().getId(),null);
        assertEquals(aluno.getFiliado().getNome(),null);
        assertEquals(aluno.getFiliado().getRegistroCbj(),null);
        assertEquals(aluno.getFiliado().getDataNascimento(),null);
        assertEquals(aluno.getFiliado().getDataCadastro(),null);
        assertEquals(aluno.getFiliado().getTelefone1(),null);
        assertEquals(aluno.getFiliado().getTelefone2(),null);
        assertEquals(aluno.getFiliado().getEmail(),null);
        assertEquals(aluno.getFiliado().getCpf(),null);
        assertEquals(aluno.getFiliado().getObservacoes(),null);
    }

    @Test
    public void inicializacaoCamposStringAluno(){
        Aluno aluno = new Aluno();
        Filiado filiado = new Filiado();
        aluno.setFiliado(filiado);
        aluno.getFiliado().setNome("Paulo Vinicius Nunes de Aguiar");
        aluno.getFiliado().setRegistroCbj("teste");
        aluno.getFiliado().setTelefone1("1199999999");
        aluno.getFiliado().setTelefone2("1199999999");
        aluno.getFiliado().setEmail("teste@email.com");
        aluno.getFiliado().setObservacoes("teste");
        
        assertEquals(aluno.getFiliado().getId(),null);
        assertEquals(aluno.getFiliado().getNome(),"Paulo Vinicius Nunes de Aguiar");
        assertEquals(aluno.getFiliado().getRegistroCbj(),"teste");
        assertEquals(aluno.getFiliado().getDataNascimento(),null);
        assertEquals(aluno.getFiliado().getDataCadastro(),null);
        assertEquals(aluno.getFiliado().getTelefone1(),"1199999999");
        assertEquals(aluno.getFiliado().getTelefone2(),"1199999999");
        assertEquals(aluno.getFiliado().getEmail(),"teste@email.com");
        assertEquals(aluno.getFiliado().getObservacoes(),"teste");
    }

    @Test
    public void inicializacaoCpfAluno() {
        
        Aluno aluno = new Aluno();
        Filiado filiado = new Filiado();
        aluno.setFiliado(filiado);
        aluno.getFiliado().setCpf("11111111111");
        assertThat(aluno.getFiliado().getCpf()).matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}");
    }
    @Test
    public void inicializacaoCpfAluno2() {
        Aluno aluno = new Aluno();
        Filiado filiado = new Filiado();
        aluno.setFiliado(filiado);
        aluno.getFiliado().setCpf("a");
        assertThat(aluno.getFiliado().getCpf()).matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}");
    }

    @Test
    public void inicializacaoCpfAluno3() {
        Aluno aluno = new Aluno();
        Filiado filiado = new Filiado();
        aluno.setFiliado(filiado);
        aluno.getFiliado().setCpf("dhas87d2177");
        assertThat(aluno.getFiliado().getCpf()).matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}");
    }

    @Test
    public void inicializacaoCpfAlunoWRIGHT() {
        Aluno aluno = new Aluno();
        Filiado filiado = new Filiado();
        aluno.setFiliado(filiado);
        aluno.getFiliado().setCpf("111.111.111-11");
        assertThat(aluno.getFiliado().getCpf()).matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}");
    }


    @Test
    public void inicializacaoNomeAluno1() {
        Aluno aluno = new Aluno();
        Filiado filiado = new Filiado();
        aluno.setFiliado(filiado);
        aluno.getFiliado().setNome("11111111111");
        assertThat(aluno.getFiliado().getNome()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(aluno.getFiliado().getNome()).matches("([A-Z][a-z]+\\s[A-Z][a-z]+)+");
    }

    @Test
    public void inicializacaoNomeAluno2() {
        Aluno aluno = new Aluno();
        Filiado filiado = new Filiado();
        aluno.setFiliado(filiado);
        aluno.getFiliado().setNome("paulo vinicius");
        assertThat(aluno.getFiliado().getNome()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(aluno.getFiliado().getNome()).matches("([A-Z][a-z]+\\s[A-Z][a-z]+)+");
    }

    @Test
    public void inicializacaoNomeAluno3() {
        Aluno aluno = new Aluno();
        Filiado filiado = new Filiado();
        aluno.setFiliado(filiado);
        aluno.getFiliado().setNome("Paulo vinicius");
        assertThat(aluno.getFiliado().getNome()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(aluno.getFiliado().getNome()).matches("([A-Z][a-z]+\\s[A-Z][a-z]+)+");
    }

    @Test
    public void inicializacaoNomeAluno4() {
        Aluno aluno = new Aluno();
        Filiado filiado = new Filiado();
        aluno.setFiliado(filiado);
        aluno.getFiliado().setNome("Paulo");
        assertThat(aluno.getFiliado().getNome()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(aluno.getFiliado().getNome()).matches("([A-Z][a-z]+\\s[A-Z][a-z]+)+");
    }

    @Test
    public void inicializacaoNomeAlunoWRIGHT() {
        Aluno aluno = new Aluno();
        Filiado filiado = new Filiado();
        aluno.setFiliado(filiado);
        aluno.getFiliado().setNome("Paulo Vinicius");
        assertThat(aluno.getFiliado().getNome()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(aluno.getFiliado().getNome()).matches("([A-Z][a-z]+\\s[A-Z][a-z]+)+");
    }

    

    @Test
    public void inicializacaoTelefoneAluno() {
        Aluno aluno = new Aluno();
        Filiado filiado = new Filiado();
        aluno.setFiliado(filiado);
        aluno.getFiliado().setTelefone1("01142244224");
        assertThat(aluno.getFiliado().getTelefone1()).matches("[0-9]{3}-[0-9]{4}-[0-9]{4}|[0-9]{3}-[0-9]{5}-[0-9]{4}");
        aluno.getFiliado().setTelefone2("011988887777");
        assertThat(aluno.getFiliado().getTelefone2()).matches("[0-9]{3}-[0-9]{4}-[0-9]{4}|[0-9]{3}-[0-9]{5}-[0-9]{4}");
    }
    @Test
    public void inicializacaoTelefoneAluno2() {
        Aluno aluno = new Aluno();
        Filiado filiado = new Filiado();
        aluno.setFiliado(filiado);
        aluno.getFiliado().setTelefone1("a");
        assertThat(aluno.getFiliado().getTelefone1()).matches("[0-9]{3}-[0-9]{4}-[0-9]{4}|[0-9]{3}-[0-9]{5}-[0-9]{4}");
        aluno.getFiliado().setTelefone2("a");
        assertThat(aluno.getFiliado().getTelefone2()).matches("[0-9]{3}-[0-9]{4}-[0-9]{4}|[0-9]{3}-[0-9]{5}-[0-9]{4}");
    }

    @Test
    public void inicializacaoTelefoneAluno3() {
        Aluno aluno = new Aluno();
        Filiado filiado = new Filiado();
        aluno.setFiliado(filiado);
        aluno.getFiliado().setTelefone1("dhas87d2177");
        assertThat(aluno.getFiliado().getTelefone1()).matches("[0-9]{3}-[0-9]{4}-[0-9]{4}|[0-9]{3}-[0-9]{5}-[0-9]{4}");
        aluno.getFiliado().setTelefone2("dhas87d2177");
        assertThat(aluno.getFiliado().getTelefone2()).matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}");
    }

    @Test
    public void inicializacaoTelefoneAlunoWRIGHT() {
        Aluno aluno = new Aluno();
        Filiado filiado = new Filiado();
        aluno.setFiliado(filiado);
        aluno.getFiliado().setTelefone1("011-99995-4555");
        assertThat(aluno.getFiliado().getTelefone1()).matches("[0-9]{3}-[0-9]{4}-[0-9]{4}|[0-9]{3}-[0-9]{5}-[0-9]{4}");
        aluno.getFiliado().setTelefone2("011-4995-4555");
        assertThat(aluno.getFiliado().getTelefone2()).matches("[0-9]{3}-[0-9]{4}-[0-9]{4}|[0-9]{3}-[0-9]{5}-[0-9]{4}");
    }

    @Test
    public void inicializacaoEmailAluno() {
        Aluno aluno = new Aluno();
        Filiado filiado = new Filiado();
        aluno.setFiliado(filiado);
        aluno.getFiliado().setEmail("11111111111");
        assertThat(aluno.getFiliado().getEmail()).matches("[a-z]+@[a-z]+.com|[a-z]+@[a-z]+.com.br");
    }
    @Test
    public void inicializacaoEmailAluno2() {
        Aluno aluno = new Aluno();
        Filiado filiado = new Filiado();
        aluno.setFiliado(filiado);
        aluno.getFiliado().setEmail("a");
        assertThat(aluno.getFiliado().getEmail()).matches("[a-z]+@[a-z]+.com|[a-z]+@[a-z]+.com.br");
    }

    @Test
    public void inicializacaoEmailAluno3() {
        Aluno aluno = new Aluno();
        Filiado filiado = new Filiado();
        aluno.setFiliado(filiado);
        aluno.getFiliado().setEmail("dhas87d2177");
        assertThat(aluno.getFiliado().getEmail()).matches("[a-z]+@[a-z]+.com|[a-z]+@[a-z]+.com.br");
    }

    @Test
    public void inicializacaoEmailAluno4() {
        Aluno aluno = new Aluno();
        Filiado filiado = new Filiado();
        aluno.setFiliado(filiado);
        aluno.getFiliado().setEmail("dhas87d2@177");
        assertThat(aluno.getFiliado().getEmail()).matches("[a-z]+@[a-z]+.com|[a-z]+@[a-z]+.com.br");
    }

    @Test
    public void inicializacaoEmailAlunoWRIGHT() {
        Aluno aluno = new Aluno();
        Filiado filiado = new Filiado();
        aluno.setFiliado(filiado);
        aluno.getFiliado().setEmail("dhas87d2@gmail.com");
        assertThat(aluno.getFiliado().getEmail()).matches("([a-z]*[0-9]*)*@[a-z]+.com|([a-z]*[0-9]*)*@[a-z]+.com.br");
    }

    @Test
    public void inicializacaoEmailAlunoWRIGHT2() {
        Aluno aluno = new Aluno();
        Filiado filiado = new Filiado();
        aluno.setFiliado(filiado);
        aluno.getFiliado().setEmail("dhas87d2@gmail.com.br");
        assertThat(aluno.getFiliado().getEmail()).matches("([a-z]*[0-9]*)*@[a-z]+.com|([a-z]*[0-9]*)*@[a-z]+.com.br");
    }

    @Test
    public void inicializacaoRGAluno() {
        Aluno aluno = new Aluno();
        Filiado filiado = new Filiado();
        aluno.setFiliado(filiado);
        Rg rg = new Rg();
        rg.setNumero("aaa");
        aluno.getFiliado().setRg(rg);
        assertThat(aluno.getFiliado().getRg().getNumero()).matches("[0-9]{2}.[0-9]{3}.[0-9]{3}-[0-9]{1}");
    }
    @Test
    public void inicializacaoRGAluno2() {
        Aluno aluno = new Aluno();
        Filiado filiado = new Filiado();
        aluno.setFiliado(filiado);
        Rg rg = new Rg();
        rg.setNumero("111111111");
        aluno.getFiliado().setRg(rg);
        assertThat(aluno.getFiliado().getRg().getNumero()).matches("[0-9]{2}.[0-9]{3}.[0-9]{3}-[0-9]{1}");
    }

    @Test
    public void inicializacaoRGAluno3() {
        Aluno aluno = new Aluno();
        Filiado filiado = new Filiado();
        aluno.setFiliado(filiado);
        Rg rg = new Rg();
        rg.setNumero("aaa111111");
        aluno.getFiliado().setRg(rg);
        assertThat(aluno.getFiliado().getRg().getNumero()).matches("[0-9]{2}.[0-9]{3}.[0-9]{3}-[0-9]{1}");
    }

    @Test
    public void inicializacaoRGAlunoWRIGHT() {
        Aluno aluno = new Aluno();
        Filiado filiado = new Filiado();
        aluno.setFiliado(filiado);
        Rg rg = new Rg();
        rg.setNumero("11.111.111-1");
        aluno.getFiliado().setRg(rg);
        assertThat(aluno.getFiliado().getRg().getNumero()).matches("[0-9]{2}.[0-9]{3}.[0-9]{3}-[0-9]{1}");
    }
    @Test
    public void inicializacaoEnderecoRua() {
        Filiado filiado = new Filiado();
        Aluno aluno = new Aluno();
        aluno.setFiliado(filiado);
        Endereco endereco = new Endereco();
        endereco.setRua("aaa111111");
        filiado.setEndereco(endereco);aluno.getFiliado().setEndereco(endereco);
        assertEquals(aluno.getFiliado().getEndereco().getRua(), "aaa111111");
    }

    @Test
    public void inicializacaoEnderecoNumero() {
        Filiado filiado = new Filiado();
        Aluno aluno = new Aluno();
        aluno.setFiliado(filiado);
        Endereco endereco = new Endereco();
        endereco.setNumero("aa11111");
        filiado.setEndereco(endereco);aluno.getFiliado().setEndereco(endereco);
        assertThat(aluno.getFiliado().getEndereco().getNumero()).matches("[0-9]");
    }

    @Test
    public void inicializacaoEnderecoNumero2() {
        Filiado filiado = new Filiado();
        Aluno aluno = new Aluno();
        aluno.setFiliado(filiado);
        Endereco endereco = new Endereco();
        endereco.setNumero("aa");
        filiado.setEndereco(endereco);aluno.getFiliado().setEndereco(endereco);
        assertThat(aluno.getFiliado().getEndereco().getNumero()).matches("[0-9]");
    }

    @Test
    public void inicializacaoEnderecoNumeroWRIGHT() {
        Filiado filiado = new Filiado();
        Aluno aluno = new Aluno();
        aluno.setFiliado(filiado);
        Endereco endereco = new Endereco();
        endereco.setNumero("1111");
        filiado.setEndereco(endereco);aluno.getFiliado().setEndereco(endereco);
        assertThat(aluno.getFiliado().getEndereco().getNumero()).matches("[0-9]+");
    }

    @Test
    public void inicializacaoEnderecoCampos() {
        Filiado filiado = new Filiado();
        Aluno aluno = new Aluno();
        aluno.setFiliado(filiado);
        Endereco endereco = new Endereco();
        endereco.setBairro("aa11111");
        endereco.setCidade("aa11111");
        endereco.setEstado("aa11111");
        filiado.setEndereco(endereco);aluno.getFiliado().setEndereco(endereco);

        assertThat(aluno.getFiliado().getEndereco().getBairro()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(aluno.getFiliado().getEndereco().getEstado()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(aluno.getFiliado().getEndereco().getCidade()).matches("([A-Z][a-z]+\\s*)+");
    }

    @Test
    public void inicializacaoEnderecoCampos2() {
        Filiado filiado = new Filiado();
        Aluno aluno = new Aluno();
        aluno.setFiliado(filiado);
        Endereco endereco = new Endereco();
        endereco.setBairro("aa");
        endereco.setCidade("aa");
        endereco.setEstado("aa");
        filiado.setEndereco(endereco);aluno.getFiliado().setEndereco(endereco);

        assertThat(aluno.getFiliado().getEndereco().getBairro()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(aluno.getFiliado().getEndereco().getEstado()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(aluno.getFiliado().getEndereco().getCidade()).matches("([A-Z][a-z]+\\s*)+");
    }

    @Test
    public void inicializacaoEnderecoCampos3() {
        Filiado filiado = new Filiado();
        Aluno aluno = new Aluno();
        aluno.setFiliado(filiado);
        Endereco endereco = new Endereco();
        endereco.setBairro("11");
        endereco.setCidade("11");
        endereco.setEstado("11");
        filiado.setEndereco(endereco);aluno.getFiliado().setEndereco(endereco);

        assertThat(aluno.getFiliado().getEndereco().getBairro()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(aluno.getFiliado().getEndereco().getEstado()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(aluno.getFiliado().getEndereco().getCidade()).matches("([A-Z][a-z]+\\s*)+");
    }

    @Test
    public void inicializacaoEnderecoCamposWRIGHT() {
        Filiado filiado = new Filiado();
        Aluno aluno = new Aluno();
        aluno.setFiliado(filiado);
        Endereco endereco = new Endereco();
        endereco.setBairro("Penha");
        endereco.setCidade("Sao Paulo");
        endereco.setEstado("Sao Paulo");
        filiado.setEndereco(endereco);aluno.getFiliado().setEndereco(endereco);

        assertThat(aluno.getFiliado().getEndereco().getBairro()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(aluno.getFiliado().getEndereco().getEstado()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(aluno.getFiliado().getEndereco().getCidade()).matches("([A-Z][a-z]+\\s*)+");
    }
    
    @Test
    public void inicializacaoCEPFiliado() {
        Filiado filiado = new Filiado();
        Aluno aluno = new Aluno();
        aluno.setFiliado(filiado);
        Endereco endereco = new Endereco();
        endereco.setCep("aaa");
        filiado.setEndereco(endereco);aluno.getFiliado().setEndereco(endereco);
        assertThat(aluno.getFiliado().getEndereco().getCep()).matches("[0-9]{5}-[0-9]{3}");
    }
    @Test
    public void inicializacaoCEPFiliado2() {
        Filiado filiado = new Filiado();
        Aluno aluno = new Aluno();
        aluno.setFiliado(filiado);
        Endereco endereco = new Endereco();
        endereco.setCep("111");
        filiado.setEndereco(endereco);aluno.getFiliado().setEndereco(endereco);
        assertThat(aluno.getFiliado().getEndereco().getCep()).matches("[0-9]{5}-[0-9]{3}");
        }

    @Test
    public void inicializacaoCEPFiliado3() {
        Filiado filiado = new Filiado();
        Aluno aluno = new Aluno();
        aluno.setFiliado(filiado);
        Endereco endereco = new Endereco();
        endereco.setCep("aaa111");
        filiado.setEndereco(endereco);aluno.getFiliado().setEndereco(endereco);
        assertThat(aluno.getFiliado().getEndereco().getCep()).matches("[0-9]{5}-[0-9]{3}");
    }

    @Test
    public void inicializacaoCEPFiliadoWRIGHT() {
        Filiado filiado = new Filiado();
        Aluno aluno = new Aluno();
        aluno.setFiliado(filiado);
        Endereco endereco = new Endereco();
        endereco.setCep("09875-000");
        filiado.setEndereco(endereco);aluno.getFiliado().setEndereco(endereco);
        assertThat(aluno.getFiliado().getEndereco().getCep()).matches("[0-9]{5}-[0-9]{3}");
    }

}


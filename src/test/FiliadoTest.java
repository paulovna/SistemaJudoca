import org.fpij.jitakyoei.model.beans.Filiado;

import org.fpij.jitakyoei.model.beans.Rg;
import org.fpij.jitakyoei.model.beans.Endereco;

import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.Assert.*;

import org.junit.Test;

public class FiliadoTest{
    @Test
    public void criacaoFiliado(){
        Filiado filiado = new Filiado();
        assertEquals(filiado.getId(),null);
        assertEquals(filiado.getNome(),null);
        assertEquals(filiado.getRegistroCbj(),null);
        assertEquals(filiado.getDataNascimento(),null);
        assertEquals(filiado.getDataCadastro(),null);
        assertEquals(filiado.getTelefone1(),null);
        assertEquals(filiado.getTelefone2(),null);
        assertEquals(filiado.getEmail(),null);
        assertEquals(filiado.getCpf(),null);
        assertEquals(filiado.getObservacoes(),null);
    }

    @Test
    public void inicializacaoCamposStringFiliado(){
        Filiado filiado = new Filiado();
        filiado.setNome("Paulo Vinicius Nunes de Aguiar");
        filiado.setRegistroCbj("teste");
        filiado.setTelefone1("1199999999");
        filiado.setTelefone2("1199999999");
        filiado.setEmail("teste@email.com");
        filiado.setObservacoes("teste");
        
        assertEquals(filiado.getId(),null);
        assertEquals(filiado.getNome(),"Paulo Vinicius Nunes de Aguiar");
        assertEquals(filiado.getRegistroCbj(),"teste");
        assertEquals(filiado.getDataNascimento(),null);
        assertEquals(filiado.getDataCadastro(),null);
        assertEquals(filiado.getTelefone1(),"1199999999");
        assertEquals(filiado.getTelefone2(),"1199999999");
        assertEquals(filiado.getEmail(),"teste@email.com");
        assertEquals(filiado.getObservacoes(),"teste");
    }

    @Test
    public void inicializacaoCpfFiliado() {
        
        Filiado filiado = new Filiado();
        filiado.setCpf("11111111111");
        assertThat(filiado.getCpf()).matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}");
    }
    @Test
    public void inicializacaoCpfFiliado2() {
        Filiado filiado = new Filiado();
        filiado.setCpf("a");
        assertThat(filiado.getCpf()).matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}");
    }

    @Test
    public void inicializacaoCpfFiliado3() {
        Filiado filiado = new Filiado();
        filiado.setCpf("dhas87d2177");
        assertThat(filiado.getCpf()).matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}");
    }

    @Test
    public void inicializacaoCpfFiliadoWRIGHT() {
        Filiado filiado = new Filiado();
        filiado.setCpf("111.111.111-11");
        assertThat(filiado.getCpf()).matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}");
    }


    @Test
    public void inicializacaoNomeFiliado1() {
        Filiado filiado = new Filiado();
        filiado.setNome("11111111111");
        assertThat(filiado.getNome()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(filiado.getNome()).matches("([A-Z][a-z]+\\s[A-Z][a-z]+)+");
    }

    @Test
    public void inicializacaoNomeFiliado2() {
        Filiado filiado = new Filiado();
        filiado.setNome("paulo vinicius");
        assertThat(filiado.getNome()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(filiado.getNome()).matches("([A-Z][a-z]+\\s[A-Z][a-z]+)+");
    }

    @Test
    public void inicializacaoNomeFiliado3() {
        Filiado filiado = new Filiado();
        filiado.setNome("Paulo vinicius");
        assertThat(filiado.getNome()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(filiado.getNome()).matches("([A-Z][a-z]+\\s[A-Z][a-z]+)+");
    }

    @Test
    public void inicializacaoNomeFiliado4() {
        Filiado filiado = new Filiado();
        filiado.setNome("Paulo");
        assertThat(filiado.getNome()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(filiado.getNome()).matches("([A-Z][a-z]+\\s[A-Z][a-z]+)+");
    }

    @Test
    public void inicializacaoNomeFiliadowright() {
        Filiado filiado = new Filiado();
        filiado.setNome("Paulo Vinicius");
        assertThat(filiado.getNome()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(filiado.getNome()).matches("([A-Z][a-z]+\\s[A-Z][a-z]+)+");
    }

    

    @Test
    public void inicializacaoTelefoneFiliado() {
        Filiado filiado = new Filiado();
        filiado.setTelefone1("01142244224");
        assertThat(filiado.getTelefone1()).matches("[0-9]{3}-[0-9]{4}-[0-9]{4}|[0-9]{3}-[0-9]{5}-[0-9]{4}");
        filiado.setTelefone2("011988887777");
        assertThat(filiado.getTelefone2()).matches("[0-9]{3}-[0-9]{4}-[0-9]{4}|[0-9]{3}-[0-9]{5}-[0-9]{4}");
    }
    @Test
    public void inicializacaoTelefoneFiliado2() {
        Filiado filiado = new Filiado();
        filiado.setTelefone1("a");
        assertThat(filiado.getTelefone1()).matches("[0-9]{3}-[0-9]{4}-[0-9]{4}|[0-9]{3}-[0-9]{5}-[0-9]{4}");
        filiado.setTelefone2("a");
        assertThat(filiado.getTelefone2()).matches("[0-9]{3}-[0-9]{4}-[0-9]{4}|[0-9]{3}-[0-9]{5}-[0-9]{4}");
    }

    @Test
    public void inicializacaoTelefoneFiliado3() {
        Filiado filiado = new Filiado();
        filiado.setTelefone1("dhas87d2177");
        assertThat(filiado.getTelefone1()).matches("[0-9]{3}-[0-9]{4}-[0-9]{4}|[0-9]{3}-[0-9]{5}-[0-9]{4}");
        filiado.setTelefone2("dhas87d2177");
        assertThat(filiado.getTelefone2()).matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}");
    }

    @Test
    public void inicializacaoTelefoneFiliadoWRIGHT() {
        Filiado filiado = new Filiado();
        filiado.setTelefone1("011-99995-4555");
        assertThat(filiado.getTelefone1()).matches("[0-9]{3}-[0-9]{4}-[0-9]{4}|[0-9]{3}-[0-9]{5}-[0-9]{4}");
        filiado.setTelefone2("011-4995-4555");
        assertThat(filiado.getTelefone2()).matches("[0-9]{3}-[0-9]{4}-[0-9]{4}|[0-9]{3}-[0-9]{5}-[0-9]{4}");
    }

    @Test
    public void inicializacaoEmailFiliado() {
        Filiado filiado = new Filiado();
        filiado.setEmail("11111111111");
        assertThat(filiado.getEmail()).matches("[a-z]+@[a-z]+.com|[a-z]+@[a-z]+.com.br");
    }
    @Test
    public void inicializacaoEmailFiliado2() {
        Filiado filiado = new Filiado();
        filiado.setEmail("a");
        assertThat(filiado.getEmail()).matches("[a-z]+@[a-z]+.com|[a-z]+@[a-z]+.com.br");
    }

    @Test
    public void inicializacaoEmailFiliado3() {
        Filiado filiado = new Filiado();
        filiado.setEmail("dhas87d2177");
        assertThat(filiado.getEmail()).matches("[a-z]+@[a-z]+.com|[a-z]+@[a-z]+.com.br");
    }

    @Test
    public void inicializacaoEmailFiliado4() {
        Filiado filiado = new Filiado();
        filiado.setEmail("dhas87d2@177");
        assertThat(filiado.getEmail()).matches("[a-z]+@[a-z]+.com|[a-z]+@[a-z]+.com.br");
    }

    @Test
    public void inicializacaoEmailFiliadoWRIGHT() {
        Filiado filiado = new Filiado();
        filiado.setEmail("dhas87d2@gmail.com");
        assertThat(filiado.getEmail()).matches("([a-z]*[0-9]*)*@[a-z]+.com|([a-z]*[0-9]*)*@[a-z]+.com.br");
    }

    @Test
    public void inicializacaoEmailFiliadoWRIGHT2() {
        Filiado filiado = new Filiado();
        filiado.setEmail("dhas87d2@gmail.com.br");
        assertThat(filiado.getEmail()).matches("([a-z]*[0-9]*)*@[a-z]+.com|([a-z]*[0-9]*)*@[a-z]+.com.br");
    }

    @Test
    public void inicializacaoRGFiliado() {
        Filiado filiado = new Filiado();
        Rg rg = new Rg();
        rg.setNumero("aaa");
        filiado.setRg(rg);
        assertThat(filiado.getRg().getNumero()).matches("[0-9]{2}.[0-9]{3}.[0-9]{3}-[0-9]{1}");
    }
    @Test
    public void inicializacaoRGFiliado2() {
        Filiado filiado = new Filiado();
        Rg rg = new Rg();
        rg.setNumero("111111111");
        filiado.setRg(rg);
        assertThat(filiado.getRg().getNumero()).matches("[0-9]{2}.[0-9]{3}.[0-9]{3}-[0-9]{1}");
    }

    @Test
    public void inicializacaoRGFiliado3() {
        Filiado filiado = new Filiado();
        Rg rg = new Rg();
        rg.setNumero("aaa111111");
        filiado.setRg(rg);
        assertThat(filiado.getRg().getNumero()).matches("[0-9]{2}.[0-9]{3}.[0-9]{3}-[0-9]{1}");
    }

    @Test
    public void inicializacaoRGFiliadoWRIGHT() {
        Filiado filiado = new Filiado();
        Rg rg = new Rg();
        rg.setNumero("11.111.111-1");
        filiado.setRg(rg);
        assertThat(filiado.getRg().getNumero()).matches("[0-9]{2}.[0-9]{3}.[0-9]{3}-[0-9]{1}");
    }

    @Test
    public void inicializacaoEnderecoRua() {
        Filiado filiado = new Filiado();
        Endereco endereco = new Endereco();
        endereco.setRua("aaa111111");
        filiado.setEndereco(endereco);
        assertEquals(filiado.getEndereco().getRua(), "aaa111111");
    }

    @Test
    public void inicializacaoEnderecoNumero() {
        Filiado filiado = new Filiado();
        Endereco endereco = new Endereco();
        endereco.setNumero("aa11111");
        filiado.setEndereco(endereco);
        assertThat(filiado.getEndereco().getNumero()).matches("[0-9]");
    }

    @Test
    public void inicializacaoEnderecoNumero2() {
        Filiado filiado = new Filiado();
        Endereco endereco = new Endereco();
        endereco.setNumero("aa");
        filiado.setEndereco(endereco);
        assertThat(filiado.getEndereco().getNumero()).matches("[0-9]");
    }

    @Test
    public void inicializacaoEnderecoNumeroWRIGHT() {
        Filiado filiado = new Filiado();
        Endereco endereco = new Endereco();
        endereco.setNumero("1111");
        filiado.setEndereco(endereco);
        assertThat(filiado.getEndereco().getNumero()).matches("[0-9]+");
    }

    @Test
    public void inicializacaoEnderecoCampos() {
        Filiado filiado = new Filiado();
        Endereco endereco = new Endereco();
        endereco.setBairro("aa11111");
        endereco.setCidade("aa11111");
        endereco.setEstado("aa11111");
        filiado.setEndereco(endereco);

        assertThat(filiado.getEndereco().getBairro()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(filiado.getEndereco().getEstado()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(filiado.getEndereco().getCidade()).matches("([A-Z][a-z]+\\s*)+");
    }

    @Test
    public void inicializacaoEnderecoCampos2() {
        Filiado filiado = new Filiado();
        Endereco endereco = new Endereco();
        endereco.setBairro("aa");
        endereco.setCidade("aa");
        endereco.setEstado("aa");
        filiado.setEndereco(endereco);

        assertThat(filiado.getEndereco().getBairro()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(filiado.getEndereco().getEstado()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(filiado.getEndereco().getCidade()).matches("([A-Z][a-z]+\\s*)+");
    }

    @Test
    public void inicializacaoEnderecoCampos3() {
        Filiado filiado = new Filiado();
        Endereco endereco = new Endereco();
        endereco.setBairro("11");
        endereco.setCidade("11");
        endereco.setEstado("11");
        filiado.setEndereco(endereco);

        assertThat(filiado.getEndereco().getBairro()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(filiado.getEndereco().getEstado()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(filiado.getEndereco().getCidade()).matches("([A-Z][a-z]+\\s*)+");
    }

    @Test
    public void inicializacaoEnderecoCamposWRIGHT() {
        Filiado filiado = new Filiado();
        Endereco endereco = new Endereco();
        endereco.setBairro("Penha");
        endereco.setCidade("Sao Paulo");
        endereco.setEstado("Sao Paulo");
        filiado.setEndereco(endereco);

        assertThat(filiado.getEndereco().getBairro()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(filiado.getEndereco().getEstado()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(filiado.getEndereco().getCidade()).matches("([A-Z][a-z]+\\s*)+");
    }
    
    @Test
    public void inicializacaoCEPFiliado() {
        Filiado filiado = new Filiado();
        Endereco endereco = new Endereco();
        endereco.setCep("aaa");
        filiado.setEndereco(endereco);
        assertThat(filiado.getEndereco().getCep()).matches("[0-9]{5}-[0-9]{3}");
    }
    @Test
    public void inicializacaoCEPFiliado2() {
        Filiado filiado = new Filiado();
        Endereco endereco = new Endereco();
        endereco.setCep("111");
        filiado.setEndereco(endereco);
        assertThat(filiado.getEndereco().getCep()).matches("[0-9]{5}-[0-9]{3}");
        }

    @Test
    public void inicializacaoCEPFiliado3() {
        Filiado filiado = new Filiado();
        Endereco endereco = new Endereco();
        endereco.setCep("aaa111");
        filiado.setEndereco(endereco);
        assertThat(filiado.getEndereco().getCep()).matches("[0-9]{5}-[0-9]{3}");
    }

    @Test
    public void inicializacaoCEPFiliadoWRIGHT() {
        Filiado filiado = new Filiado();
        Endereco endereco = new Endereco();
        endereco.setCep("09875-000");
        filiado.setEndereco(endereco);
        assertThat(filiado.getEndereco().getCep()).matches("[0-9]{5}-[0-9]{3}");
    }

}


import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.model.beans.Endereco;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;
import org.junit.Test;

public class EntidadeTest{
    @Test
    public void criacaoEntidade(){
        Entidade entidade = new Entidade();
        assertEquals(entidade.getNome(),null);
        assertEquals(entidade.getTelefone1(),null);
        assertEquals(entidade.getTelefone2(),null);
        assertEquals(entidade.getCnpj(),null);
    }

    @Test
    public void inicializacaoCamposStringEntidade(){
        Entidade entidade = new Entidade();
        
        
        entidade.setNome("Paulo Vinicius Nunes de Aguiar");
        entidade.setTelefone1("011-99999999");
        entidade.setTelefone2("011-99999999");
        
        assertEquals(entidade.getNome(),"Paulo Vinicius Nunes de Aguiar");
        assertEquals(entidade.getTelefone1(),"011-99999999");
        assertEquals(entidade.getTelefone2(),"011-99999999");
    }

    @Test
    public void inicializacaoCnpjEntidade(){
        
        Entidade entidade = new Entidade();
        
        
        entidade.setCnpj("11111111111");
        assertThat(entidade.getCnpj()).matches("[0-9]{2}.[0-9]{3}.[0-9]{3}/[0-9]{4}-[0-9]{2}");
    }
    @Test
    public void inicializacaoCnpjEntidade2() {
        Entidade entidade = new Entidade();
        
        
        entidade.setCnpj("a");
        assertThat(entidade.getCnpj()).matches("[0-9]{2}.[0-9]{3}.[0-9]{3}/[0-9]{4}-[0-9]{2}");
    }

    @Test
    public void inicializacaoCnpjEntidade3() {
        Entidade entidade = new Entidade();
        
        
        entidade.setCnpj("dhas87d2177");
        assertThat(entidade.getCnpj()).matches("[0-9]{2}.[0-9]{3}.[0-9]{3}/[0-9]{4}-[0-9]{2}");
    }

    @Test
    public void inicializacaoCnpjEntidadeWRIGHT() {
        Entidade entidade = new Entidade();
        entidade.setCnpj("11.111.111/1000-11");
        assertThat(entidade.getCnpj()).matches("[0-9]{2}.[0-9]{3}.[0-9]{3}/[0-9]{4}-[0-9]{2}");
    }


    @Test
    public void inicializacaoNomeEntidade1() {
        Entidade entidade = new Entidade();
        
        
        entidade.setNome("11111111111");
        assertThat(entidade.getNome()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(entidade.getNome()).matches("([A-Z][a-z]+\\s[A-Z][a-z]+)+");
    }

    @Test
    public void inicializacaoNomeEntidade2() {
        Entidade entidade = new Entidade();
        
        
        entidade.setNome("paulo vinicius");
        assertThat(entidade.getNome()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(entidade.getNome()).matches("([A-Z][a-z]+\\s[A-Z][a-z]+)+");
    }

    @Test
    public void inicializacaoNomeEntidade3() {
        Entidade entidade = new Entidade();
        
        
        entidade.setNome("Paulo vinicius");
        assertThat(entidade.getNome()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(entidade.getNome()).matches("([A-Z][a-z]+\\s[A-Z][a-z]+)+");
    }

    @Test
    public void inicializacaoNomeEntidade4() {
        Entidade entidade = new Entidade();
        
        
        entidade.setNome("Paulo");
        assertThat(entidade.getNome()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(entidade.getNome()).matches("([A-Z][a-z]+\\s[A-Z][a-z]+)+");
    }

    @Test
    public void inicializacaoNomeEntidadeWRIGHT() {
        Entidade entidade = new Entidade();
        
        
        entidade.setNome("Paulo Vinicius");
        assertThat(entidade.getNome()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(entidade.getNome()).matches("([A-Z][a-z]+\\s[A-Z][a-z]+)+");
    }

    

    @Test
    public void inicializacaoTelefoneEntidade(){
        Entidade entidade = new Entidade();
        
        
        entidade.setTelefone1("01142244224");
        assertThat(entidade.getTelefone1()).matches("[0-9]{3}-[0-9]{4}-[0-9]{4}|[0-9]{3}-[0-9]{5}-[0-9]{4}");
        entidade.setTelefone2("011988887777");
        assertThat(entidade.getTelefone2()).matches("[0-9]{3}-[0-9]{4}-[0-9]{4}|[0-9]{3}-[0-9]{5}-[0-9]{4}");
    }
    @Test
    public void inicializacaoTelefoneEntidade2() {
        Entidade entidade = new Entidade();
        
        
        entidade.setTelefone1("a");
        assertThat(entidade.getTelefone1()).matches("[0-9]{3}-[0-9]{4}-[0-9]{4}|[0-9]{3}-[0-9]{5}-[0-9]{4}");
        entidade.setTelefone2("a");
        assertThat(entidade.getTelefone2()).matches("[0-9]{3}-[0-9]{4}-[0-9]{4}|[0-9]{3}-[0-9]{5}-[0-9]{4}");
    }

    @Test
    public void inicializacaoTelefoneEntidade3() {
        Entidade entidade = new Entidade();
        
        
        entidade.setTelefone1("dhas87d2177");
        assertThat(entidade.getTelefone1()).matches("[0-9]{3}-[0-9]{4}-[0-9]{4}|[0-9]{3}-[0-9]{5}-[0-9]{4}");
        entidade.setTelefone2("dhas87d2177");
        assertThat(entidade.getTelefone2()).matches("[0-9]{2}.[0-9]{3}.[0-9]{3}/[0-9]{4}-[0-9]{2}");
    }

    @Test
    public void inicializacaoTelefoneEntidadeWRIGHT() {
        Entidade entidade = new Entidade();
        
        
        entidade.setTelefone1("011-99995-4555");
        assertThat(entidade.getTelefone1()).matches("[0-9]{3}-[0-9]{4}-[0-9]{4}|[0-9]{3}-[0-9]{5}-[0-9]{4}");
        entidade.setTelefone2("011-4995-4555");
        assertThat(entidade.getTelefone2()).matches("[0-9]{3}-[0-9]{4}-[0-9]{4}|[0-9]{3}-[0-9]{5}-[0-9]{4}");
    }

    @Test
    public void inicializacaoEnderecoRua() {
        
        Entidade entidade = new Entidade();
        
        Endereco endereco = new Endereco();
        endereco.setRua("aaa111111");
        entidade.setEndereco(endereco);entidade.setEndereco(endereco);
        assertEquals(entidade.getEndereco().getRua(), "aaa111111");
    }

    @Test
    public void inicializacaoEnderecoNumero() {
        
        Entidade entidade = new Entidade();
        
        Endereco endereco = new Endereco();
        endereco.setNumero("aa11111");
        entidade.setEndereco(endereco);entidade.setEndereco(endereco);
        assertThat(entidade.getEndereco().getNumero()).matches("[0-9]");
    }

    @Test
    public void inicializacaoEnderecoNumero2() {
        
        Entidade entidade = new Entidade();
        
        Endereco endereco = new Endereco();
        endereco.setNumero("aa");
        entidade.setEndereco(endereco);entidade.setEndereco(endereco);
        assertThat(entidade.getEndereco().getNumero()).matches("[0-9]");
    }

    @Test
    public void inicializacaoEnderecoNumeroWRIGHT() {
        
        Entidade entidade = new Entidade();
        
        Endereco endereco = new Endereco();
        endereco.setNumero("1111");
        entidade.setEndereco(endereco);entidade.setEndereco(endereco);
        assertThat(entidade.getEndereco().getNumero()).matches("[0-9]+");
    }

    @Test
    public void inicializacaoEnderecoCampos() {
        
        Entidade entidade = new Entidade();
        
        Endereco endereco = new Endereco();
        endereco.setBairro("aa11111");
        endereco.setCidade("aa11111");
        endereco.setEstado("aa11111");
        entidade.setEndereco(endereco);entidade.setEndereco(endereco);

        assertThat(entidade.getEndereco().getBairro()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(entidade.getEndereco().getEstado()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(entidade.getEndereco().getCidade()).matches("([A-Z][a-z]+\\s*)+");
    }

    @Test
    public void inicializacaoEnderecoCampos2() {
        
        Entidade entidade = new Entidade();
        
        Endereco endereco = new Endereco();
        endereco.setBairro("aa");
        endereco.setCidade("aa");
        endereco.setEstado("aa");
        entidade.setEndereco(endereco);entidade.setEndereco(endereco);

        assertThat(entidade.getEndereco().getBairro()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(entidade.getEndereco().getEstado()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(entidade.getEndereco().getCidade()).matches("([A-Z][a-z]+\\s*)+");
    }

    @Test
    public void inicializacaoEnderecoCampos3() {
        
        Entidade entidade = new Entidade();
        
        Endereco endereco = new Endereco();
        endereco.setBairro("11");
        endereco.setCidade("11");
        endereco.setEstado("11");
        entidade.setEndereco(endereco);entidade.setEndereco(endereco);

        assertThat(entidade.getEndereco().getBairro()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(entidade.getEndereco().getEstado()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(entidade.getEndereco().getCidade()).matches("([A-Z][a-z]+\\s*)+");
    }

    @Test
    public void inicializacaoEnderecoCamposWRIGHT() {
        
        Entidade entidade = new Entidade();
        
        Endereco endereco = new Endereco();
        endereco.setBairro("Penha");
        endereco.setCidade("Sao Paulo");
        endereco.setEstado("Sao Paulo");
        entidade.setEndereco(endereco);entidade.setEndereco(endereco);

        assertThat(entidade.getEndereco().getBairro()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(entidade.getEndereco().getEstado()).matches("([A-Z][a-z]+\\s*)+");
        assertThat(entidade.getEndereco().getCidade()).matches("([A-Z][a-z]+\\s*)+");
    }
    
    @Test
    public void inicializacaoCEPFiliado() {
        
        Entidade entidade = new Entidade();
        
        Endereco endereco = new Endereco();
        endereco.setCep("aaa");
        entidade.setEndereco(endereco);entidade.setEndereco(endereco);
        assertThat(entidade.getEndereco().getCep()).matches("[0-9]{5}-[0-9]{3}");
    }
    @Test
    public void inicializacaoCEPFiliado2() {
        
        Entidade entidade = new Entidade();
        
        Endereco endereco = new Endereco();
        endereco.setCep("111");
        entidade.setEndereco(endereco);entidade.setEndereco(endereco);
        assertThat(entidade.getEndereco().getCep()).matches("[0-9]{5}-[0-9]{3}");
        }

    @Test
    public void inicializacaoCEPFiliado3() {
        
        Entidade entidade = new Entidade();
        
        Endereco endereco = new Endereco();
        endereco.setCep("aaa111");
        entidade.setEndereco(endereco);entidade.setEndereco(endereco);
        assertThat(entidade.getEndereco().getCep()).matches("[0-9]{5}-[0-9]{3}");
    }

    @Test
    public void inicializacaoCEPFiliadoWRIGHT() {
        
        Entidade entidade = new Entidade();
        
        Endereco endereco = new Endereco();
        endereco.setCep("09875-000");
        entidade.setEndereco(endereco);entidade.setEndereco(endereco);
        assertThat(entidade.getEndereco().getCep()).matches("[0-9]{5}-[0-9]{3}");
    }


}
    
public class ConectandoBanco{
  cadastro c = new cadastro();

  String sql = "INSERT INTO cadastro(id,nome,qtdHora,valorHora,valorOrcamento) VALUES (?,?,?,?,?)";
  
c.setid(1);
c.setnome("teste");
c.setValorOrcamento(1500);
c.setValorHora(140);
c.setqtdHora(240);

}

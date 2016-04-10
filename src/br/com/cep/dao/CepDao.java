package br.com.cep.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.cep.beans.Cep;
import br.com.cep.connection.ConnectionFactory;

public class CepDao {
	
	public Cep findCep(String cep){
		
		String sql = "select U.ds_uf_sigla as uf, C.ds_cidade_nome as cidade, B.ds_bairro_nome as bairro, L.DS_LOGRADOURO_NOME as rua from logradouros as L "
				+"inner join bairros as B on B.cd_bairro=L.CD_BAIRRO "
				+"inner join cidades as C on B.cd_cidade=C.cd_cidade "
				+"inner join uf as U on U.cd_uf=C.cd_uf "
				+"where NO_LOGRADOURO_CEP='"+cep+"'"; 
		//	Uma instrução SQL é pré compilada e armazenada em um objeto PrepareStatement. Este objeto pode então
		// ser usado para executrar eficientemente esta afirmação multiplas vezes.
		PreparedStatement ps = null;
		//	Um ResultSet mantém um cursor apontado para sua linha de dados atual. Inicialmente, o cursor é 
		//posicionado antes da primeira linha.
		ResultSet rs = null;	
		Cep cepRetorno = new Cep();	
		Connection con = new ConnectionFactory().getConnection();
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			rs.next();
			
			cepRetorno.setDs_uf_sigla(rs.getString("uf"));
			cepRetorno.setDs_cidade_nome(rs.getString("cidade"));
			cepRetorno.setDs_bairro_nome(rs.getString("bairro"));
			cepRetorno.setDs_logradouro_nome(rs.getString("rua"));
			
			rs.close();
			ps.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return cepRetorno;
		
	}
	
}

package br.com.comercialbatista.cadastro.daos;

import java.util.List;

import br.com.comercialbatista.cadastro.models.Chamado;

public interface ChamadoDAO {
	
	public List<Chamado> all();
	
	public void save(Chamado chamado);
	
	public Chamado findById(Integer id);
	
	public void remove(Chamado chamado);
	
	public void update(Chamado chamado);

}
package br.com.comercialbatista.cadastro.daos;

import java.util.List;
import br.com.comercialbatista.cadastro.models.SubArea;

public interface SubAreaDAO {
	
	public List<SubArea> all();
	
	public void save(SubArea subArea);
	
	public SubArea findById(Integer id);
	
	public void remove(SubArea subArea);
	
	public void update(SubArea subArea);

}

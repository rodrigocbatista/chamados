package br.com.comercialbatista.cadastro.daos;

import java.util.List;
import br.com.comercialbatista.cadastro.models.Area;


public interface AreaDAO {
	
	
	public List<Area> all();
	
	public void save(Area area);
	
	public Area findById(Integer id);
	
	public void remove(Area area);
	
	public void update(Area area);

}

package br.com.comercialbatista.cadastro.services;

import java.util.List;

import br.com.comercialbatista.cadastro.models.Usuario;

public interface UsuarioService {
	
	public List<Usuario> all();
	
	public void save(Usuario usuario);
	
	public Usuario findById(Integer id);
	
	public void remove(Usuario usuario);
	
	public void update(Usuario usuario);
	
	

}

package com.josecarlos.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.josecarlos.cursomc.domain.Categoria;




@RestController
@RequestMapping(value ="/categorias")
public class CategoriaResouce {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria>lista() {
		Categoria cat1 = new Categoria(1, "Informatica");
		Categoria cat2 = new Categoria(2, "Escritorio");
		Categoria cat3 = new Categoria(3, "Papel");
		List<Categoria>lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		
	
		return lista;	
		
	}
}

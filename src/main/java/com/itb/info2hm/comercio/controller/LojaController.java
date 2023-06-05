package com.itb.info2hm.comercio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.info2hm.comercio.model.Produto;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {

  List<Produto> produtos = new ArrayList<Produto>();	
	
    @GetMapping("/listar")
	public String listarProdutos(Model model) {
    	
    	Produto produto = new Produto();
    	produto.setNome("televisor 70' samsung");
    	produto.setCodigoBarras("GA5LAXIA456");
    	produto.setPreco(6541.25);
    	
    	
	    return "produtos";
		
    }	
}

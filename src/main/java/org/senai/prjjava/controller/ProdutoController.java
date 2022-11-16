package org.senai.prjjava.controller;

import org.senai.prjjava.entity.Produto;
import org.senai.prjjava.repository.ProdutoRepository;
import org.senai.prjjava.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping (path = "/api/produto")
@CrossOrigin("*")
public class ProdutoController {

    @Autowired
    ProdutoRepository produtoRepository;

    public @ResponseBody Integer addProduto(@RequestBody Produto objetoProduto) {
        produtoRepository.save(objetoProduto);
        return objetoProduto.getId();
    }


}

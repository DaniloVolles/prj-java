package org.senai.prjjava.controller;

import org.senai.prjjava.entity.Produto;
import org.senai.prjjava.repository.ProdutoRepository;
import org.senai.prjjava.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping (path = "/api/produto")
@CrossOrigin("*")
public class ProdutoController {

    @Autowired
    ProdutoRepository produtoRepository;

    @PostMapping("/")
    public @ResponseBody Integer addProduto(@RequestBody Produto objetoProduto) {
        produtoRepository.save(objetoProduto);
        return objetoProduto.getId();
    }

    @GetMapping("/")
    public @ResponseBody Iterable<Produto> buscarProdutos () {
        return produtoRepository.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody Optional<Produto> buscarProduto (@PathVariable Integer id) {
        return produtoRepository.findById(id);
    }

    @PutMapping("")
    public @ResponseBody Produto atualizar(@RequestBody Produto objetoProduto) {
        produtoRepository.save(objetoProduto);
        return objetoProduto;
    }

    @DeleteMapping("/{id}")
    public @ResponseBody String apagar(@PathVariable Integer id) {
        produtoRepository.deleteById(id);
        return "Ok ao apagar!";
    }
}

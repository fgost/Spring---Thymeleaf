package com.alura.mvs.mudi.controler;

import com.alura.mvs.mudi.dto.RquisicaoNovoPedido;
import com.alura.mvs.mudi.model.Pedido;
import com.alura.mvs.mudi.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("pedido")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping("formulario")
    public String formulario(RquisicaoNovoPedido requisicao){
        return"pedido/formulario";
    }

    @PostMapping("novo")
    public String novo(@Valid RquisicaoNovoPedido requisicao, BindingResult result){
        if(result.hasErrors()){
            return "pedido/formulario";
        }

        Pedido pedido = requisicao.toPedido();
        pedidoRepository.save(pedido);

        return "redirect:/home";
    }
}

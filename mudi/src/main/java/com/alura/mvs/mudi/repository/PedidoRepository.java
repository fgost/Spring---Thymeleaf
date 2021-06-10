package com.alura.mvs.mudi.repository;

import com.alura.mvs.mudi.model.Pedido;
import com.alura.mvs.mudi.model.StatusPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

    List<Pedido> findByStatus(StatusPedido status);
}

package com.example.TacoCloud.data;

import com.example.TacoCloud.dto.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository
        extends CrudRepository<TacoOrder, Long> {
}

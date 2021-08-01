package br.com.pedrodavi.hrpayroll.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Worker implements Serializable {
    private Long id;
    private String name;
    private Double dailyIncome;
}

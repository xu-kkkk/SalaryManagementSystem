package cn.edu.jit.system.bean;

import java.math.BigDecimal;

/**
 * 津贴（职工号，姓名，奖金）
 *
 * @author: xutiankai
 * @date: 12/1/2021 1:02 PM
 * @version: 1.0
 */
public class Allowance {
    private Employee employee;
    private BigDecimal bonus;

    public Allowance() {

    }

    public Allowance(Employee employee, BigDecimal bonus) {
        this.employee = employee;
        this.bonus = bonus;
    }
}

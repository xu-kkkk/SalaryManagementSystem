package cn.edu.jit.system.bean;

import java.math.BigDecimal;

/**
 * 工资（职工号，姓名，基本工资，）
 *
 * @author: xutiankai
 * @date: 12/1/2021 1:01 PM
 * @version: 1.0
 */
public class Salary {
    private Employee employee;

    private BigDecimal basicSalary;

    public Salary() {

    }

    public Salary(Employee employee, BigDecimal basicSalary) {
        this.employee = employee;
        this.basicSalary = basicSalary;
    }
}

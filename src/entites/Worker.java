package entites;

import entites.enums.WorkLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkLevel level;
    private Double basaSalary;
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();//Para iniciar com a lista vazia

    public Worker(){
    }
    public Worker(String name, WorkLevel level, double basaSalary, Department department) {
        super();
        this.name = name;
        this.level = level;
        this.basaSalary = basaSalary;
        this.department = department;
    }

    public void addContracts(HourContract contract){
        contracts.add(contract);
    }
    public void removeContracts(HourContract contract){
        contracts.remove(contract);
    }
    //Income retorna o salario base,mais os valores de contratos
    public double Income(int ano, int mes){
        double soma = basaSalary;

        //vamos trabalhar com Calendar, para converter a data
        Calendar calendar = Calendar.getInstance();
        for (HourContract contract : contracts){
            calendar.setTime(contract.getDate());
            int anoContrato = calendar.get(calendar.YEAR);
            int mesContrato = 1 + calendar.get(calendar.MONTH);

            if (anoContrato == ano && mesContrato == mes){
                soma += contract.totalValue();
            }


        }
        return soma;

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkLevel getLevel() {
        return level;
    }

    public void setLevel(WorkLevel level) {
        this.level = level;
    }

    public Double getBasaSalary() {
        return basaSalary;
    }

    public void setBasaSalary(Double basaSalary) {
        this.basaSalary = basaSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

}

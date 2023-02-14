package com.example.EmployeeAPI.Services;

import com.example.EmployeeAPI.Model.Employee;
import com.example.EmployeeAPI.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServices {
    @Autowired
    EmployeeRepository repository;
    public List<Employee> getEmployee(){
        List<Employee>employeeList=repository.findAll();
        return employeeList;
    }
    public Employee getEmployeeByID(int id){
        Employee e= repository.findById(id).orElse(null);
        return e;
    }
    public  void addEmployee(Employee e){
        repository.save(e);
    }
    public void updateEmployee(Employee e){
        repository.save(e);
    }
    public void deleteEmployee(int id){repository.deleteById(id);}
   public  List<Employee>findByName(String name){
        List<Employee>employees=repository.findByName(name);
        return employees;
    }
    public  List<Employee>findByDesgin(String desgin){
        List<Employee>employees1=repository.findByDesgin(desgin);
        return employees1;
    }
    public Employee getByDesgin(String desgin){
        Employee e=repository.getByDesgin(desgin);
        return e;
    }
    public  List<Employee>findBySalaryGreaterThan(double salary){
        List<Employee>employees2=repository.findBySalaryGreaterThan(salary);
        return employees2;
    }
    public   List<Employee> findByAgeLessThan(int age){
        List<Employee>employees=repository.findByAgeLessThan(age);
        return  employees;
    }
     public List<Employee> findByDesginAndSalaryLessThan(String desgin, double salary){
        List<Employee>employees=repository.findByDesginAndSalaryLessThan(desgin, salary);
        return employees;
    }
     public List<Employee> findBySalaryBetween(double salary,double salary1){
        List<Employee>employees=repository.findBySalaryBetween(salary, salary1);
        return  employees;
     }
    public List<Employee> findByDesginContaining(String desgin){
        List<Employee>employees=repository.findByDesginContaining(desgin);
        return employees;
    }
    public List<Employee>findBySalaryLessThanOrAgeGreaterThan(double salary, int age){
        List<Employee>employees=repository.findBySalaryLessThanOrAgeGreaterThan(salary, age);
        return employees;
    }
    public List<Employee> findByDesginIn(List<String> desgin){
        return repository.findByDesginIn(desgin);
    }
   public List<Employee>displayEmployee(String desgin){
        return repository.displayEmployee(desgin);
   }
    public List<Employee>showEmployee( String name){
        return  repository.showEmployee(name);
    }
    public List<Employee>viewEmployee( String name){
        return  repository.viewEmployee(name);
    }
   public List<Employee>displayDesg(String desgin){
        return  repository.displayDesg(desgin);
    }
  /*  public void updateAllEmployee(String prefix){
         repository.updateAllEmployee(prefix);
    }*/
}

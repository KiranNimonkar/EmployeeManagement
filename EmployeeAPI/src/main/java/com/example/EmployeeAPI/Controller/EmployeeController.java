package com.example.EmployeeAPI.Controller;

import com.example.EmployeeAPI.Model.Employee;
import com.example.EmployeeAPI.Services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@CrossOrigin("http://localhost:3003/")
@RestController
public class EmployeeController {
    @Autowired
    EmployeeServices services;
    @GetMapping("/emp")
    public List<Employee> getbook(){
        return services.getEmployee();
    }
    @GetMapping("/emp/{id}")
    public Employee getBooksById(@PathVariable int id){
        return services.getEmployeeByID(id);
    }
    @PostMapping("/emp")
    public void getAddEmployee(@RequestBody Employee e){services.addEmployee(e);}
    @PutMapping("/emp")
    public void updateEmpoyee(@RequestBody Employee e){services.updateEmployee(e);}
    @DeleteMapping("/emp/{id}")
    public void deleteEmployee(@PathVariable int id){services.deleteEmployee(id);}
   @GetMapping("/empByName/{name}")
    public List<Employee> findByName(@PathVariable String name){
       return services.findByName(name);
    }
    @GetMapping("/empfindByDesgin/{desgin}")
    public List<Employee> findByDesgin(@PathVariable String desgin){
        return services.findByDesgin(desgin);
    }
    @GetMapping("/empgetByDesgin/{desgin}")
    public Employee getByDesgin(@PathVariable String desgin){
        return services.getByDesgin(desgin);
    }
    @GetMapping("/empgetBySalary/greaterthan")
    public List<Employee> findBySalaryGreaterThan (@RequestParam double salary) {
        return services.findBySalaryGreaterThan(salary);
    }
    @GetMapping("/empfindByAgeLessThan")
   public List<Employee> findByAgeLessThan(@RequestParam int age){
        return  services.findByAgeLessThan(age);
   }
   @GetMapping("/empfindByDesginAndSalaryLessThan")
   public List<Employee>findByDesginAndSalaryLessThan(@RequestParam String desgin,@RequestParam double salary){
        return services.findByDesginAndSalaryLessThan(desgin, salary);
   }
   @GetMapping("/findBySalaryBetween")
    public List<Employee>findBySalaryBetween(@RequestParam double salary, double salary1){
        return  services.findBySalaryBetween(salary, salary1);
   }
   @GetMapping("findByDesginContaining")
   public List<Employee> findByDesginContaining(@RequestParam String desgin){
        return  services.findByDesginContaining(desgin);
   }
   @GetMapping("/findBySalaryLessThanOrAgeGreaterThan")
    public List<Employee>findBySalaryLessThanOrAgeGreaterThan(@RequestParam double salary,@RequestParam int age){
        return services.findBySalaryLessThanOrAgeGreaterThan(salary, age);
    }
    @GetMapping("/empfindByDesginIn")
  public List<Employee>findByDesginIn(String desgin,String desgin2,String desgin3){
        List<String> desgina=new ArrayList<>();
        desgina.add(desgin);
        desgina.add(desgin2);
        desgina.add(desgin3);
        return services.findByDesginIn(desgina);
  }
  @GetMapping("/displayEmployee/{desgin}")
   public List<Employee>displayEmployee(@PathVariable String desgin){
        return  services.displayEmployee(desgin);
   }
    @GetMapping("/showEmployee/{name}")
    public List<Employee>showEmployee( @PathVariable String name){
        System.out.println(name);
      return services.showEmployee(name) ;
    }
    @GetMapping("/viewEmployee/{name}")
    public List<Employee>viewEmployee( @PathVariable String name){
        return services.viewEmployee(name) ;
    }
    @GetMapping("/displayDesg/{desg}")
    public List<Employee>displayDesg(@PathVariable String desgin){
        return services.displayDesg(desgin);
    }
   /* public void updateAllEmployee(String prefix){
         services.updateAllEmployee(prefix);
    }*/

}

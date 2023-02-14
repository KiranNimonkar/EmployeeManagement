package com.example.EmployeeAPI.Repository;

import com.example.EmployeeAPI.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    //Get Employee by name using JpaRepository
    List<Employee> findByName(String name);
    //get Empl by desgination
   List<Employee> findByDesgin(String desgin);
   Employee getByDesgin(String desgin);

    //get Empl earning salary greater than specified amt
   List<Employee> findBySalaryGreaterThan(double salary);
    //get emp having age less than specified age
    List<Employee> findByAgeLessThan(int age);
    //get emp having specific desgination and salary less than specified amt
    List<Employee> findByDesginAndSalaryLessThan(String desgin, double salary);
    //find emp having salary between sepecified range
    List<Employee>findBySalaryBetween(double salary, double salary1);
    //find emp whose desg contain specified string
    List<Employee>findByDesginContaining(String desgin);
    //display employee having salary less than specified amt and age greater thanspecified value
    List<Employee>findBySalaryLessThanOrAgeGreaterThan(double salary, int age);
   //display  all emp matching the specified desgination
    List<Employee> findByDesginIn(List<String> desgin);
    //writing jpql to perform database operation
    //fetch all the empl based on their desg
    @Query("select e from Employee e where e.desgin=:desgin")
    List<Employee>displayEmployee(@Param("desgin")String desgin);
    @Query("select e from Employee e where e.name like %:name%")
    List<Employee>showEmployee(@Param("name") String name);
    @Query("select e from Employee e where e.name like :name%")
    List<Employee>viewEmployee(@Param("name") String name);
    @Query("select e from Employee e where e.desgin like %:desgin")
    List<Employee>displayDesg(@Param("desgin") String desgin);
  /*  @Query("update Employee e. set e.name=prefix||e.name")
    @Modifying
    @Transactional
    void updateAllEmployee(@Param("prefix")String prefix);*/
}
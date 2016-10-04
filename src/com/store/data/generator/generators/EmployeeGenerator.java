package com.store.data.generator.generators;

import com.store.data.generator.models.Department;
import com.store.data.generator.models.Employee;
import com.store.data.generator.models.Level;
import com.store.data.generator.models.Name;

import java.io.IOException;
import java.util.LinkedList;

public class EmployeeGenerator
{
    public LinkedList<Employee> generateEmployees() throws IOException
    {
        final LinkedList<Employee> employeeList = new LinkedList<>();

        int employeeId = 1;

        for (Department department : Department.values())
        {
            for (Level level : Level.values())
            {
                for(int i = 0; i < department.getStaffSize() * level.getDistrubution(); i++)
                {
                    final Name name = nameGenerator.getRandomName();
                    final Employee employee = new Employee(
                            employeeId,
                            name.getFirstName(),
                            name.getLastName(),
                            level,
                            department);
                    employeeList.add(employee);
                    employeeId++;
                }
            }
        }

        return employeeList;
    }

    public EmployeeGenerator(final NameGenerator nameGenerator)
    {
        this.nameGenerator = nameGenerator;
    }

    private final NameGenerator nameGenerator;
}

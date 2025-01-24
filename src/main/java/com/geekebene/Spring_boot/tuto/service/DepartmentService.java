package com.geekebene.Spring_boot.tuto.service;

import com.geekebene.Spring_boot.tuto.entity.Department;
import com.geekebene.Spring_boot.tuto.error.DepartmentNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);

    public Department fetchDepartmentByName(String departmentName);
}

package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("=== Teste 1 - department finById ===");
		Department department = departmentDao.findById(3);
		System.out.println(department);

		
		System.out.println("\n=== Teste 2 - department findAll ===");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list ) {
			System.out.println(obj);
		}
	
		
		System.out.println("\n=== Teste 3 - department insert ===");
		Department newDepartment = new Department(null, "D4");
		departmentDao.insert(newDepartment);
		System.out.println("Inserido! Novo id = " + newDepartment.getId());

		
		System.out.println("\n=== Teste 4 - department update ===");
		department = departmentDao.findById(1);
		department.setName("Computer");
		departmentDao.update(department);
		System.out.println("Update completed!");
		
		
		System.out.println("\n=== Teste 5 - department delete ===");
		departmentDao.DeleteById(10);
		System.out.println("Delete completed!");

	}

}

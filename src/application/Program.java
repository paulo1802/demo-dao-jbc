package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	Department obj = new Department(1,"books");
	
	SellerDao sellerDao  = DaoFactory.createSellerDao();
	
	System.out.println("#######TESTE NUMERO 1: SELLER FIND BY ID######");
	Seller seller = sellerDao.findById(3);
	
	System.out.println(seller);
	
	System.out.println("#######TESTE NUMERO 2: SELLER FIND BY department######");
	Department dep = new Department(1,null);
	List<Seller> list = sellerDao.findByDepartment(dep);
	
	for(Seller ls : list) {
		System.out.println(ls);
	} 

	System.out.println("#######TESTE NUMERO 3: SELLER FIND all department######");
	
       list = sellerDao.findAll();
       
       System.out.println(list);
	
	for(Seller ls : list) {
		System.out.println(ls);
	}
	}

}

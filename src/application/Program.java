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
	
	/*System.out.println("#######TESTE NUMERO 4: INSERT SELLER");
	
	Seller a1 = new Seller( 4, "gregorio","greg@gmail.com",new Date(), 4000.0, dep);
	sellerDao.insert(a1);
	System.out.println("Inserted" + a1.getId()); */
	
	
	
	
	
	System.out.println("#######TESTE NUMERO 5: UPDATE SELLER");
	
	 seller = sellerDao.findById(1);
	 seller.setName("Martha suplicy");
	 sellerDao.update(seller);
	 
	 System.out.println("updated");	
	
	 
		
		System.out.println("#######TESTE NUMERO 6: DELETE SELLER");
		
		sellerDao.deleteById(10);
		
		
		 System.out.println("DELETED!");	
	
	
	}

}

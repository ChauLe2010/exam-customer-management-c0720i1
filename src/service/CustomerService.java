package service;

import model.Customer;
import service.IService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomerService implements IService<Customer> {
    static List<Customer> customers;
    static {
        customers=new ArrayList<>();
        customers.add(new Customer(1L,"The Anh","Ha Noi"));
        customers.add(new Customer(2L,"Quan","Ha Noi"));
        customers.add(new Customer(3L,"Khanh","Ha Noi"));
        customers.add(new Customer(4L,"Tuan Anh","Ha Noi"));
        customers.add(new Customer(5L,"The Anh","Ha Noi"));
    }
    @Override
    public void add(Customer object) {
        boolean flag=true;
        for(int i=0;i<customers.size();i++){
            if(object.getId()==customers.get(i).getId()){
                flag=false;
                break;
            }
        }
        if(flag)
            customers.add(object);

    }

    @Override
    public void update(Long id, Customer newObject) {
        for(int i=0;i<customers.size();i++){
            if(id==customers.get(i).getId()){
                customers.set(i,newObject);
            }
        }
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Customer findById(Long id) {
        return null;
    }

    @Override
    public List<Customer> findByName(String name) {
        return null;
    }

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList=new ArrayList<>();
        Iterator<Customer> iterator=customers.iterator();
        while(iterator.hasNext())
            customerList.add(iterator.next());

        return customerList;
    }
}

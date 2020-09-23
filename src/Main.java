import model.Customer;
import service.CustomerService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void display(List<Customer> customers){
        Iterator<Customer> iterator=customers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public static void main(String[] args) {

        CustomerService customerService=new CustomerService();

        System.out.println("=====FindAll====");
        List<Customer> customers=new ArrayList<>();
        customers=customerService.findAll();
        display(customers);

        System.out.println("=====Add model.Customer====");
        Customer addNew=new Customer(10L,"Hieu","Sai Gon");
        customerService.add(addNew);
        customers=customerService.findAll();
        display(customers);

        addNew=new Customer(1L,"The Anh","Ha Noi");
        customerService.add(addNew);
        customers=customerService.findAll();
        display(customers);

        System.out.println("=====Edit model.Customer====");
        System.out.println("Input id: ");
        Scanner sc=new Scanner(System.in);
        Long id=sc.nextLong();
        System.out.println("Name: ");
        sc.nextLine();
        String newName=sc.nextLine();
        System.out.println("Address: ");
        String newAddress=sc.nextLine();
        Customer editNew=new Customer(id,newName,newAddress);
        customerService.update(id,editNew);
        customers=customerService.findAll();
        display(customers);
        //Tự bổ sung tất cả các tính năng khác

    }
}

package com.company;

import com.company.model.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static List<User> listUser;
    public static Map<String, Stock> listStock;
    public static List<Company> listCompany;
    public static Set<Trader> LoggedInlistTrader;   //Trader đang đăng nhập
    public static Map<String,Trader> listRegisterTrader;    //Đăng ký trader

    public static  Map<Stock, List<PriorityQueue<Order>>> hd;

    public static List<PriorityQueue<Order>> a;
    public static PriorityQueue<Order> a1;
    public static PriorityQueue<Order> a12;


    public static void main(String[] args) throws ParseException {

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        listUser = new ArrayList<>();
        listUser.add(new User("1","kaka","abc@gmail.com","01222222"));
        listUser.add(new User("2","haha","ab1c@gmail.com","0122212222"));


        listStock = new HashMap<>();
        listStock.put("Key-ST1",new Stock("ST1","FPT",100,10000,"1"));
        listStock.put("Key-ST2",new Stock("ST2","FLC",3232,32000,"2"));
        listStock.put("Key-ST3",new Stock("ST3","VIN",434,11200,"3"));
        listStock.put("Key-ST4",new Stock("ST4","TH",12,33300,"4"));

        listCompany = new ArrayList<>();
        listCompany.add(new Company("1","Công ty FPT","Hà nội","12122121"));
        listCompany.add(new Company("2","Công ty cổ phần FLC","Hà nội","231312"));
        listCompany.add(new Company("3","Công ty VinGroup","Hà nội","12122121"));
        listCompany.add(new Company("4","Công ty TH True Milk","Hà nội","12122121"));
        listCompany.add(new Company("5","Công ty Đông Á","Hà nội","12122121"));

        Map<Stock,Integer> s = new HashMap<>();
        s.put(new Stock("ST1","FPT",100,10000,"1"),23);
        LoggedInlistTrader = new TreeSet<>();
        LoggedInlistTrader.add(new Trader("101","Nguyễn Văn A","aa@","01212",2,"khanh","Hà nội",s));

        listRegisterTrader = new TreeMap<>();
        listRegisterTrader.put("Key-101",new Trader("101","Nguyễn Văn A","aa@","01212",2,"khanh","Hà nội",s));


        a1 = new PriorityQueue<>();
        a12 = new PriorityQueue<>();
        a1.add(new Order(1,2,"a",dateFormat.parse("2022-6-25"),21,32,true));
        a12.add(new Order(1,2,"a",dateFormat.parse("2022-6-25"),21,32,true));
        a.add(a1);
        a.add(a12);

        hd = new HashMap<>();
        Stock stock = new Stock("ST1","FPT",100,10000,"1");
        hd.put(stock,a);

        Admin();
        //fun_Trader();
    }
    public static void UiTrader(int idTrader){

    }
    public static void LoginTrader(){

    }
    public static void RegisterTrader(){

    }
    public static void fun_Trader(){
        System.out.println("1. Register \n2. Login\nBạn muốn chọn (1 or 2) :");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i==1){
            RegisterTrader();
        } else if (i==2) {
            LoginTrader();
        }
    }
    public static void Admin(){
        //Quản lý người dùng
        //show danh sách người dùng
        System.out.println("1.Show danh sách User");
        for (User user : listUser)
            System.out.println(user);

        //Quản lý cổ phiếu niêm yết trên sàn
        //show các cổ phiếu
        System.out.println("2.1.Show các cổ phiếu niêm yết trên sàn :");
        for (Stock lst : listStock.values())
            System.out.println(lst);
        //thêm cổ phiếu mới
        System.out.println("2.2.Thêm cổ phiếu mới");
        Stock stock_new = new Stock("ST1","FPT",100,10000,"1");
        listStock.put("Key-ST5",stock_new);
        System.out.println("Thêm thành công");
        //Xóa cổ phiếu
        System.out.println("2.3.Xóa cổ phiếu");
        //
        listStock.remove("Key-ST5");
        System.out.println("Xóa thành công");

        //Quản lý doanh nghiệp có cổ phiếu niêm yết trên sàn
        //show danh sách conmpany
        System.out.println("3.1.Danh sách doanh nghiệp có cổ phiếu niêm yết trên sàn :");
        for (Company company: listCompany){
            System.out.print("Cổ phiếu của "+company.getName()+" là : ");
            for (Stock stock: listStock.values()){
                if (stock.getIdCompany() == company.getIdCompany()){
                    System.out.println(stock.getName()+", ");
                }
            }
        }
        System.out.println("4.Danh sách người buôn");
        //Quản lý người buôn
        //show danh sách người buôn
        for (Trader trader : listRegisterTrader.values())
            System.out.println(trader);
        //Các thao tác thống kê

    }
}

//bán sắp xếp theo giá từ thấp đến cao
class CustomComparatorBan implements Comparator<Order>{
    @Override
    public int compare(Order o1, Order o2) {
        int value = o1.getPrice().compareTo(o2.getPrice());
        if (value>0)
            return -1;
        else if (value<0)
            return 1;
        else
            return 0;
    }
}
//giá mua sắp xếp từ cao đến thấp
class CustomComparatorMua implements Comparator<Order>{
    @Override
    public int compare(Order o1, Order o2) {
        int value = o1.getPrice().compareTo(o2.getPrice());
        if (value<0)
            return -1;
        else if (value>0)
            return 1;
        else
            return 0;
    }
}

package edu.javacourse.studentorder;

import edu.javacourse.studentorder.dao.StudentOrderDaoImpl;
import edu.javacourse.studentorder.dao.StudentOrderDao;
import edu.javacourse.studentorder.domain.*;

import java.time.LocalDate;
import java.util.List;

public class SaveStudentOrder {
    public static void main(String[] args) throws Exception {

//        List<Street> d = new DictionaryDaoImp().findStreet("про");
//        for (Street s : d) {
//            System.out.println(s.getStreetName());
//        }
//        List<PassportOffice> po = new DictionaryDaoImp().findPassportOffice("010020000000");
//        for (PassportOffice p : po) {
//            System.out.println(p.getOfficeName());
//        }
//        List<RegisterOffice> ro = new DictionaryDaoImp().findRegisterOffice("010010000000");
//        for (RegisterOffice r : ro) {
//            System.out.println(r.getOfficeName());
//        }
//

//        StudentOrder s = buildStudentOrder(10);
        StudentOrderDao studentOrderDao = new StudentOrderDaoImpl();
//        Long id = studentOrderDao.saveStudentOrder(s);
//         System.out.println(id);

        List<StudentOrder> soList = studentOrderDao.getStudentOrders();
        for (StudentOrder so : soList) {
            System.out.println(so.getStudentOrderId());
        }

//         StudentOrder so = new StudentOrder();
//          long ans = saveStudentOrder(so);
//          System.out.println(ans);


    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder ");
        return answer;
    }


}

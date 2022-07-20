package com.cg.freelanceapp.TestBackend;

import com.cg.freelanceapp.dto.FreelancerDTO;
import com.cg.freelanceapp.dto.RecruiterDTO;
import com.cg.freelanceapp.entities.Admin;
import com.cg.freelanceapp.service.IRecruiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")
public class Test {
    @Autowired
    IRecruiterService recruiterService;
    @RequestMapping("/")
        public void index()
        {
            AdminTester adminTester = new AdminTester(recruiterService);
            adminTester.insertTestData();
        }

    }

    class AdminTester   {

        @Autowired
        IRecruiterService recruiterService;
        List admins = new ArrayList<Admin>();
        @Autowired
        public AdminTester(IRecruiterService recruiterService) {
            this.recruiterService = recruiterService;
        }

        public void insertTestData() {
            //
            String admin1[] ={"john11","john","doe","johndoe@gmail.com","9873627636","john1234"};
            String admin2[] ={"mark304","mark","zuckerberg","markzuckerburg@gmail.com","9774876376483","mark54551234"};
            String admin3[] ={"yordi232","yordanos","damtew","yordanosdamtew@gmail.com","0913972338","yorsi1990"};
            String admin4[] ={"abbu12","abbu","sahrber","abbusharbe@gmail.com","67465736473","abbu1234"};
            String admin5[] ={"chombe32","chombe","abdella","chombeabdella@gmail.com","76898378738","chombe6653"};
            String admin6[] ={"john121","john","doe","johndoe56@gmail.com","987362667636","john17834"};
            //

            List data = new ArrayList();

            data.add(admin1);
            data.add(admin2);
            data.add(admin3);
            data.add(admin4);
            data.add(admin5);
            data.add(admin6);

            data.forEach(e->
            {
                String d[] =(String[])e;
                RecruiterDTO freelancerDTO = new RecruiterDTO(d[0],d[1],d[2],d[3],d[4],d[5]);
                recruiterService.save(freelancerDTO);
                System.out.println("freelancer added");
            });




//            admins.add(admin);
//            admins.add(admin1);
//            admins.add(admin2);

//
//                adminServiceImp.add_admin(admin);
//                System.out.println("One Row Inserted...");

        }

//        public void retrieveTestData() {
//            List adminList = new ArrayList<Admin>() ;
//            adminService.findAll().forEach(e->
//            {
//                Admin admin = (Admin)e;
//                adminList.add(admin);
//            });
//
//            displayList(adminList);
//
//        }

        private void displayList(List adminList) {
            adminList.forEach(e->
            {
                //------------------------------------------------------------------------------------------------------
                Admin admin = (Admin)e;
                System.out.println("_______________________________");
                System.out.println("id:"+admin.getId());
                System.out.println("firstname:"+admin.getFirstName());
                System.out.println("lastename:"+admin.getLastName());
                System.out.println("email:"+admin.getEmailAddress());
                System.out.println("phone:"+admin.getPhoneNumber());
                System.out.println("password:"+admin.getPassword());
                System.out.println("_______________________________");
                //------------------------------------------------------------------------------------------------------
            });
        }
//
//        @Override
//        public void updateTestData() {
//
//        }
//    }
//
//    //customer testing
//    class CustomerTester
//
//        implements Tester {
//
//            @Override
//            public void initTest() {
//
//            }
//
//            @Override
//            public void insertTestData() {
//
//            }
//
//            @Override
//            public void retrieveTestData() {
//
//            }
//
//            @Override
//            public void updateTestData() {
//
//            }
//
//    }
//
//
//    class FreelancerTester  implements Tester {
//
//        @Override
//        public void initTest() {
//
//        }
//
//        @Override
//        public void insertTestData() {
//
//        }
//
//        @Override
//        public void retrieveTestData() {
//
//        }
//
//        @Override
//        public void updateTestData() {
//
//        }
//
//    }
//
//
//    class SkillTester implements Tester {
//
//        @Override
//        public void initTest() {
//
//        }
//
//        @Override
//        public void insertTestData() {
//
//        }
//
//        @Override
//        public void retrieveTestData() {
//
//        }
//
//        @Override
//        public void updateTestData() {
//
//        }
//
//    }
//
//
//    class FeedbackTest implements Tester {
//
//        @Override
//        public void initTest() {
//
//        }
//
//        @Override
//        public void insertTestData() {
//
//        }
//
//        @Override
//        public void retrieveTestData() {
//
//        }
//
//        @Override
//        public void updateTestData() {
//
//        }
//
//    }
//
//
//    class JobTester implements Tester {
//
//        @Override
//        public void initTest() {
//
//        }
//
//        @Override
//        public void insertTestData() {
//
//        }
//
//        @Override
//        public void retrieveTestData() {
//
//        }
//
//        @Override
//        public void updateTestData() {
//
//        }
//
  }

    class JobApplicationTester{

    }




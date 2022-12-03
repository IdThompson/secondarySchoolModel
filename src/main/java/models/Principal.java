package models;

import Enums.Role;
import Interface.PrincipalResponsibilities;

public class Principal extends Staff implements PrincipalResponsibilities {

    private static Principal singleInstance = new Principal();

    private Principal() {
        super("Mr babalola","ATS101","Phd",Role.PRINCIPAL);
    }


    public static Principal getSingleInstance() {
        if (singleInstance == null) {
            singleInstance = new Principal();

        }
        return singleInstance;
    }


    @Override
    public String admitApplicant(Applicant applicant, Principal principal) {
        if(principal.getPosition() == Role.PRINCIPAL){
            if(applicant.getAge() > 10 && applicant.getAge() < 20){
                applicant.setAdmitted(true);
                boolean admissionStatus = applicant.isAdmitted();
                System.out.println ( "Dear " +  applicant.getName() + (" Your admission status is "+ admissionStatus));
              return   "Congratulations you have been admitted " +  applicant.getName();
            } else{
                 return  "Sorry Not Admitted";
            }
        } else {
             return "You are not a principal";
        }
    }

    @Override
    public String expelStudent(Principal principal, Student student) {
        if (principal.getPosition() == Role.PRINCIPAL) {
            if (student.getGrade() == 'F') {
                return  "You have been expelled";
            } else {
                return  "Not expelled";
            }
        } else {
            return  "You are not a principal";
        }
    }
}



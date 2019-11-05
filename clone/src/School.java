public class School {
    public static void main(String[] args) throws Exception {
        StudentDetail  studentDetail=new StudentDetail("dinesh",26,"iblur","mohan lal");
        ParentsDetails parentsDetails=new ParentsDetails("father1","mother1");
        studentDetail.setParentsDetails(parentsDetails);


        System.out.println("before clone name "+studentDetail.getName());
        StudentDetail studentDetail2=studentDetail.clone();
        studentDetail2.setName("rakesh");
        ParentsDetails parentsDetails2=new ParentsDetails("abcc","gghhh");
        //studentDetail.setParentsDetails(parentsDetails);
        studentDetail.getParentsDetails().setFatherName("aaaaa");

        System.out.println("student 1 "+studentDetail.getName());
        System.out.println("student 2 "+studentDetail2.getName());
    }
}
